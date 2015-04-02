package com.example.michael.mainpage;

/**
 * From Mike:
 * org class was made by Tom it handles all information dealing with organizations. We need this to
 * be able to pull from a server as well. So we will need efficient sorting algorithms to load events
 * from the server to the class.
 *
 * End of Mike
 */

import java.util.ArrayList;

public class org
{


    //Class by Thomas White for HackPSU

        //Default information initialized to empty strings.
        private String name = "";
        private String category = "";
        private String website = "";
        private String address = "";
        private String phone = "";
        private String description = "";
        private String tag[] = {"","","","","","","","","",""};
        private ArrayList<event> events = new ArrayList<event>();

        //Constructors
        //Default contructor
        public org()
        {
            name = "HackPSU";
            category = "";
            website = "hackpsu.org";
            address = "";
            phone = "";
            description = "";

           // events.add(new event("HackPSU", "March 28-29", 12.00 , "Christina's baby"));
        }

        public org(String itsName, String category, String web, String address, String phone, String description)     //mike took out event param
        {
            this.name = itsName;
            this.category = category;
            this.website = web;
            this.address = address;
            this.phone = phone;
            this.description = description;
        }

        //getters and setters
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
            return tag;
        }

        public void setTags(String[] newTags)
        {
            tag = newTags;
        }



    /*

    public void setType(boolean newType)
    {
        memberType = newType;
    }*/
    }


