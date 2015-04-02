package com.example.michael.mainpage;


import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;


import java.util.ArrayList;



public class showOrg extends ActionBarActivity {

    public static ArrayList<org> org_list = new ArrayList<org>();
    public ArrayList<event> empty_event;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_org);



        TableLayout table = (TableLayout) findViewById(R.id.tableLayout);

        org club1 = new org("3-d Printing","Engineering","sites.psu.edu/3dprintingclub","3-d printing is rad","","");
        org_list.add(club1);

        org club2 = new org("Hersey Kisses For the Kids","philantropy","","","","Four Diamonds fun");
        org_list.add(club2);

        org club3 = new org("TEDx PSU","Special interest","","","","interesting talks");
        org_list.add(club3);

                /*
        org club4 = new org("3-d Printing","Engineering","sites.psu.edu/3dprintingclub","3-d printing is rad","","");
        org_list.add(club4)

        org club5 = new org("3-d Printing","Engineering","sites.psu.edu/3dprintingclub","3-d printing is rad","","");
        org_list.add(club5)
*/

        for(int i = 0; i < org_list.size(); i++)
        {
            TableRow row = new TableRow(this);
            //TableRow row2 = new TableRow(this);
            //TableRow row3 = new TableRow(this);
            org club = new org();
            org_list.add(club);

            TextView happenTV = new TextView(this);
            happenTV.setText(org_list.get(i).getName());
            row.addView(happenTV);





            table.addView(row);
           // table.addView(row2);
            //table.addView(row3);



        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_show_org, menu);
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
