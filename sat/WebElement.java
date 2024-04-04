package assignment3.sat;

public class WebElement {
	public void click() {
		System.out.println("Click");
	}
	public void setText(String text) {
		System.out.println("Set Text   :"+text);
	}
	public static void main(String[] args) {
		WebElement we=new WebElement();
		we.click();
		we.setText("Ayswarya");
	}
}
