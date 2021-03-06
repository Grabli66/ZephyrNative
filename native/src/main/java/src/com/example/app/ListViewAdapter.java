// Generated by Haxe 3.4.2
package com.example.app;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class ListViewAdapter<T> extends android.widget.BaseAdapter implements haxe.lang.IHxObject
{
	public ListViewAdapter(haxe.lang.EmptyObject empty)
	{
		//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
		super();
	}
	
	
	public ListViewAdapter(java.lang.Object options, android.content.Context context)
	{
		//line 22 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
		super();
		//line 23 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
		this.context = context;
		//line 24 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
		this.options = options;
	}
	
	
	public android.content.Context context;
	
	public java.lang.Object options;
	
	@Override public int getCount()
	{
		//line 29 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
		haxe.Log.trace.__hx_invoke2_o(((double) (((com.example.app.ListModel<T>) (haxe.lang.Runtime.getField(this.options, "dataSource", true)) ).get_length()) ), haxe.lang.Runtime.undefined, 0.0, new haxe.lang.DynamicObject(new java.lang.String[]{"className", "fileName", "methodName"}, new java.lang.Object[]{"com.example.app.ListViewAdapter", "Listview.hx", "getCount"}, new java.lang.String[]{"lineNumber"}, new double[]{((double) (((double) (29) )) )}));
		//line 30 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
		return ((com.example.app.ListModel<T>) (haxe.lang.Runtime.getField(this.options, "dataSource", true)) ).get_length();
	}
	
	
	@Override public T getItem(int position)
	{
		//line 35 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
		return ((com.example.app.ListModel<T>) (haxe.lang.Runtime.getField(this.options, "dataSource", true)) ).items.__get(position);
	}
	
	
	@Override public long getItemId(int position)
	{
		//line 40 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
		return ((long) (position) );
	}
	
	
	@Override public android.view.View getView(int position, android.view.View convertView, android.view.ViewGroup parent)
	{
		//line 48 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
		T data = ((T) (((com.example.app.ListModel<T>) (haxe.lang.Runtime.getField(this.options, "dataSource", true)) ).items.__get(position)) );
		//line 49 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
		com.example.app.Tag tag = ((com.example.app.Tag) (haxe.lang.Runtime.callField(this.options, "renderItem", new haxe.root.Array(new java.lang.Object[]{data}))) );
		//line 50 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
		return tag.render(this.context);
	}
	
	
	public boolean __hx_deleteField(java.lang.String field)
	{
		//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
		return false;
	}
	
	
	public java.lang.Object __hx_lookupField(java.lang.String field, boolean throwErrors, boolean isCheck)
	{
		//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
		if (isCheck) 
		{
			//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
			return haxe.lang.Runtime.undefined;
		}
		else
		{
			//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
			if (throwErrors) 
			{
				//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
				throw haxe.lang.HaxeException.wrap("Field not found.");
			}
			else
			{
				//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
				return null;
			}
			
		}
		
	}
	
	
	public double __hx_lookupField_f(java.lang.String field, boolean throwErrors)
	{
		//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
		if (throwErrors) 
		{
			//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
			throw haxe.lang.HaxeException.wrap("Field not found or incompatible field type.");
		}
		else
		{
			//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
			return 0.0;
		}
		
	}
	
	
	public java.lang.Object __hx_lookupSetField(java.lang.String field, java.lang.Object value)
	{
		//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
		throw haxe.lang.HaxeException.wrap("Cannot access field for writing.");
	}
	
	
	public double __hx_lookupSetField_f(java.lang.String field, double value)
	{
		//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
		throw haxe.lang.HaxeException.wrap("Cannot access field for writing or incompatible type.");
	}
	
	
	public double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
		{
			//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
			boolean __temp_executeDef1 = true;
			//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
			switch (field.hashCode())
			{
				case -1249474914:
				{
					//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
					if (field.equals("options")) 
					{
						//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
						__temp_executeDef1 = false;
						//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
						this.options = ((java.lang.Object) (value) );
						//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
						return value;
					}
					
					//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
					break;
				}
				
				
			}
			
			//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
			if (__temp_executeDef1) 
			{
				//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
				return this.__hx_lookupSetField_f(field, value);
			}
			else
			{
				//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
				throw null;
			}
			
		}
		
	}
	
	
	public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
		{
			//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
			boolean __temp_executeDef1 = true;
			//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
			switch (field.hashCode())
			{
				case -1249474914:
				{
					//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
					if (field.equals("options")) 
					{
						//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
						__temp_executeDef1 = false;
						//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
						this.options = ((java.lang.Object) (value) );
						//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
						return value;
					}
					
					//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
					break;
				}
				
				
				case 951530927:
				{
					//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
					if (field.equals("context")) 
					{
						//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
						__temp_executeDef1 = false;
						//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
						this.context = ((android.content.Context) (value) );
						//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
						return value;
					}
					
					//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
					break;
				}
				
				
			}
			
			//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
			if (__temp_executeDef1) 
			{
				//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
				return this.__hx_lookupSetField(field, value);
			}
			else
			{
				//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
				throw null;
			}
			
		}
		
	}
	
	
	public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
		{
			//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
			boolean __temp_executeDef1 = true;
			//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
			switch (field.hashCode())
			{
				case 614555651:
				{
					//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
					if (field.equals("hasStableIds")) 
					{
						//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
						__temp_executeDef1 = false;
						//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "hasStableIds")) );
					}
					
					//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
					break;
				}
				
				
				case 951530927:
				{
					//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
					if (field.equals("context")) 
					{
						//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
						__temp_executeDef1 = false;
						//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
						return this.context;
					}
					
					//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
					break;
				}
				
				
				case 1260792363:
				{
					//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
					if (field.equals("registerDataSetObserver")) 
					{
						//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
						__temp_executeDef1 = false;
						//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "registerDataSetObserver")) );
					}
					
					//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
					break;
				}
				
				
				case -1249474914:
				{
					//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
					if (field.equals("options")) 
					{
						//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
						__temp_executeDef1 = false;
						//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
						return this.options;
					}
					
					//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
					break;
				}
				
				
				case -35340430:
				{
					//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
					if (field.equals("unregisterDataSetObserver")) 
					{
						//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
						__temp_executeDef1 = false;
						//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "unregisterDataSetObserver")) );
					}
					
					//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
					break;
				}
				
				
				case 1950676825:
				{
					//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
					if (field.equals("getCount")) 
					{
						//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
						__temp_executeDef1 = false;
						//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getCount")) );
					}
					
					//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
					break;
				}
				
				
				case -824829211:
				{
					//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
					if (field.equals("notifyDataSetChanged")) 
					{
						//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
						__temp_executeDef1 = false;
						//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "notifyDataSetChanged")) );
					}
					
					//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
					break;
				}
				
				
				case -75439223:
				{
					//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
					if (field.equals("getItem")) 
					{
						//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
						__temp_executeDef1 = false;
						//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getItem")) );
					}
					
					//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
					break;
				}
				
				
				case 412560954:
				{
					//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
					if (field.equals("notifyDataSetInvalidated")) 
					{
						//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
						__temp_executeDef1 = false;
						//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "notifyDataSetInvalidated")) );
					}
					
					//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
					break;
				}
				
				
				case 517353092:
				{
					//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
					if (field.equals("getItemId")) 
					{
						//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
						__temp_executeDef1 = false;
						//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getItemId")) );
					}
					
					//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
					break;
				}
				
				
				case -136629586:
				{
					//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
					if (field.equals("areAllItemsEnabled")) 
					{
						//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
						__temp_executeDef1 = false;
						//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "areAllItemsEnabled")) );
					}
					
					//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
					break;
				}
				
				
				case -75062501:
				{
					//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
					if (field.equals("getView")) 
					{
						//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
						__temp_executeDef1 = false;
						//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getView")) );
					}
					
					//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
					break;
				}
				
				
				case 2105594551:
				{
					//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
					if (field.equals("isEnabled")) 
					{
						//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
						__temp_executeDef1 = false;
						//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "isEnabled")) );
					}
					
					//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
					break;
				}
				
				
				case 2058039875:
				{
					//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
					if (field.equals("isEmpty")) 
					{
						//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
						__temp_executeDef1 = false;
						//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "isEmpty")) );
					}
					
					//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
					break;
				}
				
				
				case -756909844:
				{
					//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
					if (field.equals("getDropDownView")) 
					{
						//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
						__temp_executeDef1 = false;
						//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getDropDownView")) );
					}
					
					//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
					break;
				}
				
				
				case -1227222758:
				{
					//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
					if (field.equals("getViewTypeCount")) 
					{
						//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
						__temp_executeDef1 = false;
						//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getViewTypeCount")) );
					}
					
					//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
					break;
				}
				
				
				case -844164568:
				{
					//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
					if (field.equals("getItemViewType")) 
					{
						//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
						__temp_executeDef1 = false;
						//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getItemViewType")) );
					}
					
					//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
					break;
				}
				
				
			}
			
			//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
			if (__temp_executeDef1) 
			{
				//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
				return this.__hx_lookupField(field, throwErrors, isCheck);
			}
			else
			{
				//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
				throw null;
			}
			
		}
		
	}
	
	
	public double __hx_getField_f(java.lang.String field, boolean throwErrors, boolean handleProperties)
	{
		//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
		{
			//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
			boolean __temp_executeDef1 = true;
			//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
			switch (field.hashCode())
			{
				case -1249474914:
				{
					//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
					if (field.equals("options")) 
					{
						//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
						__temp_executeDef1 = false;
						//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
						return ((double) (haxe.lang.Runtime.toDouble(this.options)) );
					}
					
					//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
					break;
				}
				
				
			}
			
			//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
			if (__temp_executeDef1) 
			{
				//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
				return this.__hx_lookupField_f(field, throwErrors);
			}
			else
			{
				//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
				throw null;
			}
			
		}
		
	}
	
	
	public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
		{
			//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
			int __temp_hash2 = field.hashCode();
			//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
			boolean __temp_executeDef1 = true;
			//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
			switch (__temp_hash2)
			{
				case 614555651:
				case 1260792363:
				case -35340430:
				case -824829211:
				case 412560954:
				case -136629586:
				case 2105594551:
				case -756909844:
				case -844164568:
				case -1227222758:
				case 2058039875:
				case -75062501:
				case 517353092:
				case -75439223:
				case 1950676825:
				{
					//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
					if (( (( ( __temp_hash2 == 614555651 ) && field.equals("hasStableIds") )) || ( (( ( __temp_hash2 == 1260792363 ) && field.equals("registerDataSetObserver") )) || ( (( ( __temp_hash2 == -35340430 ) && field.equals("unregisterDataSetObserver") )) || ( (( ( __temp_hash2 == -824829211 ) && field.equals("notifyDataSetChanged") )) || ( (( ( __temp_hash2 == 412560954 ) && field.equals("notifyDataSetInvalidated") )) || ( (( ( __temp_hash2 == -136629586 ) && field.equals("areAllItemsEnabled") )) || ( (( ( __temp_hash2 == 2105594551 ) && field.equals("isEnabled") )) || ( (( ( __temp_hash2 == -756909844 ) && field.equals("getDropDownView") )) || ( (( ( __temp_hash2 == -844164568 ) && field.equals("getItemViewType") )) || ( (( ( __temp_hash2 == -1227222758 ) && field.equals("getViewTypeCount") )) || ( (( ( __temp_hash2 == 2058039875 ) && field.equals("isEmpty") )) || ( (( ( __temp_hash2 == -75062501 ) && field.equals("getView") )) || ( (( ( __temp_hash2 == 517353092 ) && field.equals("getItemId") )) || ( (( ( __temp_hash2 == -75439223 ) && field.equals("getItem") )) || field.equals("getCount") ) ) ) ) ) ) ) ) ) ) ) ) ) )) 
					{
						//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
						__temp_executeDef1 = false;
						//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
						return haxe.lang.Runtime.slowCallField(this, field, dynargs);
					}
					
					//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
					break;
				}
				
				
			}
			
			//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
			if (__temp_executeDef1) 
			{
				//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
				return ((haxe.lang.Function) (this.__hx_getField(field, true, false, false)) ).__hx_invokeDynamic(dynargs);
			}
			else
			{
				//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
				throw null;
			}
			
		}
		
	}
	
	
	public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
		baseArr.push("options");
		//line 15 "/home/grabli66/Workspace/ZephyrNative/source/com/example/app/Listview.hx"
		baseArr.push("context");
	}
	
	
}


