package hackpsu;
//Class by Thomas White for HackPSU
public class event {
    //Default information initialized to empty strings.
    private String name;
    private double month;
    private double day;
    private double year;
    private double time; //24 hour time
    private int likes = 1;
    private String description;
    
    //Constructor
    //Default contructor
    public event()
    {
        name = "HackPSU";
        month = 3;
        day = 28;
        year = 2015;
        time = 12.00;
        description = "Penn State's Hackathon";
    }
    public event(String itsName, double newMonth, double newDay, double newYear, double newTime, String descrip)
    {
        name = itsName;
        month = newMonth;
        day = newDay;
        year = newYear;
        time = newTime;
        description = descrip;
    }
    //Name
    public String getName()
    {
        return name;
    }
    public void setName(String newName)
    {
        name = newName;
    }
    //Date
    public double[] getDate()
    {
        double[] date = {month, day, year, time};
        return date;
    }
    public void setDate(double[] newDate)
    {
        month = newDate[0];
        day   = newDate[1];
        year  = newDate[2];
        time  = newDate[3];
    }
    //Description
    public String getDescription()
    {
        return description;
    }
    public void setDescription(String desc)
    {
        description = desc;
    }
    //Likes
    public int getLikes()
    {
        return likes;
    }
    public void setLikes(int newLikes)
    {
        likes = newLikes;
    }
    public void incrementLikes()
    {
        likes++;
    }
}
