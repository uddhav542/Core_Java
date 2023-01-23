package TDDDemo;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class Demo {
	@Test 
	void testGreeting()
	{
		assertEquals(greetings("Uddhav"),"Hello Uddhav");
	}
	
	@Test
	void testAdd()
	{
		assertEquals(add("3,4,5"),12);
	}
	
	public String greetings(String name) {
		return "Hello " + name;
	}
	
	/**
	 * Takes string numnbers as parameters
	 * @param numbers for nmbers
	 * @return addition of numbers
	 */
	public int add(String numbers)
	{
		int sum = 0;
		String [] nums = numbers.split(",");
		for(int i=0;i<nums.length;i++)
		{
			sum += Integer.parseInt(nums[i]);;
		}
		return sum;
	}
}
