package com.example.michael.mainpage;

/**
 * From Mike :
 * Home. java is the login page for all users. It also has a check box which the user can specify if
 * he is a webmaster of an organization.
 *
 * End of Mike
 */
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import java.lang.String;
import java.util.ArrayList;

public class Home extends ActionBarActivity {

    private String stringName;
    private String stringEmail = "";
    private String stringPassword ="";
    private boolean member = false;

    private EditText name;
    private EditText email;
    private EditText password;

    public ArrayList<user> mainUser = new ArrayList<user>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void getInfo( View v)
    {

        name = (EditText) findViewById(R.id.editText2);
        stringName = name.getText().toString();

        email = (EditText) findViewById(R.id.editText3);
        stringEmail = email.getText().toString();

        password = (EditText) findViewById(R.id.editText);
        stringPassword = password.getText().toString();


        user theUser = new user(stringName,stringEmail,stringEmail, member);
        mainUser.add(theUser);

        //this was code to test if home.java was pulling correct information do not mess with
        /*
        TextView output = new TextView(this);

        output=(TextView)findViewById(R.id.textView2);
        output.setText(mainUser.get(0).getName());
        */

        //takes user to main screen
        Intent i = new Intent(getApplicationContext(),MainScreenStudent.class);
        startActivity(i);
    }

    // the check box which will let the user specify if he is a webmaster
    public void yesNoOrg(View v)
    {
        final CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox);
        if(checkBox.isChecked())
        {
            Intent a = new Intent(getApplicationContext(),orgPg.class);
            startActivity(a);
        }
    }

    //default methods made by android studio don't touch unless needed
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_home, menu);
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
