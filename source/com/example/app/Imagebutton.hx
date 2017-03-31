package com.example.app;

import android.view.View;
import android.content.Context;
import android.widget.ListView;
import android.widget.LinearLayout.LinearLayout_LayoutParams;
import android.widget.ArrayAdapter;
import android.R.R_layout.simple_list_item_1;
import java.util.ArrayList;
import android.widget.ImageButton;
import android.graphics.drawable.ColorDrawable;

using com.example.app.ContextHelper;

/**
 *  Image view
 */
class Imagebutton extends Tag {

    public function new () {
        super (null);
    }

    override public function render (context : Context) : View {
        var color = new ColorDrawable (0xff3d4f00);
        var imageButton = new ImageButton (context);
        imageButton.setBackground(color);
        return imageButton;
    }
}