// Generated by Haxe 3.4.2
package com.example.app;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Textview extends com.example.app.Tag
{
	public Textview(haxe.lang.EmptyObject empty)
	{
		//line 28 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Textview.hx"
		super(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
	}
	
	
	public Textview(java.lang.Object options)
	{
		//line 33 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Textview.hx"
		super(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
		//line 33 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Textview.hx"
		com.example.app.Textview.__hx_ctor_com_example_app_Textview(this, options);
	}
	
	
	public static void __hx_ctor_com_example_app_Textview(com.example.app.Textview __hx_this, java.lang.Object options)
	{
		//line 33 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Textview.hx"
		com.example.app.Tag.__hx_ctor_com_example_app_Tag(__hx_this, null);
		//line 34 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Textview.hx"
		__hx_this.options = options;
	}
	
	
	public java.lang.Object options;
	
	@Override public android.view.View render(android.content.Context context)
	{
		//line 38 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Textview.hx"
		android.widget.TextView textView = new android.widget.TextView(context);
		//line 39 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Textview.hx"
		textView.setText(haxe.lang.Runtime.toString(haxe.lang.Runtime.getField(this.options, "text", true)));
		//line 40 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Textview.hx"
		return textView;
	}
	
	
	@Override public double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		//line 28 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Textview.hx"
		{
			//line 28 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Textview.hx"
			boolean __temp_executeDef1 = true;
			//line 28 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Textview.hx"
			switch (field.hashCode())
			{
				case -1249474914:
				{
					//line 28 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Textview.hx"
					if (field.equals("options")) 
					{
						//line 28 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Textview.hx"
						__temp_executeDef1 = false;
						//line 28 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Textview.hx"
						this.options = ((java.lang.Object) (value) );
						//line 28 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Textview.hx"
						return value;
					}
					
					//line 28 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Textview.hx"
					break;
				}
				
				
			}
			
			//line 28 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Textview.hx"
			if (__temp_executeDef1) 
			{
				//line 28 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Textview.hx"
				return super.__hx_setField_f(field, value, handleProperties);
			}
			else
			{
				//line 28 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Textview.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 28 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Textview.hx"
		{
			//line 28 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Textview.hx"
			boolean __temp_executeDef1 = true;
			//line 28 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Textview.hx"
			switch (field.hashCode())
			{
				case -1249474914:
				{
					//line 28 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Textview.hx"
					if (field.equals("options")) 
					{
						//line 28 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Textview.hx"
						__temp_executeDef1 = false;
						//line 28 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Textview.hx"
						this.options = ((java.lang.Object) (value) );
						//line 28 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Textview.hx"
						return value;
					}
					
					//line 28 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Textview.hx"
					break;
				}
				
				
			}
			
			//line 28 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Textview.hx"
			if (__temp_executeDef1) 
			{
				//line 28 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Textview.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 28 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Textview.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 28 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Textview.hx"
		{
			//line 28 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Textview.hx"
			boolean __temp_executeDef1 = true;
			//line 28 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Textview.hx"
			switch (field.hashCode())
			{
				case -934592106:
				{
					//line 28 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Textview.hx"
					if (field.equals("render")) 
					{
						//line 28 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Textview.hx"
						__temp_executeDef1 = false;
						//line 28 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Textview.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "render")) );
					}
					
					//line 28 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Textview.hx"
					break;
				}
				
				
				case -1249474914:
				{
					//line 28 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Textview.hx"
					if (field.equals("options")) 
					{
						//line 28 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Textview.hx"
						__temp_executeDef1 = false;
						//line 28 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Textview.hx"
						return this.options;
					}
					
					//line 28 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Textview.hx"
					break;
				}
				
				
			}
			
			//line 28 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Textview.hx"
			if (__temp_executeDef1) 
			{
				//line 28 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Textview.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 28 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Textview.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public double __hx_getField_f(java.lang.String field, boolean throwErrors, boolean handleProperties)
	{
		//line 28 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Textview.hx"
		{
			//line 28 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Textview.hx"
			boolean __temp_executeDef1 = true;
			//line 28 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Textview.hx"
			switch (field.hashCode())
			{
				case -1249474914:
				{
					//line 28 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Textview.hx"
					if (field.equals("options")) 
					{
						//line 28 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Textview.hx"
						__temp_executeDef1 = false;
						//line 28 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Textview.hx"
						return ((double) (haxe.lang.Runtime.toDouble(this.options)) );
					}
					
					//line 28 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Textview.hx"
					break;
				}
				
				
			}
			
			//line 28 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Textview.hx"
			if (__temp_executeDef1) 
			{
				//line 28 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Textview.hx"
				return super.__hx_getField_f(field, throwErrors, handleProperties);
			}
			else
			{
				//line 28 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Textview.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 28 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Textview.hx"
		baseArr.push("options");
		//line 28 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Textview.hx"
		super.__hx_getFields(baseArr);
	}
	
	
}


