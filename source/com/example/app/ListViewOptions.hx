package com.example.app;

typedef ListViewOptions<T> = {
    var dataSource : AbstractListModel<T>;
    var renderItem : T -> Tag;
}