pac

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
