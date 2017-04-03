package com.example.app;

class AppContext {

    /**
     *  Owner activity
     */
    var owner : ZephyrApp;

    /**
     *  Controllers
     */
    var controllers : Map<String, Controller>; 

    /**
     *  Current controller
     */
    var currentController : Controller;

    /**
     *  Constructor
     */
    public function new (owner : ZephyrApp) {
        this.owner = owner;
        controllers = new Map<String, Controller> ();
    }

    /**
     *  Register controller
     *  @param cls - 
     */
    public function registerController (cls : Class<Controller>) : Void {        
        var controllerName = Type.getClassName (cls);
        var controller : Controller = cast Type.createInstance (cls, []);  
        controller.context = this;      
        controllers[controllerName] = controller;
    }

    /**
     *  Navigate to controller
     *  @param cls - controller class
     */
    public function navigate (cls : Class<Controller>) : Void {
        var name = Type.getClassName (cls);        
        var controller = controllers[name];
        if (currentController != null) currentController.onLeave ();
        controller.onEnter ();
        currentController = controller;
    }

    /**
     *  Set view
     *  @param view - 
     */
    public function setView (view : Tag) : Void {
        var view = view.render (owner);
        owner.setContentView (view);
    }
}