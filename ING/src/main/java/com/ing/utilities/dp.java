package com.ing.utilities;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;;

public class dp {
  

  @DataProvider(name="dp")
  public Object[][] dp() {
	  System.out.println("This is DataProvider.");
    return new Object[][] {
      new Object[] { "Chinna", "abc" }
      
    };
  }
  
  @Test(dataProvider="dp")
  public void getData(String a,String b){
	  
	  System.out.println(a);
	  System.out.println(b);
	  
  }
  
  
  @DataProvider
  public Object[][] dp1() {
	  System.out.println("This is DataProvider.");
    return new Object[][] {
      new Object[] { "Munna", "123" },
    };
  }
}
