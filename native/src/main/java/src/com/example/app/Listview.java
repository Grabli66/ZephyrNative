// Generated by Haxe 3.4.2
package com.example.app;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Listview<T> extends com.example.app.Tag
{
	public Listview(haxe.lang.EmptyObject empty)
	{
		//line 57 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
		super(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
	}
	
	
	public Listview(java.lang.Object options)
	{
		//line 67 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
		super(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
		//line 67 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
		com.example.app.Listview.__hx_ctor_com_example_app_Listview(((com.example.app.Listview<T>) (this) ), ((java.lang.Object) (options) ));
	}
	
	
	public static <T_c> void __hx_ctor_com_example_app_Listview(com.example.app.Listview<T_c> __hx_this, java.lang.Object options)
	{
		//line 67 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
		com.example.app.Tag.__hx_ctor_com_example_app_Tag(__hx_this, null);
		//line 68 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
		__hx_this.options = options;
	}
	
	
	public java.lang.Object options;
	
	@Override public android.view.View render(android.content.Context context)
	{
		//line 77 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
		android.widget.ListView listview = new android.widget.ListView(context);
		//line 78 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
		android.widget.LinearLayout.LayoutParams params = new android.widget.LinearLayout.LayoutParams(((int) (-1) ), ((int) (-1) ));
		//line 79 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
		params.weight = ((float) (1) );
		//line 80 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
		listview.setLayoutParams(((android.view.ViewGroup.LayoutParams) (params) ));
		//line 82 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
		if (( ! (( this.options == null )) )) 
		{
			//line 83 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
			com.example.app.ListViewAdapter<T> adapter = new com.example.app.ListViewAdapter<T>(this.options, context);
			//line 84 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
			listview.setAdapter(((android.widget.ListAdapter) (adapter) ));
		}
		
		//line 87 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
		return listview;
	}
	
	
	@Override public double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		//line 57 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
		{
			//line 57 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
			boolean __temp_executeDef1 = true;
			//line 57 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
			switch (field.hashCode())
			{
				case -1249474914:
				{
					//line 57 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
					if (field.equals("options")) 
					{
						//line 57 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
						__temp_executeDef1 = false;
						//line 57 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
						this.options = ((java.lang.Object) (value) );
						//line 57 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
						return value;
					}
					
					//line 57 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
					break;
				}
				
				
			}
			
			//line 57 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
			if (__temp_executeDef1) 
			{
				//line 57 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
				return super.__hx_setField_f(field, value, handleProperties);
			}
			else
			{
				//line 57 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 57 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
		{
			//line 57 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
			boolean __temp_executeDef1 = true;
			//line 57 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
			switch (field.hashCode())
			{
				case -1249474914:
				{
					//line 57 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
					if (field.equals("options")) 
					{
						//line 57 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
						__temp_executeDef1 = false;
						//line 57 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
						this.options = ((java.lang.Object) (value) );
						//line 57 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
						return value;
					}
					
					//line 57 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
					break;
				}
				
				
			}
			
			//line 57 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
			if (__temp_executeDef1) 
			{
				//line 57 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 57 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 57 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
		{
			//line 57 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
			boolean __temp_executeDef1 = true;
			//line 57 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
			switch (field.hashCode())
			{
				case -934592106:
				{
					//line 57 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
					if (field.equals("render")) 
					{
						//line 57 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
						__temp_executeDef1 = false;
						//line 57 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "render")) );
					}
					
					//line 57 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
					break;
				}
				
				
				case -1249474914:
				{
					//line 57 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
					if (field.equals("options")) 
					{
						//line 57 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
						__temp_executeDef1 = false;
						//line 57 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
						return this.options;
					}
					
					//line 57 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
					break;
				}
				
				
			}
			
			//line 57 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
			if (__temp_executeDef1) 
			{
				//line 57 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 57 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public double __hx_getField_f(java.lang.String field, boolean throwErrors, boolean handleProperties)
	{
		//line 57 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
		{
			//line 57 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
			boolean __temp_executeDef1 = true;
			//line 57 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
			switch (field.hashCode())
			{
				case -1249474914:
				{
					//line 57 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
					if (field.equals("options")) 
					{
						//line 57 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
						__temp_executeDef1 = false;
						//line 57 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
						return ((double) (haxe.lang.Runtime.toDouble(this.options)) );
					}
					
					//line 57 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
					break;
				}
				
				
			}
			
			//line 57 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
			if (__temp_executeDef1) 
			{
				//line 57 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
				return super.__hx_getField_f(field, throwErrors, handleProperties);
			}
			else
			{
				//line 57 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 57 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
		baseArr.push("options");
		//line 57 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
		super.__hx_getFields(baseArr);
	}
	
	
}


