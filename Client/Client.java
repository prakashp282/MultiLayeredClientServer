 
import java.io.*; 
import java.net.*; 
import java.util.Scanner; 
 
public class Client  
{ 
    
 DataInputStream dis;
 DataOutputStream dos;
    public Client() throws IOException  
    { 
        try
        { 
            Socket s = new Socket("127.0.0.1", 5001); 
           dis = new DataInputStream(s.getInputStream()); 
           dos = new DataOutputStream(s.getOutputStream()); 
            Scanner scn = new Scanner(System.in); 
              

            while (true)  
            { 
                //System.out.println(dis.readUTF()); 
                String tosend = scn.nextLine(); //write an sql query 
                dos.writeUTF(tosend);   
             
            String toread="";
            toread=in.readUTF();
            
            while(!toread.equals("FINISH")){
                System.out.println(tosend);
                oread=in.readUTF();
            }

                
             
             
             
            } 
        }catch(Exception e){ 
            e.printStackTrace(); 
        }finally{
            dis.close(); 
            dos.close(); 
    } 
        }
   public static void main(String[] args) throws IOException{
       new Client();
   }
} 
