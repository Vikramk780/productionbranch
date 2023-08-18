package Testnng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;




public class Dpp{
	
	@DataProvider(name="data-provider")
	public Object[][] dpMethod() {
		
		return new Object[][] {{"firstvalue"},{"second-val"}};
	}
	
	@Test(dataProvider="data-provider")
	
	public void testdpvalues(String values) {
		
		System.out.println(values);
	}
}

//public class Dpp {
//	@DataProvider (name = "data-provider")
//    public Object[][] dpMethod(){
//	 return new Object[][] {{"First-Value"}, {"Second-Value"}};
//    }
//	
//	@Test(dataProvider="data-provider")
//	public void getdatafromdp(String values){
//		System.out.println(values);
//	}
//}
