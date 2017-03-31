package com.example.app;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LinearLayout_LayoutParams;
import android.content.Context;
import android.widget.ImageButton;
import android.widget.TextView;

using com.example.app.ContextHelper;

class OnClick implements View_OnClickListener {    

    public function new () {

    }

    public function onClick (view : View) {
        
    }
}

/**
 *  Toolbar
 */
class Toolbar extends Tag {
    
    /**
     *  Constructor
     */
    public function new (?tags : Array<Tag>) {
        super (tags);
    }

    /**
     *  Render toolbar
     *  @param context - 
     *  @return View
     */
    override public function render (context : Context) : View { 
        var layout =  new LinearLayout (context);        
        layout.setOrientation(LinearLayout.HORIZONTAL);
        layout.setWeightSum (1);
        var params = new LinearLayout_LayoutParams (-1,-2);
        params.height = context.dp (50);
        params.weight = 0;
        layout.setLayoutParams (params);
        var color = new ColorDrawable (0xff3d4fbc);
        layout.setBackground(color);

        var ims = context.getAssets().open("bars.png");        
        var bars = Drawable.createFromStream(ims, null);
        var ims = context.getAssets().open("map-marker.png");        
        var marker = Drawable.createFromStream(ims, null);
        var ims = context.getAssets().open("pencil.png");        
        var pencil = Drawable.createFromStream(ims, null);  

        color = new ColorDrawable (0x00000000);

        var imageButton = new ImageButton (context);
        params = new LinearLayout_LayoutParams (-2,-2);
        params.width = context.dp (30);
        params.height = context.dp (30);
        params.gravity = 17;
        params.weight = 0;
        params.leftMargin = context.dp (5);
        imageButton.setLayoutParams (params);        
        imageButton.setBackground(color);
        imageButton.setImageDrawable (bars);
        layout.addView (imageButton);

        var textView = new TextView (context); 
        textView.setGravity (17);        
        textView.setText ("Header bar");
        textView.setTextColor (0xFFFFFFFF);
        params = new LinearLayout_LayoutParams (-2,-2);
        params.gravity = 17;
        params.weight = 1;
        textView.setLayoutParams (params);
        layout.addView (textView);               

        imageButton = new ImageButton (context);
        params = new LinearLayout_LayoutParams (-2,-2);
        params.width = context.dp (30);
        params.height = context.dp (30);
        params.gravity = 17;
        params.weight = 0;
        params.leftMargin = context.dp (5);
        imageButton.setLayoutParams (params);
        imageButton.setBackground(color);
        imageButton.setImageDrawable (marker);        
        layout.addView (imageButton);

        imageButton = new ImageButton (context);
        params = new LinearLayout_LayoutParams (-2,-2);
        params.width = context.dp (30);
        params.height = context.dp (30);
        params.gravity = 17;
        params.weight = 0;
        params.rightMargin = context.dp (5);
        params.leftMargin = context.dp (5);
        imageButton.setLayoutParams (params);        
        imageButton.setBackground(color);
        imageButton.setImageDrawable (pencil);
        layout.addView (imageButton);

        return layout;
     }
}