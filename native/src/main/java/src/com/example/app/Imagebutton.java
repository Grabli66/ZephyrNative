// Generated by Haxe 3.4.2 (git build master @ 890f8c7)
package com.example.app;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Imagebutton extends com.example.app.Tag
{
	public Imagebutton(haxe.lang.EmptyObject empty)
	{
		//line 18 "d:\\Workspace\\Haxe\\tests\\TestAndroid\\AppWithGradleTemplate\\source\\com\\example\\app\\Imagebutton.hx"
		super(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public Imagebutton()
	{
		//line 21 "d:\\Workspace\\Haxe\\tests\\TestAndroid\\AppWithGradleTemplate\\source\\com\\example\\app\\Imagebutton.hx"
		super(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
		//line 21 "d:\\Workspace\\Haxe\\tests\\TestAndroid\\AppWithGradleTemplate\\source\\com\\example\\app\\Imagebutton.hx"
		com.example.app.Imagebutton.__hx_ctor_com_example_app_Imagebutton(this);
	}
	
	
	public static void __hx_ctor_com_example_app_Imagebutton(com.example.app.Imagebutton __hx_this)
	{
		//line 21 "d:\\Workspace\\Haxe\\tests\\TestAndroid\\AppWithGradleTemplate\\source\\com\\example\\app\\Imagebutton.hx"
		com.example.app.Tag.__hx_ctor_com_example_app_Tag(__hx_this, null);
	}
	
	
	@Override public android.view.View render(android.content.Context context)
	{
		//line 25 "d:\\Workspace\\Haxe\\tests\\TestAndroid\\AppWithGradleTemplate\\source\\com\\example\\app\\Imagebutton.hx"
		android.graphics.drawable.ColorDrawable color = new android.graphics.drawable.ColorDrawable(-12759296);
		//line 26 "d:\\Workspace\\Haxe\\tests\\TestAndroid\\AppWithGradleTemplate\\source\\com\\example\\app\\Imagebutton.hx"
		android.widget.ImageButton imageButton = new android.widget.ImageButton(context);
		//line 27 "d:\\Workspace\\Haxe\\tests\\TestAndroid\\AppWithGradleTemplate\\source\\com\\example\\app\\Imagebutton.hx"
		imageButton.setBackground(((android.graphics.drawable.Drawable) (color) ));
		//line 28 "d:\\Workspace\\Haxe\\tests\\TestAndroid\\AppWithGradleTemplate\\source\\com\\example\\app\\Imagebutton.hx"
		return imageButton;
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 18 "d:\\Workspace\\Haxe\\tests\\TestAndroid\\AppWithGradleTemplate\\source\\com\\example\\app\\Imagebutton.hx"
		{
			//line 18 "d:\\Workspace\\Haxe\\tests\\TestAndroid\\AppWithGradleTemplate\\source\\com\\example\\app\\Imagebutton.hx"
			boolean __temp_executeDef1 = true;
			//line 18 "d:\\Workspace\\Haxe\\tests\\TestAndroid\\AppWithGradleTemplate\\source\\com\\example\\app\\Imagebutton.hx"
			switch (field.hashCode())
			{
				case -934592106:
				{
					//line 18 "d:\\Workspace\\Haxe\\tests\\TestAndroid\\AppWithGradleTemplate\\source\\com\\example\\app\\Imagebutton.hx"
					if (field.equals("render")) 
					{
						//line 18 "d:\\Workspace\\Haxe\\tests\\TestAndroid\\AppWithGradleTemplate\\source\\com\\example\\app\\Imagebutton.hx"
						__temp_executeDef1 = false;
						//line 18 "d:\\Workspace\\Haxe\\tests\\TestAndroid\\AppWithGradleTemplate\\source\\com\\example\\app\\Imagebutton.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "render")) );
					}
					
					//line 18 "d:\\Workspace\\Haxe\\tests\\TestAndroid\\AppWithGradleTemplate\\source\\com\\example\\app\\Imagebutton.hx"
					break;
				}
				
				
			}
			
			//line 18 "d:\\Workspace\\Haxe\\tests\\TestAndroid\\AppWithGradleTemplate\\source\\com\\example\\app\\Imagebutton.hx"
			if (__temp_executeDef1) 
			{
				//line 18 "d:\\Workspace\\Haxe\\tests\\TestAndroid\\AppWithGradleTemplate\\source\\com\\example\\app\\Imagebutton.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 18 "d:\\Workspace\\Haxe\\tests\\TestAndroid\\AppWithGradleTemplate\\source\\com\\example\\app\\Imagebutton.hx"
				throw null;
			}
			
		}
		
	}
	
	
}


