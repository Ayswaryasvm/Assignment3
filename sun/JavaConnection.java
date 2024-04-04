package assignment3.sun;

public class JavaConnection extends MySqlConnection{

	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("Connected Successfully");
	}

	public void disconnect() {
		// TODO Auto-generated method stub
		System.out.println("DisConnected Successfully");
	}

	public void executeUpdate() {
		// TODO Auto-generated method stub
		System.out.println("Executed Update");
	}
public static void main(String[] args) {
	JavaConnection jc=new JavaConnection();
	jc.connect();
	jc.disconnect();
	jc.executeUpdate();
	jc.executeQuery();
}
}
