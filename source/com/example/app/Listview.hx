package com.example.app;

import android.view.View;
import android.view.ViewGroup;
import android.content.Context;
import android.widget.ListView;
import android.widget.LinearLayout.LinearLayout_LayoutParams;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import java.util.ArrayList;

/**
 *  List view adapter
 */
class ListViewAdapter<T> extends BaseAdapter {

    var context : Context;

    var options : ListViewOptions<T>;

    public function new (options : ListViewOptions<T>, context : Context) {
        super();
        this.context = context;
        this.options = options;
    }
    
    @:overload
    override public function getCount() : Int {
        trace (options.dataSource.length);
        return options.dataSource.length;
    }
    
    @:overload
    override public function getItem(position : Int) : T {
        return options.dataSource.get(position);
    }

    @:overload
    override public function getItemId(position : Int) : haxe.Int64 {
        return position;
    }

    /**
     *  Get view
     */    
    @:overload
    override public function getView(position : Int, convertView : View, parent : ViewGroup) : View {
        var data = options.dataSource[position];        
        var tag = options.renderItem (data);
        return tag.render (context);
    }
}

/**
 *  Listview
 */
class Listview<T> extends Tag {
    
    var options : Null<ListViewOptions<T>>;

    var adapter : ListViewAdapter<T>;

    /**
     *  Constructor
     */
    public function new (?options : ListViewOptions<T>) {        
        super (null);
        this.options = options;        
    }

    /**
     *  Render toolbar
     *  @param context - 
     *  @return View
     */
    override public function render (context : Context) : View {
        var listview = new ListView(context);
        var params = new LinearLayout_LayoutParams (-1,-1);
        params.weight = 1;
        listview.setLayoutParams (params);
        
        if (options != null) {
            var adapter = new ListViewAdapter (options, context);
            listview.setAdapter (adapter);
        }
        
        return listview;
     }
}