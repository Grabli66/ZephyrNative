// Generated by Haxe 3.4.2
package com.example.app;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class MainPage extends com.example.app.Page
{
	public MainPage(haxe.lang.EmptyObject empty)
	{
		//line 6 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/MainPage.hx"
		super(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public MainPage()
	{
		//line 5 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Page.hx"
		super(haxe.lang.EmptyObject.EMPTY);
		//line 5 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Page.hx"
		com.example.app.MainPage.__hx_ctor_com_example_app_MainPage(this);
	}
	
	
	public static void __hx_ctor_com_example_app_MainPage(com.example.app.MainPage __hx_this)
	{
		//line 5 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Page.hx"
		com.example.app.Page.__hx_ctor_com_example_app_Page(__hx_this);
	}
	
	
	@Override public com.example.app.Tag render()
	{
		//line 10 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/MainPage.hx"
		com.example.app.Toolbar __temp_stmt3 = com.example.app.TagBuilder.toolbar(null);
		//line 11 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/MainPage.hx"
		java.lang.Object __temp_stmt5 = null;
		//line 11 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/MainPage.hx"
		{
			//line 11 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/MainPage.hx"
			com.example.app.ListModel<java.lang.String> __temp_odecl1 = ((com.example.app.ListModel<java.lang.String>) (((com.example.app.ListModel) (com.example.app._AbstractListModel.AbstractListModel_Impl_.fromArray(((haxe.root.Array<java.lang.Object>) (((haxe.root.Array) (new haxe.root.Array<java.lang.String>(new java.lang.String[]{"Item 1", "Item 2", "Item 3", "Item 4", "Item 5"})) )) ))) )) );
			//line 13 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/MainPage.hx"
			com.example.app.MainPage_render_13__Fun __temp_odecl2 = ( (( com.example.app.MainPage_render_13__Fun.__hx_current != null )) ? (com.example.app.MainPage_render_13__Fun.__hx_current) : (com.example.app.MainPage_render_13__Fun.__hx_current = ((com.example.app.MainPage_render_13__Fun) (new com.example.app.MainPage_render_13__Fun()) )) );
			//line 11 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/MainPage.hx"
			__temp_stmt5 = new haxe.lang.DynamicObject(new java.lang.String[]{"dataSource", "renderItem"}, new java.lang.Object[]{__temp_odecl1, __temp_odecl2}, new java.lang.String[]{}, new double[]{});
		}
		
		//line 11 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/MainPage.hx"
		com.example.app.Listview<java.lang.Object> __temp_stmt4 = com.example.app.TagBuilder.listview(((java.lang.Object) (__temp_stmt5) ));
		//line 9 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/MainPage.hx"
		return com.example.app.TagBuilder.vbox(new haxe.root.Array<com.example.app.Tag>(new com.example.app.Tag[]{__temp_stmt3, ((com.example.app.Listview<java.lang.String>) (((com.example.app.Listview) (__temp_stmt4) )) )}));
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 6 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/MainPage.hx"
		{
			//line 6 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/MainPage.hx"
			boolean __temp_executeDef1 = true;
			//line 6 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/MainPage.hx"
			switch (field.hashCode())
			{
				case -934592106:
				{
					//line 6 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/MainPage.hx"
					if (field.equals("render")) 
					{
						//line 6 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/MainPage.hx"
						__temp_executeDef1 = false;
						//line 6 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/MainPage.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "render")) );
					}
					
					//line 6 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/MainPage.hx"
					break;
				}
				
				
			}
			
			//line 6 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/MainPage.hx"
			if (__temp_executeDef1) 
			{
				//line 6 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/MainPage.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 6 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/MainPage.hx"
				throw null;
			}
			
		}
		
	}
	
	
}


