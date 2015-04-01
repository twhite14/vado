package hackpsu;
//Thomas White March 28, 2015
import java.util.ArrayList;
public class HackPSU {
    public static final int MAX_TAGS = 10;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        ArrayList<org> orgList = new ArrayList<org>();
        ArrayList<event> events = new ArrayList<event>();
        //event(String itsName, double newMonth, double newDay, double newYear, double newTime, String descrip)
        org org0   = new org("Ohana", "THON", "","","","ohana.psu.edu", events);
        org org1   = new org("Ohana", "THON", "","","","ohana.psu.edu", events);
        org org2   = new org("Ohana", "THON", "","","","ohana.psu.edu", events);
        org org3   = new org("Ohana", "THON", "","","","ohana.psu.edu", events);
        org org4   = new org("Ohana", "THON", "","","","ohana.psu.edu", events);
        org org5   = new org("Ohana", "THON", "","","","ohana.psu.edu", events);
        org org6   = new org("Ohana", "THON", "","","","ohana.psu.edu", events);
        org org7   = new org("Ohana", "THON", "","","","ohana.psu.edu", events);
        
        ArrayList<event> oneevent0 = new ArrayList<event>();
        ArrayList<event> oneevent1 = new ArrayList<event>();
        ArrayList<event> oneevent2 = new ArrayList<event>();
        ArrayList<event> oneevent3 = new ArrayList<event>();
        ArrayList<event> oneevent4 = new ArrayList<event>();
        ArrayList<event> oneevent5 = new ArrayList<event>();
        ArrayList<event> oneevent6 = new ArrayList<event>();
        ArrayList<event> oneevent7 = new ArrayList<event>();
        
        
        
        event event0  = new event("E0", 2, 28, 2015, 12, "Cool stuff for cool people");
        oneevent0.add(event0);
        org0.setEvents(oneevent0);
        orgList.add(org0);
        
        event event1  = new event("E1", 3,  1, 2015, 13, "not SSPL");
        oneevent1.add(event1);
        org1.setEvents(oneevent1);
        orgList.add(org1);
        
        event event2  = new event("E2", 3, 27, 2015, 14, "SSPL is better than us");
        oneevent2.add(event2);
        org2.setEvents(oneevent2);
        orgList.add(org2);
        
        event event3  = new event("E3", 3, 28, 2015, 12, "Kiss my shiny metal ass");
        oneevent3.add(event3);
        org3.setEvents(oneevent3);
        orgList.add(org3);
        
        event event4  = new event("E4", 3, 29, 2015, 13, "lol sspl.psu.edu");
        oneevent4.add(event4);
        org4.setEvents(oneevent4);
        orgList.add(org4);
        
        event event5  = new event("E5", 3, 30, 2015, 14, "Greek. enough said.");
        oneevent5.add(event5);
        org5.setEvents(oneevent5);
        orgList.add(org5);
        
        event event6  = new event("E6", 3, 31, 2015, 15, "THON");
        oneevent6.add(event6);
        org6.setEvents(oneevent6);
        orgList.add(org6);
        
        event event7  = new event("E7", 4 , 1, 2015, 1 , "THON2: the party never ends");
        oneevent7.add(event7);
        org7.setEvents(oneevent7);
        orgList.add(org7);
        
        /*       
        for(int i = 0; i < orgList.size(); i++)
        {
            ArrayList<event> lonelyEvent = orgList.get(i).getEvents();
            System.out.println(lonelyEvent.get(0).getName());
        }*/
        
        ArrayList<event> applicableEvents = new ArrayList<event>();
        double[] start = {3,1,2015,0};
        double[] end   = {3,31,2015,0};
        applicableEvents = calendar(start, end, orgList);
        for(int i = 0; i < applicableEvents.size(); i++)
        {
            System.out.println(applicableEvents.get(i).getName());
        }
        
    }
    public static int[] search(ArrayList<org> orgList, String term)
    {
        int[] weight = new int[orgList.size()];
        for(int i = 0; i < orgList.size(); i++)
        {
            weight[i] = 0;
            if(orgList.get(i).getName().contains(term))
                weight[i]++;
            if(orgList.get(i).getCategory().contains(term))
                weight[i]++;
            if(orgList.get(i).getDescription().contains(term))
                weight[i]++;
            String[] tags = new String[MAX_TAGS];
            tags = orgList.get(i).getTags();
            for(int j = 0; j < MAX_TAGS; j++)
            {
                if(tags[j].contains(term))
                    weight[i] += 2;
            }
        }
        return weight;
    }
    public static ArrayList<event> calendar(double[] startDate, double[] endDate, ArrayList<org> orgs)
    {
        //then will be returned. temp will handle a single events ArrayList pulled from an org
        ArrayList<event> then = new ArrayList<event>();
        ArrayList<event> temp = new ArrayList<event>();
        //pull the events for each org one at a time
        for(int i = 0; i < orgs.size(); i++)
        {
            temp = orgs.get(i).getEvents();
            //pull the date of each event one at a time
            for(int j = 0; j < temp.size(); j++)
            {
                double[] date = temp.get(j).getDate();
                //this variable determines if the event will be added to then
                boolean returnIt = true;
                //check year first (element 2)
                if(!(date[2] >= startDate[2] && date[2] <= endDate[2]))
                    returnIt = false;
                //check the month (element 0)
                if(!(date[0] >= startDate[0] && date[0] <= endDate[0]))
                    returnIt = false;
                //check the days (element 1)
                if(!(date[1] >= startDate[1] && date[1] <= endDate[1]))
                    returnIt = false;
                //the event is with the right time parameters. it is added to then
                if(returnIt)
                    then.add(temp.get(j));                    
            }
        }
        return then;
    }
}
