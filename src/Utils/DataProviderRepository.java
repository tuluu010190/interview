package Utils;

import org.testng.annotations.DataProvider;

import Utils.ExcelUtils;

public class DataProviderRepository {
	@DataProvider (name = "sumFunctionTestWith3Numbers")
	public static Object[][] sumFunctionTestWith3Numbers() throws Exception{
		Object[][] testObjArray = ExcelUtils.getTableArray(System.getProperty("user.dir") + "\\resources\\sum.xls","Sheet1",4);
		return (testObjArray);
	}
	
	@DataProvider (name = "sumFunctionTestWith4Numbers")
	public static Object[][] sumFunctionTestWith4Numbers() throws Exception{
		Object[][] testObjArray = ExcelUtils.getTableArray(System.getProperty("user.dir") + "\\resources\\sum.xls","Sheet2",5);
		return (testObjArray);
	}
	
	@DataProvider (name = "maxFunctionTestWith3Numbers")
	public static Object[][] maxFunctionTestWith3Numbers() throws Exception{
		Object[][] testObjArray = ExcelUtils.getTableArray(System.getProperty("user.dir") + "\\resources\\max.xls","Sheet1",4);
		return (testObjArray);
	}
	
	@DataProvider (name = "maxFunctionTestWith4Numbers")
	public static Object[][] maxFunctionTestWith4Numbers() throws Exception{
		Object[][] testObjArray = ExcelUtils.getTableArray(System.getProperty("user.dir") + "\\resources\\max.xls","Sheet2",5);
		return (testObjArray);
	}
}
