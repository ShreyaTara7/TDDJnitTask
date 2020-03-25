package com.epam.TDDdemo;

public class RemoveAChar 
{
	public static String removeAcharacter(String s) 
	{
		int strlength=s.length();
		String s1=null;
	    if(s.charAt(0)=='A'||s.charAt(1)=='A'){
	    	if (s.charAt(0)=='A'&&s.charAt(1)=='A'){
	    		s1=s.substring(2, strlength);
	    	}
	    	else if(s.charAt(0)=='A'){
	    		s1=s.substring(1,strlength);
	    	}
	    	else 
	    		{
	    		if(s.charAt(1)=='A'){
	    		StringBuilder sb=new StringBuilder(s);
	    		sb.deleteCharAt(1);
	    		s1=sb.substring(0)+sb.substring(2, strlength-2);
	    	}
	    		}
	    	return s1;
 }
	    return s;
  }

	

	/*public String removeAcharacter(String s) {
		// TODO Auto-generated method stub
		return null;
	}*/
	

}
