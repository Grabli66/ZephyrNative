package com.example.app;

/**
 *  View controller
 */
class Controller {    

    @:allow(com.example.app.AppContext)
    @:noCompletion
    var context : AppContext;

    /**
     *  On enter
     */
    public function onEnter () : Void {}

    /**
     *  On leave
     */
    public function onLeave () : Void {}

    /**
     *  Process back button
     */
    public function onBack() : Void {}

    /**
     *  Show page
     *  @param page - 
     */
    public function setPage (page : Page) {
        context.setView (page.render ());
    }
}