package androidclass.postboard;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class EventsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events);
        //comment
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);


        //http://stackoverflow.com/questions/16022615/how-to-load-programmatically-a-layout-xml-file-in-android
        ViewGroup inclusionViewGroup = (ViewGroup) findViewById(R.id.inclusionLayout);

        View event1 = LayoutInflater.from(this).inflate(R.layout.event_object_layout, null);
        View event2 = LayoutInflater.from(this).inflate(R.layout.event_object_layout, null);
        View event3 = LayoutInflater.from(this).inflate(R.layout.event_object_layout, null);

        inclusionViewGroup.addView(event1);
        inclusionViewGroup.addView(event2);
        inclusionViewGroup.addView(event3);

        TextView title1 = (TextView) findViewById(R.id.eventTitle);
        title1.setText("Test this");

        Button uploadButton = (Button) findViewById(R.id.uploadButton);

/*
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        */
    }

    public void upload(View view)
    {
        Intent intent = new Intent(EventsActivity.this, UploadActivity.class);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_events, menu);
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
