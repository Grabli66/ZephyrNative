// Generated by Haxe 3.4.2
package com.example.app;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Tag extends haxe.lang.HxObject
{
	public Tag(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public Tag(haxe.root.Array<com.example.app.Tag> tags)
	{
		//line 22 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Tag.hx"
		com.example.app.Tag.__hx_ctor_com_example_app_Tag(this, tags);
	}
	
	
	public static void __hx_ctor_com_example_app_Tag(com.example.app.Tag __hx_this, haxe.root.Array<com.example.app.Tag> tags)
	{
		//line 23 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Tag.hx"
		__hx_this.childs = tags;
	}
	
	
	public haxe.root.Array<com.example.app.Tag> childs;
	
	public haxe.root.Array<android.view.View> renderChilds(android.content.Context context)
	{
		//line 14 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Tag.hx"
		if (( this.childs == null )) 
		{
			//line 14 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Tag.hx"
			return new haxe.root.Array<android.view.View>(new android.view.View[]{});
		}
		
		//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Tag.hx"
		haxe.root.Array<android.view.View> _g = new haxe.root.Array<android.view.View>(new android.view.View[]{});
		//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Tag.hx"
		{
			//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Tag.hx"
			int _g1 = 0;
			//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Tag.hx"
			haxe.root.Array<com.example.app.Tag> _g2 = this.childs;
			//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Tag.hx"
			while (( _g1 < _g2.length ))
			{
				//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Tag.hx"
				com.example.app.Tag i = _g2.__get(_g1);
				//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Tag.hx"
				 ++ _g1;
				//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Tag.hx"
				_g.push(i.render(context));
			}
			
		}
		
		//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Tag.hx"
		return _g;
	}
	
	
	public android.view.View render(android.content.Context context)
	{
		//line 31 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Tag.hx"
		return null;
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 6 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Tag.hx"
		{
			//line 6 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Tag.hx"
			boolean __temp_executeDef1 = true;
			//line 6 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Tag.hx"
			switch (field.hashCode())
			{
				case -1361400105:
				{
					//line 6 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Tag.hx"
					if (field.equals("childs")) 
					{
						//line 6 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Tag.hx"
						__temp_executeDef1 = false;
						//line 6 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Tag.hx"
						this.childs = ((haxe.root.Array<com.example.app.Tag>) (value) );
						//line 6 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Tag.hx"
						return value;
					}
					
					//line 6 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Tag.hx"
					break;
				}
				
				
			}
			
			//line 6 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Tag.hx"
			if (__temp_executeDef1) 
			{
				//line 6 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Tag.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 6 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Tag.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 6 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Tag.hx"
		{
			//line 6 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Tag.hx"
			boolean __temp_executeDef1 = true;
			//line 6 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Tag.hx"
			switch (field.hashCode())
			{
				case -934592106:
				{
					//line 6 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Tag.hx"
					if (field.equals("render")) 
					{
						//line 6 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Tag.hx"
						__temp_executeDef1 = false;
						//line 6 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Tag.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "render")) );
					}
					
					//line 6 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Tag.hx"
					break;
				}
				
				
				case -1361400105:
				{
					//line 6 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Tag.hx"
					if (field.equals("childs")) 
					{
						//line 6 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Tag.hx"
						__temp_executeDef1 = false;
						//line 6 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Tag.hx"
						return this.childs;
					}
					
					//line 6 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Tag.hx"
					break;
				}
				
				
				case 272421901:
				{
					//line 6 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Tag.hx"
					if (field.equals("renderChilds")) 
					{
						//line 6 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Tag.hx"
						__temp_executeDef1 = false;
						//line 6 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Tag.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "renderChilds")) );
					}
					
					//line 6 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Tag.hx"
					break;
				}
				
				
			}
			
			//line 6 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Tag.hx"
			if (__temp_executeDef1) 
			{
				//line 6 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Tag.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 6 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Tag.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 6 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Tag.hx"
		{
			//line 6 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Tag.hx"
			boolean __temp_executeDef1 = true;
			//line 6 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Tag.hx"
			switch (field.hashCode())
			{
				case -934592106:
				{
					//line 6 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Tag.hx"
					if (field.equals("render")) 
					{
						//line 6 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Tag.hx"
						__temp_executeDef1 = false;
						//line 6 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Tag.hx"
						return this.render(((android.content.Context) (dynargs.__get(0)) ));
					}
					
					//line 6 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Tag.hx"
					break;
				}
				
				
				case 272421901:
				{
					//line 6 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Tag.hx"
					if (field.equals("renderChilds")) 
					{
						//line 6 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Tag.hx"
						__temp_executeDef1 = false;
						//line 6 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Tag.hx"
						return this.renderChilds(((android.content.Context) (dynargs.__get(0)) ));
					}
					
					//line 6 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Tag.hx"
					break;
				}
				
				
			}
			
			//line 6 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Tag.hx"
			if (__temp_executeDef1) 
			{
				//line 6 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Tag.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			else
			{
				//line 6 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Tag.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 6 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Tag.hx"
		baseArr.push("childs");
		//line 6 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Tag.hx"
		super.__hx_getFields(baseArr);
	}
	
	
}


