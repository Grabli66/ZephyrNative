// Generated by Haxe 3.4.2
package com.example.app;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class TagBuilder extends haxe.lang.HxObject
{
	public TagBuilder(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public TagBuilder()
	{
		//line 3 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/TagBuilder.hx"
		com.example.app.TagBuilder.__hx_ctor_com_example_app_TagBuilder(this);
	}
	
	
	public static void __hx_ctor_com_example_app_TagBuilder(com.example.app.TagBuilder __hx_this)
	{
	}
	
	
	public static com.example.app.VBox vbox(haxe.root.Array<com.example.app.Tag> childs)
	{
		//line 6 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/TagBuilder.hx"
		return new com.example.app.VBox(((haxe.root.Array<com.example.app.Tag>) (childs) ));
	}
	
	
	public static com.example.app.Toolbar toolbar(haxe.root.Array<com.example.app.Tag> childs)
	{
		//line 10 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/TagBuilder.hx"
		return new com.example.app.Toolbar(((haxe.root.Array<com.example.app.Tag>) (childs) ));
	}
	
	
	public static <T> com.example.app.Listview<T> listview(java.lang.Object options)
	{
		//line 14 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/TagBuilder.hx"
		return new com.example.app.Listview<T>(((java.lang.Object) (options) ));
	}
	
	
	public static com.example.app.Textview textview(java.lang.Object options)
	{
		//line 22 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/TagBuilder.hx"
		return new com.example.app.Textview(((java.lang.Object) (options) ));
	}
	
	
}


