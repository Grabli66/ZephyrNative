package com.example.app;

class TagBuilder {

    public static function page (?childs : Array<Tag>) : Page {
        return new Page (childs);
    }

    public static function toolbar (?childs : Array<Tag>) : Toolbar {
        return new Toolbar (childs);
    }

    public static function listview<T> (?options : ListViewOptions<T>) : Listview<T> {
        return new Listview (options);
    }

    public static function imagebutton () : Imagebutton {
        return new Imagebutton ();
    }
}