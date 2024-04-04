package assignment3.sat;

public class LoginTestData extends TestData{
	public void enterUsername()
	{
		System.out.println("Enter UserName");
	}
	public void enterPassword()
	{
		System.out.println("Enter Password");
	}
	public static void main(String[] args) {
		LoginTestData ltd=new LoginTestData();
		ltd.enterCredentials();
		ltd.navigateToHomePage();
		ltd.enterUsername();
		ltd.enterPassword();
	
	}

}
