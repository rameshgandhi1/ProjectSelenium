package org.testing;

import org.testng.annotations.DataProvider;

public class dataProvid { 
	@DataProvider (name="FBLogin")
public Object[][] gettingData() {
return new Object[][] {
	{"sql","sql@123"},
	{"java","java@123"},
	{"python","python@123"},
	{"selenium","selenium@123"}
	
};

}

}
