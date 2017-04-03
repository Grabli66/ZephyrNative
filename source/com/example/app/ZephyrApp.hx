
package com.example.app;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

@:keep
class ZephyrApp extends android.app.Activity {

    /**
     *  Entry point to user code
     */
    private static inline var MAIN_NAME = "com.example.app.Main";

    /**
     *  On activity create
     *  @param b - 
     */
    @:overload
    override function onCreate (b : Bundle) : Void {
        super.onCreate (b);        
        this.requestWindowFeature (Window.FEATURE_NO_TITLE);
        var cls = Type.resolveClass (ZephyrApp.MAIN_NAME);
        if (cls != null) {
            var inst : IApplication = cast Type.createEmptyInstance (cls);
            inst.onReady (new AppContext (this));
        }
    }            
}