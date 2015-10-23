package com.example.josiahwilliams.bluegreanfragment;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends ActionBarActivity {

    private int fragmentDisplayed = R.id.blue_fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //updates the fragment view
        updateFragment();

        View v = findViewById(android.R.id.content);
        //onclick listener to swap fragment after touch
        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateFragment();
            }
        });
    }

    //swaps fragments
    private void updateFragment() {
        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();

        //if fragment is blue, swap to green
        if (fragmentDisplayed == R.id.blue_fragment) {
            GreenFragment greenFragment = new GreenFragment();
            ft.replace(android.R.id.content, greenFragment);
            fragmentDisplayed = R.id.green_fragment;
        //if fragment is green, swap to blue
        } else {
            BlueFragment blueFragment = new BlueFragment();
            ft.replace(android.R.id.content, blueFragment);
            fragmentDisplayed = R.id.blue_fragment;
        }
        //commit
        ft.commit();
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
