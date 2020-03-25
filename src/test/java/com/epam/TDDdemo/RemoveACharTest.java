package com.epam.TDDdemo;

//import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;



class RemoveACharTest {
	/*To-Do List
	 * 1.only first character as A:ABCD=>BCD
	 * 2.first two characters as A:AACD=>CD 
	 * 3.only second char as A:BACD=>BCD
	 * 4.last two characters as A:BBAA:BBAA
	 * 5.first and last characters as A:AABAA=>BAA
	 */

	@Test
	void testfirstchar() 
	{
		
		assertEquals("BCD",RemoveAChar.removeAcharacter("ABCD"));
		//fail("Not yet implemented");
	}
	@Test
	public void test2chars() {
		
		assertEquals("CD",RemoveAChar.removeAcharacter("AACD"));
		}
	@Test
	public void testonlysecondndchar(){
		
		assertEquals("BCD",RemoveAChar.removeAcharacter("BACD"));
	}
	@Test
	public void testlast2char(){
		
		assertEquals("BBAA",RemoveAChar.removeAcharacter("BBAA"));
	}
	@Test
	public void testfirstandlast2charA(){
		
		assertEquals("BAA",RemoveAChar.removeAcharacter("AABAA"));
	}

}
