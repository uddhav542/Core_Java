package TDDDemo;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

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
	@Test
	void testPrimeFactors() {
		ArrayList<Integer> data = new ArrayList<Integer>();
		data.add(2);
		data.add(3);
		assertEquals(PrimeFactors(6),data);
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
	
	public ArrayList<Integer> PrimeFactors(int number)
	{
		ArrayList<Integer> ans = new ArrayList<Integer>();
		for(int i=2;i<number;i++)
		{
			if(number%i == 0)
			{
				if(isPrime(i))
					ans.add(i);
			}
		}
		return ans;
	}
	boolean isPrime(int num)
	{
		for(int i=2;i<=num/2;i++)
		{
			if(num%i == 0)
			{		
				return false;
			}
		}
		return true;
	}
}
