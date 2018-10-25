import java.io.*; 
import java.net.*; 
import java.sql.SQLException;
  
// Server class 
public class Server  
{ 
    DataOutputStream dos ;
    DataInputStream dis;
    
    Server() throws IOException, SQLException
    {ServerSocket ss = new ServerSocket(5001); 
       while (true)  
        { 
    Socket s = null;   
            try 
            { s = ss.accept(); 
               System.out.println("A new client is connected : " + s); 
                dis = new DataInputStream(new BufferedInputStream(s.getInputStream())); 
                dos= new DataOutputStream(s.getOutputStream()); 
               
                 new ClientHandler(s, dis, dos); 
                
                  
            } 
            catch (IOException e){ 
                s.close(); 
                e.printStackTrace(); 
            } 
        } 
    } 
    public static void main(String[] args) throws IOException, SQLException  
    {  new Server();
    }
} 
  