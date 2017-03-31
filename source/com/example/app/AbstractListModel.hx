package com.example.app;

@:forward
abstract AbstractListModel<T>(ListModel<T>) from ListModel<T> to ListModel<T> {

    public function new (data : ListModel<T>) {
        this = data;
    }

    @:from public static function fromArray<T> (array : Array<T>) : AbstractListModel<T> {
        return new ListModel (array);
    }

    @:arrayAccess
    public inline function getItem(key : Int) : T {
        return this.get(key);
    }
}