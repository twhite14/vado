package com.example.michael.mainpage;

/**
 * From Mike:
 * This is where user will be able to see all posted events by organizations on campus
 * to get this to work we need to be able to pull information from a server and load it onto here
 * without using to much memory. There is a good android developer article about how to do this that
 * we should look into. Also we should try and have the server do the bulk of the work. We also need
 * to look at the big O notation of my algorithm because it sucks.
 *
 * End of Mike
 */

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import java.util.ArrayList;

public class MainScreenStudent extends ActionBarActivity {

    public ArrayList<event> happenings = new ArrayList<event>();


    //anything you want to show up in the page as soon as it loads put in on create
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen_student);



        //these are BS classes made for hackathon
        event thing = new event("Track meet",4,1,2015,13,"cool thing");
        happenings.add(thing);

        event thing1 = new event("BaseBall",5,4,2015,13,"ball");
        happenings.add(thing1);

        event thing2 = new event("swim",4,5,2015,13,"water");
        happenings.add(thing2);

        event thing3 = new event("Sand storm",7,1,2015,13,"do do do ");
        happenings.add(thing3);

        event thing4 = new event("bike",4,1,2015,13,"wheels");
        happenings.add(thing4);

        TableLayout table = (TableLayout) findViewById(R.id.TableLayout);


        //this loop is what creates the main page

        for(int i = 0; i < happenings.size(); i++)
        {
            //
            TableRow row = new TableRow(this);
            //TableRow row2 = new TableRow(this);
            //TableRow row3 = new TableRow(this);

            happenings.get(i);
            TextView happenTV = new TextView(this);
            happenTV.setText(happenings.get(i).getName());
            row.addView(happenTV);



            Button upVote = new Button(this);
            upVote.setWidth(50);
            upVote.setText(happenings.get(i).getName().toString());
            table.addView(upVote);

            table.addView(row);
           // table.addView(row2);
           // table.addView(row3);



        }
    }

    //this method is bound to the search button
    public void onClick(View V)
    {
        //how you get the app to load the next page
        Intent i = new Intent(getApplicationContext(),search.class);
        startActivity(i);
    }

    //bound to explore button
    public void onClickEx(View V)
    {
        System.out.println(" test "); //see what was wrong dont need this line
        Intent i = new Intent(getApplicationContext(),showOrg.class);
        startActivity(i);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_screen_student, menu);
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
