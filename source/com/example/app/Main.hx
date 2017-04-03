package com.example.app;

@:keep
class Main implements IApplication  {    

    public function onReady (context : AppContext) : Void {
        context.registerController (MainController);
        context.registerController (SecondController);

        context.navigate (MainController);

        /*App.registerPage (MainPage);        
        App.registerPage (AnotherPage);
        App.navigate (MainPage);*/
    }
}