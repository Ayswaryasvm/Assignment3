package assignment3.sat;

public class TextField extends WebElement {
	public void getText()
	{
		System.out.println("Get Text");
	}
public static void main(String[] args) {
	TextField tf=new TextField();
	tf.getText();
}
}
