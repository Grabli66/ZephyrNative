package com.example.app;

import android.content.Context;
import com.example.app.TagBuilder.*;

@:keep
class SecondPage extends Page {    

    override public function render () : Tag {        
        return vbox ([
            toolbar (),
            listview ({
                dataSource : ["Item 7", "Item 8", "Item 9", "Item 10", "Item 11"],
                renderItem : function (e) {
                    return textview ({
                        text : e
                    });
                }
            })
        ]);
    }
}