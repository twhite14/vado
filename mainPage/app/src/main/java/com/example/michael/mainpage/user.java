package com.example.michael.mainpage;



/**
 * From Mike
 * Created Tom this is back end of user that will take information from home.java and save it in
 * a user data base.
 *
 * End Mike
 */


public class user
{


    //Class by Thomas White for HackPSU

        //Default information initialized to empty strings.
        private String firstName;
        private String lastName;
        private String email;
        private String passSalt;
        private String encryptedPass;
        private boolean memberType; //true for organizer, false for member

        //Constructors
        //Default Constructor
        public user()
        {
            firstName = "Sample";
            lastName = "Person";
            email = "Sample@hackpsu.edu";
            passSalt = "md5";
            encryptedPass = "shouldNeverBeUsed";
            memberType = false; //true for organizer, false for member
        }

        public user(String first, String last, String mail, boolean type)
        {
            firstName = first;
            lastName = last;
            email = mail;
            //passSalt = newSalt;
            memberType = type;
        }
        //Concatenated name (String)
        public String getName()
        {
            return (firstName + " " + lastName);
        }

        public void setName(String first, String last)
        {
            firstName = first;
            lastName = last;
        }

        //Email (String)
        public String getEmail()
        {
            return email;
        }

        public void setEmail(String mail)
        {
            email = mail;
        }

        //Type (boolean)
        public boolean getType()
        {
            return memberType;
        }

        public void setType(boolean newType)
        {
            memberType = newType;
        }
    }






