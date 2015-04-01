package hackpsu;
//Class by Thomas White for HackPSU
import java.util.ArrayList;
public class org {
    //Default information initialized to empty strings.
    //private final int MAX_TAGS = 10;
    private String name = "";
    private String category = "";
    private String website = "";
    private String address = "";
    private String phone = "";
    private String description = "";
    private String tags[] = {"","","","","","","","","",""}; //Assuming MAX_TAGS = 10
    private ArrayList<event> events = new ArrayList<event>();
    
    //Constructors
    //Default contructor
    public org()
    {
        name = "HackPSU";
        website = "hackpsu.org";
        events.add(new event("HackPSU", 3, 28, 2015, 12.00 , "Christina's baby"));
    }
    public org(String itsName, String itsCategory, String itsAddress, String itsPhone, String itsDescription, String webAddress, ArrayList<event> newEvents)
    {
        name = itsName;
        category = itsCategory;
        address = itsAddress;
        phone = itsPhone;
        description = itsDescription;
        website = webAddress;
        events = newEvents;
    }
    //Name (String)
    public String getName()
    {
        return name;
    }
    
    public void setName(String newName)
    {
        name = newName;
    }
    //Category (String)
    public String getCategory()
    {
        return category;
    }
    
    public void setCategory(String newcategory)
    {
        category = newcategory;
    }
    //Website (String)
    public String getWeb()
    {
        return website;
    }
    
    public void setWeb(String newWeb)
    {
        website = newWeb;
    }
    //Description (String)
    public String getDescription()
    {
        return description;
    }
    
    public void setDescription(String desc)
    {
        description = desc;
    }
    //Events (ArrayList)
    public ArrayList<event> getEvents()
    {
        return events;
    }
    
    public void setEvents(ArrayList<event> newEvents)
    {
        events = newEvents;
    }
    //Tags (array of Strings)
    public String[] getTags()
    {
        return tags;
    }
    
    public void setTags(String[] newTags)
    {
        tags = newTags;
    }
}
