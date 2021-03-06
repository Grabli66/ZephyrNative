// Generated by Haxe 3.4.2
package com.example.app;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class AppContext extends haxe.lang.HxObject
{
	public AppContext(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public AppContext(com.example.app.ZephyrApp owner)
	{
		//line 23 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/AppContext.hx"
		com.example.app.AppContext.__hx_ctor_com_example_app_AppContext(this, owner);
	}
	
	
	public static void __hx_ctor_com_example_app_AppContext(com.example.app.AppContext __hx_this, com.example.app.ZephyrApp owner)
	{
		//line 24 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/AppContext.hx"
		__hx_this.owner = owner;
		//line 25 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/AppContext.hx"
		__hx_this.controllers = new haxe.ds.StringMap<com.example.app.Controller>();
	}
	
	
	public com.example.app.ZephyrApp owner;
	
	public haxe.ds.StringMap<com.example.app.Controller> controllers;
	
	public com.example.app.Controller currentController;
	
	public void registerController(java.lang.Class cls)
	{
		//line 33 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/AppContext.hx"
		java.lang.String controllerName = haxe.root.Type.getClassName(cls);
		//line 34 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/AppContext.hx"
		com.example.app.Controller controller = ((com.example.app.Controller) (haxe.root.Type.createInstance(((java.lang.Class) (cls) ), ((haxe.root.Array) (new haxe.root.Array(new java.lang.Object[]{})) ))) );
		//line 35 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/AppContext.hx"
		controller.context = this;
		//line 36 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/AppContext.hx"
		((haxe.ds.StringMap<com.example.app.Controller>) (((haxe.IMap<java.lang.String, com.example.app.Controller>) (this.controllers) )) ).set(controllerName, controller);
	}
	
	
	public void navigate(java.lang.Class cls)
	{
		//line 44 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/AppContext.hx"
		java.lang.String name = haxe.root.Type.getClassName(cls);
		//line 45 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/AppContext.hx"
		com.example.app.Controller controller = ((com.example.app.Controller) (((haxe.ds.StringMap<com.example.app.Controller>) (((haxe.IMap<java.lang.String, com.example.app.Controller>) (this.controllers) )) ).get(name)) );
		//line 46 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/AppContext.hx"
		if (( this.currentController != null )) 
		{
			//line 46 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/AppContext.hx"
			this.currentController.onLeave();
		}
		
		//line 47 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/AppContext.hx"
		controller.onEnter();
		//line 48 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/AppContext.hx"
		this.currentController = controller;
	}
	
	
	public void setView(com.example.app.Tag view)
	{
		//line 56 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/AppContext.hx"
		android.view.View view1 = view.render(this.owner);
		//line 57 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/AppContext.hx"
		this.owner.setContentView(((android.view.View) (view1) ));
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 3 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/AppContext.hx"
		{
			//line 3 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/AppContext.hx"
			boolean __temp_executeDef1 = true;
			//line 3 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/AppContext.hx"
			switch (field.hashCode())
			{
				case 1582053877:
				{
					//line 3 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/AppContext.hx"
					if (field.equals("currentController")) 
					{
						//line 3 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/AppContext.hx"
						__temp_executeDef1 = false;
						//line 3 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/AppContext.hx"
						this.currentController = ((com.example.app.Controller) (value) );
						//line 3 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/AppContext.hx"
						return value;
					}
					
					//line 3 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/AppContext.hx"
					break;
				}
				
				
				case 106164915:
				{
					//line 3 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/AppContext.hx"
					if (field.equals("owner")) 
					{
						//line 3 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/AppContext.hx"
						__temp_executeDef1 = false;
						//line 3 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/AppContext.hx"
						this.owner = ((com.example.app.ZephyrApp) (value) );
						//line 3 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/AppContext.hx"
						return value;
					}
					
					//line 3 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/AppContext.hx"
					break;
				}
				
				
				case -1714548649:
				{
					//line 3 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/AppContext.hx"
					if (field.equals("controllers")) 
					{
						//line 3 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/AppContext.hx"
						__temp_executeDef1 = false;
						//line 3 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/AppContext.hx"
						this.controllers = ((haxe.ds.StringMap<com.example.app.Controller>) (value) );
						//line 3 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/AppContext.hx"
						return value;
					}
					
					//line 3 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/AppContext.hx"
					break;
				}
				
				
			}
			
			//line 3 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/AppContext.hx"
			if (__temp_executeDef1) 
			{
				//line 3 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/AppContext.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 3 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/AppContext.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 3 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/AppContext.hx"
		{
			//line 3 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/AppContext.hx"
			boolean __temp_executeDef1 = true;
			//line 3 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/AppContext.hx"
			switch (field.hashCode())
			{
				case 1985047079:
				{
					//line 3 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/AppContext.hx"
					if (field.equals("setView")) 
					{
						//line 3 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/AppContext.hx"
						__temp_executeDef1 = false;
						//line 3 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/AppContext.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "setView")) );
					}
					
					//line 3 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/AppContext.hx"
					break;
				}
				
				
				case 106164915:
				{
					//line 3 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/AppContext.hx"
					if (field.equals("owner")) 
					{
						//line 3 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/AppContext.hx"
						__temp_executeDef1 = false;
						//line 3 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/AppContext.hx"
						return this.owner;
					}
					
					//line 3 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/AppContext.hx"
					break;
				}
				
				
				case 2102494577:
				{
					//line 3 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/AppContext.hx"
					if (field.equals("navigate")) 
					{
						//line 3 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/AppContext.hx"
						__temp_executeDef1 = false;
						//line 3 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/AppContext.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "navigate")) );
					}
					
					//line 3 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/AppContext.hx"
					break;
				}
				
				
				case -1714548649:
				{
					//line 3 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/AppContext.hx"
					if (field.equals("controllers")) 
					{
						//line 3 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/AppContext.hx"
						__temp_executeDef1 = false;
						//line 3 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/AppContext.hx"
						return this.controllers;
					}
					
					//line 3 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/AppContext.hx"
					break;
				}
				
				
				case 1986576031:
				{
					//line 3 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/AppContext.hx"
					if (field.equals("registerController")) 
					{
						//line 3 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/AppContext.hx"
						__temp_executeDef1 = false;
						//line 3 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/AppContext.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "registerController")) );
					}
					
					//line 3 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/AppContext.hx"
					break;
				}
				
				
				case 1582053877:
				{
					//line 3 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/AppContext.hx"
					if (field.equals("currentController")) 
					{
						//line 3 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/AppContext.hx"
						__temp_executeDef1 = false;
						//line 3 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/AppContext.hx"
						return this.currentController;
					}
					
					//line 3 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/AppContext.hx"
					break;
				}
				
				
			}
			
			//line 3 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/AppContext.hx"
			if (__temp_executeDef1) 
			{
				//line 3 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/AppContext.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 3 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/AppContext.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 3 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/AppContext.hx"
		{
			//line 3 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/AppContext.hx"
			boolean __temp_executeDef1 = true;
			//line 3 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/AppContext.hx"
			switch (field.hashCode())
			{
				case 1985047079:
				{
					//line 3 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/AppContext.hx"
					if (field.equals("setView")) 
					{
						//line 3 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/AppContext.hx"
						__temp_executeDef1 = false;
						//line 3 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/AppContext.hx"
						this.setView(((com.example.app.Tag) (dynargs.__get(0)) ));
					}
					
					//line 3 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/AppContext.hx"
					break;
				}
				
				
				case 1986576031:
				{
					//line 3 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/AppContext.hx"
					if (field.equals("registerController")) 
					{
						//line 3 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/AppContext.hx"
						__temp_executeDef1 = false;
						//line 3 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/AppContext.hx"
						this.registerController(((java.lang.Class) (dynargs.__get(0)) ));
					}
					
					//line 3 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/AppContext.hx"
					break;
				}
				
				
				case 2102494577:
				{
					//line 3 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/AppContext.hx"
					if (field.equals("navigate")) 
					{
						//line 3 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/AppContext.hx"
						__temp_executeDef1 = false;
						//line 3 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/AppContext.hx"
						this.navigate(((java.lang.Class) (dynargs.__get(0)) ));
					}
					
					//line 3 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/AppContext.hx"
					break;
				}
				
				
			}
			
			//line 3 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/AppContext.hx"
			if (__temp_executeDef1) 
			{
				//line 3 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/AppContext.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		//line 3 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/AppContext.hx"
		return null;
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 3 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/AppContext.hx"
		baseArr.push("currentController");
		//line 3 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/AppContext.hx"
		baseArr.push("controllers");
		//line 3 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/AppContext.hx"
		baseArr.push("owner");
		//line 3 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/AppContext.hx"
		super.__hx_getFields(baseArr);
	}
	
	
}


