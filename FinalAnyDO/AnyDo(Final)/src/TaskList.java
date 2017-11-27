import java.io.*;
import java.lang.*;
import java.util.*;  


public class TaskList {
	
	public static void main(String args) throws IOException {
		Home home = new Home();
		Login login = new Login();
		
		System.out.println("Welcome "+login.Username()+" to "+home.ListChoice()+" task list");
		//create file for listChoice to store data.
		
	}
}
