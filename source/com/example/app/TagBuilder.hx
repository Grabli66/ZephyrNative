package com.example.app;

class TagBuilder {

    public static function vbox (?childs : Array<Tag>) : VBox {
        return new VBox (childs);
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

    public static function textview (options : TextViewOptions) : Textview {
        return new Textview (options);
    }
}