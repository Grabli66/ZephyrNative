
package com.example.app;

import android.graphics.drawable.ColorDrawable;
import android.app.Activity;
import android.widget.TextView;
import android.os.Bundle;
import android.view.Window;

@:keep
class ZephyrApp extends android.app.Activity {

    @:overload
    public override function onCreate (b : Bundle) : Void {
        super.onCreate (b);
        this.requestWindowFeature (Window.FEATURE_NO_TITLE);
        var page = render ();
        setContentView (page.render (this));
    }

    /**
     *  Call on render
     *  Virtual
     */
    public function render () : Page {
        return null;
    }
}