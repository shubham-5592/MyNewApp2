package com.old.trafford.shubham.mynewapp2;

import android.app.Activity;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.Button;
import android.graphics.Color;
import android.widget.EditText;
import android.content.res.Resources;
import android.util.TypedValue;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        RelativeLayout myLayout = new RelativeLayout(this);

        //region BUTTON

        Button myButton = new Button(this);


        myLayout.setBackgroundColor(Color.RED);
        myButton.setBackgroundColor(Color.YELLOW);
        myButton.setText("Aloo Lelo");

        RelativeLayout.LayoutParams buttonDetails =
                new RelativeLayout.LayoutParams
                        (
                            RelativeLayout.LayoutParams.WRAP_CONTENT,
                            RelativeLayout.LayoutParams.WRAP_CONTENT
                        );

        buttonDetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
        buttonDetails.addRule(RelativeLayout.CENTER_VERTICAL);

        myLayout.addView(myButton,buttonDetails);

        myButton.setId(1);

        //endregion
        //region EditText

        EditText username = new EditText(this);

        RelativeLayout.LayoutParams usernameDetails =
                new RelativeLayout.LayoutParams
                        (
                                RelativeLayout.LayoutParams.WRAP_CONTENT,
                                RelativeLayout.LayoutParams.WRAP_CONTENT
                        );

        usernameDetails.addRule(RelativeLayout.ABOVE,myButton.getId());
        usernameDetails.addRule(RelativeLayout.CENTER_HORIZONTAL);

        usernameDetails.setMargins(0,0,0,50);
        myLayout.addView(username,usernameDetails);

        username.setId(2);

        Resources reso = getResources();

        int pix = (int)TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,200,reso.getDisplayMetrics());

        username.setWidth(pix);

        //endregion

        setContentView(myLayout);

    }

}

/*public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
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
}*/