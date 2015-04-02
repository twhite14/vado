package com.example.michael.mainpage;

/**
 * From Mike:
 *
 * sadly we couldn't get this page to work I believe this page to be able to have an array list of
 * events that are taken from the orgs class and shown on event page for that organization
 *
 * End of Mike
 */

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;


public class eventPage extends ActionBarActivity {

    public  ArrayList<event> calendar(double[] startDate, double[] endDate, ArrayList<org> orgs)
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
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_page);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_event_page, menu);
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
