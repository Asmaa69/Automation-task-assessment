package Package;
import java.net.*;
import java.io.*;

public class Task_Bouns {
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		URL jsonplaceholder;
		String post_id = "1";
		
		jsonplaceholder = new URL("https://jsonplaceholder.typicode.com/posts/"+ post_id + "/comments");
	
        URLConnection yc = jsonplaceholder.openConnection();
        BufferedReader in = new BufferedReader(new InputStreamReader(
                                    yc.getInputStream()));
        String inputLine;
        while ((inputLine = in.readLine()) != null) 
            System.out.println(inputLine.toString());

    	

        in.close();
        

	}}
