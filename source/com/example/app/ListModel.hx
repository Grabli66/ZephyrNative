package com.example.app;

class ListModel<T> {

    var items : Array<T>;

    public var length (get, never) : Int;
    public function get_length () : Int {
        return items.length;
    }

    public function new (?array : Array<T>) {        
        items = if (array != null) array else new Array<T> ();
    }

    public function iterator () : Iterator<T> {
        return items.iterator ();
    }   

    @:arrayAccess
    public inline function get(key : Int) : T {
        return items[key];
    } 
}