# YT ToDo
 
Sangeeth Amirthanathan

**YT ToDo** is an App that will suggest daily meals with users preferenece (How much of calories they want to gain for a day ?)

Time spent: **3** day spent in total

## Android MVVM Architecture

MVVM stands for Model, View, ViewModel.

* [ ] Model: This holds the data of the application. It cannot directly talk to the View. Generally, it’s recommended to expose the data to the ViewModel through Observables.

* [ ] View: It represents the UI of the application devoid of any Application Logic. It observes the ViewModel.

* [ ] ViewModel: It acts as a link between the Model and the View. It’s responsible for transforming the data from the Model. It provides data streams to the View. It also uses hooks or callbacks to update the View. It’ll ask for the data from the Model.

The following flow illustrates the core MVVM Pattern.

![Part1 - Kotlin MVVM ToDoList - Libraries and TaskEntry for Room Database 1-15 screenshot](https://user-images.githubusercontent.com/42418189/201582989-744b0968-42d8-43b6-b5c8-617a1d5668d2.png)

## Functionality 

The following **required** functionality is completed:

* [ ] Activities
* [ ] Fragments
* [ ] View Holder
* [ ] View Lifecycle
* [ ] Fragment Navigations
* [ ] Data tranfer within Fragments
* [ ] Room
* [ ] Recycler View
* [ ] Coroutines

The following **extensions** are implemented:

* [ ] User can create the task
* [ ] User can update the task
* [ ] User can delete the task
* [ ] User can delete all tasks
* [ ] User can sort the task by priority


## Video Walkthrough

Here's a walkthrough of implemented user stories:

![20221114_121236](https://user-images.githubusercontent.com/42418189/201592925-63031138-8fcc-428d-bc76-b07ffde1760c.gif)

# Screenshots
Screen | All Tasks | Add Tasks | Update Tasks | Swipe Delete Tasks | Delete All |
--- | --- | --- | --- | --- | --- |
Images | ![Screenshot_20221114-115944](https://user-images.githubusercontent.com/42418189/201590774-c92c266f-98e2-4381-be9f-5fbea5899b61.png) | ![Screenshot_20221114-115648](https://user-images.githubusercontent.com/42418189/201590833-7a2e4afa-fb7d-4059-9503-71d24c83d567.png) | ![Screenshot_20221114-115703](https://user-images.githubusercontent.com/42418189/201590918-766a425d-b5cf-4690-9149-62390921accc.png) | ![Screenshot_20221114-115728](https://user-images.githubusercontent.com/42418189/201591082-3416af45-2377-44ea-b7c6-227f67aa5deb.png) | ![Screenshot_20221114-115748](https://user-images.githubusercontent.com/42418189/201591148-2095cc26-e433-4bbd-afe7-b7e90b72f5d7.png) |


Screen | Dark Mode | Light Mode |
--- | --- | --- |
Images | ![Screenshot_20221114-113736](https://user-images.githubusercontent.com/42418189/201589881-44995818-a692-45e4-999d-42ed793e688f.png) |![Screenshot_20221114-113743](https://user-images.githubusercontent.com/42418189/201589912-9e96fb9f-d60e-4878-9b0f-359e8ae51f4b.png) |

## Notes
Simple todo app that can add, delete, update the tasks 

Describe any challenges encountered while building the app.

* [ ] Navigating Fragments
* [ ] Passing data between Fragments
* [ ] Dealing with build.gradle
* [ ] Designing Application in XML
* [ ] Design UI
* [ ] Deal with Room Persistance database


## License

    Copyright 2022 Sangeeth Amirthanathan

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.





 
