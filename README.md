# Android-Architecture

In this Android Repo i will discuss about all the architecture with implementation 

1.
   What is MVC – Model View Controller?
   An MVC Pattern – stands for MODEL VIEW CONTROLLER, It is a Software Design Pattern, usually used in developing user interfaces.
   MVC Architecture pattern is a way how the information or data is been presented to the user & how the user interacts/deals with the data view.
   An MVC framework is nearly utilized in all development processes like Web development and portable application like android MVC and IOS MVC.

    It has 3 Components i.e. MODEL-VIEW-CONTROLLER.
  
    𝌭 MODEL :
    Here Model is nothing but a data, it directly manages the data, logic and rules of the application.
    A Model is responsible for managing data of an app.
    
    ⌗ VIEW : 
    A View in MVC is nothing but a UI design, How you can display the data to the USER screen.
    A view means presentation of the data in a particular format.
    
    🎮 CONTROLLER : 
    A Controller is typically a piece, which control all the task/event that a user perform, Such as event handling, navigation, Communication between model & view happens in controller in MVC.
    A Controller recieve the input, validate it, & pass the validated input to Model.


   <img src="https://github.com/rajupraaa1234/Android-Architecture-/assets/48593134/832010de-96f7-4197-99f7-71baeab2809e" width="400" height="500" />

   Explanation :
   

   In this repo i have implemented a simple example with login screen

   View : I have a LoginScreen in which user can interact with his/her user credential
  
   LoginController : Which is responsible for execute business logic
  
   Model (User) : User Model class which is responsible for storing/retriving user relateds data

   Once the user clicks on the Login button after entering their credentials, the view class will call ☎️ the controller, saying, "Hey, I have user credentials for login. Can you go to the model class, validate the 
   user, and get back to me with the response?" The controller will then request validation from the model class. Once the model returns the response, the controller will send the response back to the view, and the UI 
   will be updated accordingly.

   InShort : LoginScreen(View) -> LoginController -> UserModel -> LoginController -> LoginScreen

 
   😢 Drawback of MVC in Android Development

   Tight Coupling Between Components:
      
   In traditional MVC, the view and the controller can become tightly coupled. This makes the system less flexible and harder to maintain or test. Changes in the view may require changes in the controller and vice 
   versa. Difficult to Manage Complex UI Logic:
     
              Example : 
               Imagine you're building a simple app to display a user’s name.

               What Happens in MVC?
               In the Model-View-Controller (MVC) pattern on Android:
               
               Model: Holds the data (e.g., the user’s name).
               View: Displays the data on the screen (e.g., a TextView).
               Controller: Connects the Model and View (usually the Activity in Android).

               However, in Android MVC, the Activity often acts as both Controller and View. This makes the code tightly coupled.

   <img src="https://github.com/user-attachments/assets/8c9fdbb9-7c46-48b0-9acf-0ad953eaa692" width="600" height="500" />

               Why Is This a Problem?

               a. The Activity is responsible for fetching data (Model) and updating the UI (View).
               b. This creates a tightly coupled relationship because if you want to change the way data is fetched or displayed, you have to modify the Activity, which violates separation of concerns.

               Simpler Fix
               😊 Separate the Controller and View responsibilities:


   <img src="https://github.com/user-attachments/assets/104aac9a-173a-4d23-a924-00f94cb62b16" width="600" height="600" />


               
   Poor Separation of Concerns:
      
   MVC can sometimes lead to a poor separation of concerns, especially in Android where activities and fragments are responsible for both handling UI and business logic. This can make the code less modular and harder 
   to maintain.Testability Issues:
      
   Because the view and controller are tightly coupled, it can be difficult to write unit tests for the controller without also involving the view. This can lead to more reliance on integration tests, which are 
   typically harder to write and maintain.

   Lifecycle Management:
      
   Android has a complex lifecycle for activities and fragments. The MVC pattern does not inherently provide a way to manage this lifecycle, which can lead to issues with memory leaks, resource management, and 
   inconsistent states.

   Overuse of Activities/Fragments:

   In many MVC implementations in Android, activities and fragments are often overloaded with responsibilities, handling both UI logic and business logic. This can make them large, unwieldy, and difficult to manage.
   Limited Scalability:


