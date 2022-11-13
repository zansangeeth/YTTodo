package com.zasa.yttodo.ui.update

import android.os.Bundle
import android.text.TextUtils
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.zasa.yttodo.R
import com.zasa.yttodo.database.TaskEntry
import com.zasa.yttodo.databinding.FragmentUpdateBinding
import com.zasa.yttodo.viewmodel.TaskViewModel


class UpdateFragment : Fragment() {

    private val viewModel: TaskViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = FragmentUpdateBinding.inflate(inflater)

        val args = UpdateFragmentArgs.fromBundle(requireArguments())

        binding.apply {
            edtUpdateTask.setText(args.taskEntry.title)
            updateSpinner.setSelection(args.taskEntry.priority)

            btnUpdate.setOnClickListener {
                if (TextUtils.isEmpty(edtUpdateTask.text)){
                    Toast.makeText(requireContext(), "It's Empty!", Toast.LENGTH_SHORT).show()
                    return@setOnClickListener
                }

                val task_str = edtUpdateTask.text
                val priority = updateSpinner.selectedItemPosition

                val taskEntry = TaskEntry(
                    args.taskEntry.id,
                    task_str.toString(),
                    priority,
                    args.taskEntry.timeStamp
                )

                viewModel.update(taskEntry)
                Toast.makeText(requireContext(), "Updated, Successfully!", Toast.LENGTH_SHORT)
                    .show()
                findNavController().navigate(R.id.action_updateFragment_to_taskFragment)
            }
        }
        // Inflate the layout for this fragment
        return binding.root
    }

}