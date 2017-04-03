package com.example.app;

import com.example.app.TagBuilder.*;

@:keep
class MainPage extends Page {

    override public function render () : Tag {        
        return vbox ([
            toolbar (),
            listview ({
                dataSource : ["Item 1", "Item 2", "Item 3", "Item 4", "Item 5"],
                renderItem : function (e) {
                    return textview ({
                        text : e
                    });
                }
            })
        ]);
    }
}