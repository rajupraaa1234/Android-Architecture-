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


2. MVVM - Model View Viewmodel  

  
     

  
 
