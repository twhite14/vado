package hackpsu;

import java.util.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class create_org 
{
	public static String[] org_info = new String[6]; 
	public static ArrayList<event> empty_event; 
	public static ArrayList<org> org_list = new ArrayList<org>();
	
	public static void main(String[] args) throws FileNotFoundException
	{
      makeOrgs();
      for (int i = 0; i < 824; i++)
      {
    	 // System.out.print(org_list.get(i).getCategory());
    	  System.out.println(org_list.get(i).getName());
      }
	}
	
	public static void makeOrgs() throws FileNotFoundException
	{
		Scanner scanner = new Scanner(new File("/Users/smithsopp/Desktop/clubs.csv"));
        scanner.useDelimiter("~");
        
        int count = 0;
        
        while (scanner.hasNext())
        {
        	count = 0;
        	
        	while (scanner.hasNext() && count < 6)
        	{
        		org_info[count] = scanner.next();
        		count++;
        	}
        	
			org_list.add(new org(org_info[0], org_info[1], org_info[2], org_info[3], org_info[4], org_info[5], empty_event));
        }
        
        scanner.close();
		
	} 

}

