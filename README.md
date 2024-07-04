# Android-Architecture

In this Android Repo i will discuss about all the architecture with implementation 

1.
   What is MVC – Model View Controller?
   An MVC Pattern – stands for MODEL VIEW CONTROLLER, It is a Software Design Pattern, usually used in developing user interfaces.
   MVC Architecture pattern is a way how the information or data is been presented to the user & how the user interacts/deals with the data view.
   An MVC framework is nearly utilized in all development processes like Web development and portable application like android MVC and IOS MVC.

    It has 3 Components i.e. MODEL-VIEW-CONTROLLER.
  
    MODEL :
    Here Model is nothing but a data, it directly manages the data, logic and rules of the application.
    A Model is responsible for managing data of an app.
    
    VIEW : 
    A View in MVC is nothing but a UI design, How you can display the data to the USER screen.
    A view means presentation of the data in a particular format.
    
    CONTROLLER : 
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
  
 
