package ui;

import java.io.IOException;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ClientHandler extends Thread {
	final DataInputStream dataInputStream;
	final DataOutputStream dataOutputStream;
	final Socket socket;
	final int Id;
	
	static volatile int count;

	static final String DB_URL = "jdbc:mysql://localhost:3306/indigo";
	static final String DB_DRV = "com.mysql.jdbc.Driver";
	static final String DB_USER = "root";
	static final String DB_PASSWD = "root";

	Connection connection = null;
	Statement statement = null;
	ResultSet resultSet = null;

	void searchFlights() throws IOException, SQLException {
		try {
			
	}

	public ClientHandler(Socket socket, DataInputStream dataInputStream, DataOutputStream dataOutputStream, int Id)
			throws IOException {
		this.socket = socket;
		this.dataInputStream = dataInputStream;
		this.dataOutputStream = dataOutputStream;
		this.Id = Id;
			}
			
		public void run() {
		String recieved;
		String toReturn;
		try {
			dataOutputStream.writeUTF("ServerRead:ClientID " + Id);
			recieved = dataInputStream.readUTF();
			System.out.println(recieved);
			String abc = dataInputStream.readUTF();
			System.out.println(abc);
			resultSet = statement.executeQuery(abc);

			while (resultSet.next()) {

				String result = "";
				for (int i = 0; i < 10; i++) {
					System.out.printf("%s\t", resultSet.getString(i + 1));
					result = result + resultSet.getString(i + 1);
					result = result + " ";
				}
				System.out.println("");
				result = result + "END";
				dataOutputStream.writeUTF(result);
			}

			dataOutputStream.writeUTF("FINISH");
		} catch (SQLException ex) {
		} finally {
			resultSet.close();
			statement.close();
			connection.close();
		}
			
			
			
		} catch (IOException | SQLException e) {
			e.printStackTrace();
		}

	}

}
