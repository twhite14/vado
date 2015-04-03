package hackpsu;

import java.util.ArrayList;
import java.lang.Math;

public class explore 
{
	public ArrayList<org> rand_orgs = new ArrayList<org>();
	
	public static void main(String[] args)
	{
		
	}
	
	public ArrayList<org> getrand()
	{
		for (int count = 0; count < 10; count++)
		{
			rand_orgs.add(org_list.get(Math.random()*800));
		}
		
		return rand_orgs;
	}

}
