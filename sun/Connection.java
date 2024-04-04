package assignment3.sun;

public class Connection implements DatabaseConnection {

	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("Connected Successfully");
	}

	public void disconnect() {
		// TODO Auto-generated method stub
		System.out.println("Disconnected Successfully");
	}

	public void executeUpdate() {
		// TODO Auto-generated method stub
		System.out.println("Updated Successfully");
		
	}
	public static void main(String[] args) {
		Connection c=new Connection();
		c.connect();
		c.disconnect();
		c.executeUpdate();
	}
	

}