3. MVVM - Model View Viewmodel

      <img src="https://github.com/rajupraaa1234/Android-Architecture-/assets/48593134/d00c2472-20d7-44f7-8765-3e58fa413f7f" width="400" height="500" />

      🧑🏽‍💻 Components of MVVM

         Model:

         Represents the data and business logic of the application.
         Handles data operations like fetching from a network or database.
         Provides data to the ViewModel.
   
         View:

         Represents the UI of the application.
         In Jetpack Compose, this is composed of composable functions.
         Observes data from the ViewModel and updates the UI accordingly.
   
         ViewModel:
         
         Acts as a bridge between the Model and the View.
         Manages the UI-related data and state.
         Communicates with the Model to fetch or update data and exposes it to the View.

         In the provided MVVM implementation with Jetpack Compose, the data flow and working can be explained through the interaction between the Model, ViewModel, and View components. Here’s a detailed explanation            of how each component interacts and how data flows through the application:


         🎮 Components and Data Flow
   
         Model (User and UserRepository):
         
         The User data class represents the structure of the user data.
         The UserRepository class simulates data fetching, such as retrieving user information from a network or a database.
         ViewModel (UserViewModel):
         
         The UserViewModel class extends ViewModel and manages UI-related data.
         It holds a MutableStateFlow<User?> named _user which is private. This is used to manage the state internally.
         It exposes a public StateFlow<User?> named user, which allows the UI to observe changes.
         The loadUser function fetches user data from the UserRepository and updates the _user state.
         View (UserScreen composable):
         
         The UserScreen composable function represents the UI.
         It uses the user state from the UserViewModel by calling userViewModel.user.collectAsState().
         The UI displays the user’s name if the user data is available, otherwise, it shows a "Loading..." message.
         A button triggers the loadUser function to fetch user data.


         👍 Initial State:

         When the UserScreen composable is first rendered, it observes the user state from the UserViewModel.
         Since the user state is initially null, the UI displays "Loading...".
         User Interaction:
         
         When the user clicks the "Load User" button, the onClick handler calls userViewModel.loadUser(1).
         Fetching Data:
         
         The loadUser function in UserViewModel is executed.
         Within loadUser, a coroutine is launched using viewModelScope.
         The UserRepository's getUser function is called to fetch the user data.
         Updating State:
         
         Once the user data is fetched, the _user state in the UserViewModel is updated with the new User object.
         The user state, which is a StateFlow, emits the updated user data.
         UI Update:
         
         The UserScreen composable function, which is observing the user state, receives the updated user data.
         The UI is recomposed with the new user data, displaying the user's name instead of the "Loading..." message.


4. Clean Code Architecture 

      💁 Why MVVM with Clean Architecture?
         MVVM separates your view (i.e. Activitys and Fragments) from your business logic. MVVM is enough for small projects, but when your codebase becomes huge, your ViewModels start bloating. Separating 
         responsibilities becomes hard.
         
         MVVM with Clean Architecture is pretty good in such cases. It goes one step further in separating the responsibilities of your code base. It clearly abstracts the logic of the actions that can be performed 
         in your app.

     😇 Advantages of Using Clean Architecture
         a. Your code is even more easily testable than with plain MVVM.
         b. Your code is further decoupled (the biggest advantage.)
         c. The package structure is even easier to navigate.
         d. The project is even easier to maintain.
         e. Your team can add new features even more quickly.

      Data Flow in Clean Code Acritecture
   
   <img width="724" alt="Screenshot 2024-07-07 at 5 15 19 PM" src="https://github.com/rajupraaa1234/Android-Architecture-/assets/48593134/9afcbd70-4c3b-4870-8ca0-5a2bfcd08889">


   <img width="724" height="682" alt="Screenshot 2026-01-05 at 2 45 13 PM" src="https://github.com/user-attachments/assets/cd7b5905-3c38-40ae-a7f0-a49ec2fbec93" />


   <img width="724" alt="Screenshot 2024-07-07 at 5 15 19 PM" src="https://github.com/rajupraaa1234/Android-Architecture-/assets/48593134/9044d3ec-8263-4c75-9c20-22dacff741bf">


         Our business logic is completely decoupled from our UI. It makes our code very easy to maintain and test.

     🫥  The Layers of MVVM with Clean Architecture
   
         The code is divided into three separate layers:
         
         1. Presentation Layer
         2. Domain Layer
         3. Data Layer


  😑 The Presentation Layer
   
      This includes our Activitys, Fragments, and ViewModels. An Activity should be as dumb as possible. Never put your business logic in Activitys.
      An Activity will talk to a ViewModel and a ViewModel will talk to the domain layer to perform actions. A ViewModel never talks to the data layer directly.

  😑 The Domain Layer
   
      The domain layer contains all the use cases of your application. In this example, we have UseCase, an abstract class. All our UseCases will extend this class.

  😑 The Data Layer
   
      This has all the repositories which the domain layer can use. This layer exposes a data source API to outside classes:


🤩 To check  the Implementation of Clean code architecture you can check in below repo 
 
  link: https://github.com/rajupraaa1234/NoteAppUsingJetPackCompose
   


           
     

  
 
