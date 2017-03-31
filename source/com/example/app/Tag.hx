package com.example.app;

import android.view.View;
import android.content.Context;

class Tag {

     var childs : Array<Tag>;

     /**
      *  Render childrens
      */
     function renderChilds (context : Context) : Array<View> {
        if (childs == null) return [];
        return [for (i in childs) i.render (context)];
     }

     /**
      *  Constructor
      *  @param tags - 
      */
     public function new (?tags : Array<Tag>) {
         childs = tags;
     }

    /**
     *  Render tag to android view
     *  @return View
     */
    public function render (context : Context) : View {
        return null;
    }
}