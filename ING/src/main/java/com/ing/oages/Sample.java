package com.ing.oages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sample {
	
	WebDriver driver;
	
	@FindBy(id="")
	WebElement bankAndName;
	
	public Sample() {
	
	PageFactory.initElements(driver, Sample.class);
	}

	public void clickBankName(){
		bankAndName.click();
		
		
	}
	
	
	public void senkeysBankname(String bankName){
		
		bankAndName.sendKeys(bankName);
	}
}
