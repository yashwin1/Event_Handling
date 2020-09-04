package com.example.event_handling;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        Button yashwinButton = (Button)findViewById(R.id.yashwinButton);

        yashwinButton.setOnClickListener(
                new OnClickListener(){           /* Event Listener */
                    public void onClick(View v){        /* Callback method */
                        TextView yashwinText = (TextView)findViewById(R.id.yashwinText);
                        yashwinText.setText("Great job bruh!");
                    }
                }
        );

        yashwinButton.setOnLongClickListener(           //For longer clicks
                new Button.OnLongClickListener(){
                    public boolean onLongClick(View v){
                        TextView yashwinText = (TextView)findViewById(R.id.yashwinText);
                        yashwinText.setText("Who hoo, long message");
                        return false;                   /* If we return false then as soon as we release the button , we get the text of a single click. */
                    }
                }
        );



        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
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
