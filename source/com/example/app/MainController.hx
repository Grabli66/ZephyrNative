package com.example.app;

class MainController extends Controller {

    /**
     *  On enter
     */
    override public function onEnter () : Void {
        var page = new MainPage ();
        setPage (page);
    }

    /**
     *  On leave
     */
    override public function onLeave () : Void {

    }
}