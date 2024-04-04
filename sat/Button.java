package assignment3.sat;

public class Button extends WebElement{
	public void submit()
	{
		System.out.println("Submit");
	}
	public static void main(String[] args) {
		Button b=new Button();
		b.submit();
		
	}
}
