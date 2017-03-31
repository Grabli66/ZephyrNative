package com.example.app;

import com.example.app.TagBuilder.*;

@:keep
class Main extends ZephyrApp {

    override public function render () : Page {
        return page ([
            toolbar (),
            listview ({
                dataSource : ["Item 1", "Item 2", "Item 3", "Item 4"],
                renderItem : function (e) {
                    return imagebutton ();
                }
            })
        ]);
    }
}