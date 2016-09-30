package interview;

import java.util.ArrayList;
import java.util.List;
import org.testng.Assert;
import org.testng.annotations.Test;
import Utils.DataProviderRepository;

public class NumberListHelperTest {

	/**
	 * Test Case Name: sumTest3numbers
	 * Description: Test sum function with 3 numbers
	 * @param member1
	 * @param member2
	 * @param member3
	 * @param result
	 */
	@Test (dataProviderClass=DataProviderRepository.class, dataProvider = "sumFunctionTestWith3Numbers", priority='1')
	public static void sumTest3numbers(String member1, String member2, String member3, String result){
		List<Double> members = new ArrayList<Double>();
		members.add(Double.parseDouble(member1));
		members.add(Double.parseDouble(member2));
		members.add(Double.parseDouble(member3));
		Assert.assertEquals(Double.parseDouble(result), NumberListHelper.sum(members), 0.0000001);
	}
	
	/**
	 * Test Case Name: sumTest4numbers
	 * Description: Test sum function with 4 numbers
	 * @param member1
	 * @param member2
	 * @param member3
	 * @param member4
	 * @param result
	 */
	@Test (dataProviderClass=DataProviderRepository.class, dataProvider = "sumFunctionTestWith4Numbers", priority='2')
	public static void sumTest4numbers(String member1, String member2, String member3, String member4, String result){
		List<Double> members = new ArrayList<Double>();
		members.add(Double.parseDouble(member1));
		members.add(Double.parseDouble(member2));
		members.add(Double.parseDouble(member3));
		members.add(Double.parseDouble(member4));
		Assert.assertEquals(Double.parseDouble(result), NumberListHelper.sum(members), 0.0000001);
	}
	
	/**
	 * Test Case Name: maxTest3numbers
	 * Description: Test max function with 3 numbers
	 * @param member1
	 * @param member2
	 * @param member3
	 * @param result
	 */
	@Test (dataProviderClass=DataProviderRepository.class, dataProvider = "maxFunctionTestWith3Numbers", priority='3')
	public static void maxTest3numbers(String member1, String member2, String member3, String result){
		List<Double> members = new ArrayList<Double>();
		members.add(Double.parseDouble(member1));
		members.add(Double.parseDouble(member2));
		members.add(Double.parseDouble(member3));
		Assert.assertEquals(Double.parseDouble(result), NumberListHelper.max(members), 0.0000001);
	}
	
	/**
	 * Test Case Name: maxTest4numbers
	 * Description: Test max function with 4 numbers
	 * @param member1
	 * @param member2
	 * @param member3
	 * @param member4
	 * @param result
	 */
	@Test (dataProviderClass=DataProviderRepository.class, dataProvider = "maxFunctionTestWith4Numbers", priority='4')
	public static void maxTest4numbers(String member1, String member2, String member3, String member4, String result){
		List<Double> members = new ArrayList<Double>();
		members.add(Double.parseDouble(member1));
		members.add(Double.parseDouble(member2));
		members.add(Double.parseDouble(member3));
		members.add(Double.parseDouble(member4));
		Assert.assertEquals(Double.parseDouble(result), NumberListHelper.max(members), 0.0000001);
	}
}
