package com.example.michael.mainpage;

/**
 * From Mike
 * This loads user info from organization page and puts the class into the array list
 * The list needs to be moved to the server and not in the Phone so we don't waste phone memory.
 *
 * End of Mike
**/

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import java.util.ArrayList;
import android.widget.Button;

public class orgPg extends ActionBarActivity {

    //for organization
    private String stringName;
    private String stringCategory = "";
    private String stringWebsite ="";
    private String stringAddress ="";
    private String stringPhone ="";
    private String stringDescription = "";


    private EditText nameOrg;
    private EditText categoryOrg;
    private EditText website;
    private EditText address;
    private EditText phone;
    private EditText description;

    //array list for orgs
    public ArrayList<org> Orgs = new ArrayList<org>();
    //information for events made by organizations
    public ArrayList<event> happenings = new ArrayList<event>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_org_pg);
    }


    public void getInfoOrg(View v)
    {
        //bring info in from text filds set them to strings
        nameOrg = (EditText) findViewById(R.id.editText4);
        stringName = nameOrg.getText().toString();

        categoryOrg = (EditText) findViewById(R.id.editText5);
        stringCategory = categoryOrg.getText().toString();

        website = (EditText) findViewById(R.id.editText7);
        stringWebsite = website.getText().toString();

        address = (EditText) findViewById(R.id.editText8);
        stringAddress = address.getText().toString();

        phone = (EditText) findViewById(R.id.editText9);
        stringPhone = phone.getText().toString();

        /*
        description = (EditText) findViewById(R.id.editText);
        stringDescription = description.getText().toString();
*/


        //make new class
        org club = new org(stringName, stringCategory,stringWebsite,stringAddress,stringPhone, stringDescription);
        Orgs.add(club);

        onClickOrg(v);

    }

    //takes user to main screen
    public void onClickOrg(View v)
    {
        //takes you to main class when finished with editing org
        Intent i = new Intent(getApplicationContext(),MainScreenStudent.class);
        startActivity(i);
    }

    //add events
    public void addEventOnClick()
    {

        event thing = new event();
        happenings.add(thing);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_org_pg, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
