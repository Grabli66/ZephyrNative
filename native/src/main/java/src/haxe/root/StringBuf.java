// Generated by Haxe 3.4.2
package haxe.root;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class StringBuf extends haxe.lang.HxObject
{
	public StringBuf(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public StringBuf()
	{
		//line 30 "/usr/lib/haxe/std/java/_std/StringBuf.hx"
		haxe.root.StringBuf.__hx_ctor__StringBuf(this);
	}
	
	
	public static void __hx_ctor__StringBuf(haxe.root.StringBuf __hx_this)
	{
		//line 31 "/usr/lib/haxe/std/java/_std/StringBuf.hx"
		__hx_this.b = new java.lang.StringBuilder();
	}
	
	
	public java.lang.StringBuilder b;
	
	
	
	public <T> void add(T x)
	{
		//line 39 "/usr/lib/haxe/std/java/_std/StringBuf.hx"
		if (haxe.lang.Runtime.isInt(x)) 
		{
			//line 41 "/usr/lib/haxe/std/java/_std/StringBuf.hx"
			int x1 = ((int) (haxe.lang.Runtime.toInt(((java.lang.Object) (x) ))) );
			//line 42 "/usr/lib/haxe/std/java/_std/StringBuf.hx"
			java.lang.Object xd = x1;
			//line 43 "/usr/lib/haxe/std/java/_std/StringBuf.hx"
			this.b.append(((java.lang.Object) (xd) ));
		}
		else
		{
			//line 45 "/usr/lib/haxe/std/java/_std/StringBuf.hx"
			this.b.append(((java.lang.Object) (x) ));
		}
		
	}
	
	
	@Override public java.lang.String toString()
	{
		//line 59 "/usr/lib/haxe/std/java/_std/StringBuf.hx"
		return this.b.toString();
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 24 "/usr/lib/haxe/std/java/_std/StringBuf.hx"
		{
			//line 24 "/usr/lib/haxe/std/java/_std/StringBuf.hx"
			boolean __temp_executeDef1 = true;
			//line 24 "/usr/lib/haxe/std/java/_std/StringBuf.hx"
			switch (field.hashCode())
			{
				case 98:
				{
					//line 24 "/usr/lib/haxe/std/java/_std/StringBuf.hx"
					if (field.equals("b")) 
					{
						//line 24 "/usr/lib/haxe/std/java/_std/StringBuf.hx"
						__temp_executeDef1 = false;
						//line 24 "/usr/lib/haxe/std/java/_std/StringBuf.hx"
						this.b = ((java.lang.StringBuilder) (value) );
						//line 24 "/usr/lib/haxe/std/java/_std/StringBuf.hx"
						return value;
					}
					
					//line 24 "/usr/lib/haxe/std/java/_std/StringBuf.hx"
					break;
				}
				
				
			}
			
			//line 24 "/usr/lib/haxe/std/java/_std/StringBuf.hx"
			if (__temp_executeDef1) 
			{
				//line 24 "/usr/lib/haxe/std/java/_std/StringBuf.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 24 "/usr/lib/haxe/std/java/_std/StringBuf.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 24 "/usr/lib/haxe/std/java/_std/StringBuf.hx"
		{
			//line 24 "/usr/lib/haxe/std/java/_std/StringBuf.hx"
			boolean __temp_executeDef1 = true;
			//line 24 "/usr/lib/haxe/std/java/_std/StringBuf.hx"
			switch (field.hashCode())
			{
				case -1776922004:
				{
					//line 24 "/usr/lib/haxe/std/java/_std/StringBuf.hx"
					if (field.equals("toString")) 
					{
						//line 24 "/usr/lib/haxe/std/java/_std/StringBuf.hx"
						__temp_executeDef1 = false;
						//line 24 "/usr/lib/haxe/std/java/_std/StringBuf.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "toString")) );
					}
					
					//line 24 "/usr/lib/haxe/std/java/_std/StringBuf.hx"
					break;
				}
				
				
				case 98:
				{
					//line 24 "/usr/lib/haxe/std/java/_std/StringBuf.hx"
					if (field.equals("b")) 
					{
						//line 24 "/usr/lib/haxe/std/java/_std/StringBuf.hx"
						__temp_executeDef1 = false;
						//line 24 "/usr/lib/haxe/std/java/_std/StringBuf.hx"
						return this.b;
					}
					
					//line 24 "/usr/lib/haxe/std/java/_std/StringBuf.hx"
					break;
				}
				
				
				case 96417:
				{
					//line 24 "/usr/lib/haxe/std/java/_std/StringBuf.hx"
					if (field.equals("add")) 
					{
						//line 24 "/usr/lib/haxe/std/java/_std/StringBuf.hx"
						__temp_executeDef1 = false;
						//line 24 "/usr/lib/haxe/std/java/_std/StringBuf.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "add")) );
					}
					
					//line 24 "/usr/lib/haxe/std/java/_std/StringBuf.hx"
					break;
				}
				
				
			}
			
			//line 24 "/usr/lib/haxe/std/java/_std/StringBuf.hx"
			if (__temp_executeDef1) 
			{
				//line 24 "/usr/lib/haxe/std/java/_std/StringBuf.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 24 "/usr/lib/haxe/std/java/_std/StringBuf.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 24 "/usr/lib/haxe/std/java/_std/StringBuf.hx"
		{
			//line 24 "/usr/lib/haxe/std/java/_std/StringBuf.hx"
			boolean __temp_executeDef1 = true;
			//line 24 "/usr/lib/haxe/std/java/_std/StringBuf.hx"
			switch (field.hashCode())
			{
				case -1776922004:
				{
					//line 24 "/usr/lib/haxe/std/java/_std/StringBuf.hx"
					if (field.equals("toString")) 
					{
						//line 24 "/usr/lib/haxe/std/java/_std/StringBuf.hx"
						__temp_executeDef1 = false;
						//line 24 "/usr/lib/haxe/std/java/_std/StringBuf.hx"
						return this.toString();
					}
					
					//line 24 "/usr/lib/haxe/std/java/_std/StringBuf.hx"
					break;
				}
				
				
				case 96417:
				{
					//line 24 "/usr/lib/haxe/std/java/_std/StringBuf.hx"
					if (field.equals("add")) 
					{
						//line 24 "/usr/lib/haxe/std/java/_std/StringBuf.hx"
						__temp_executeDef1 = false;
						//line 24 "/usr/lib/haxe/std/java/_std/StringBuf.hx"
						this.add(((java.lang.Object) (dynargs.__get(0)) ));
						//line 24 "/usr/lib/haxe/std/java/_std/StringBuf.hx"
						return ((java.lang.Object) (null) );
					}
					
					//line 24 "/usr/lib/haxe/std/java/_std/StringBuf.hx"
					break;
				}
				
				
			}
			
			//line 24 "/usr/lib/haxe/std/java/_std/StringBuf.hx"
			if (__temp_executeDef1) 
			{
				//line 24 "/usr/lib/haxe/std/java/_std/StringBuf.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			else
			{
				//line 24 "/usr/lib/haxe/std/java/_std/StringBuf.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 24 "/usr/lib/haxe/std/java/_std/StringBuf.hx"
		baseArr.push("length");
		//line 24 "/usr/lib/haxe/std/java/_std/StringBuf.hx"
		baseArr.push("b");
		//line 24 "/usr/lib/haxe/std/java/_std/StringBuf.hx"
		super.__hx_getFields(baseArr);
	}
	
	
}


