package com.example.brianhyland.hellobutton;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int mCounter = 0;
    private TextView mMessageTextView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // this method is called when the app launches
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //code you add goes after setContentView
        //comment to test Github refresh
        mMessageTextView = findViewById(R.id.message_textview);

        Button resetButton = findViewById(R.id.reset_button);
        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCounter = 0;
                updateView();
            }
        });
        Log.d("HB", "This is a test log. Logs are important");
        //Log.d( tag: "HB", msg: "This is a log cat log. Logs are important!");

    }

    public void handleDecrement(View view){
        mCounter -= 1;
        updateView();

    }

    public void handleIncrement(View view){
        mCounter += 1;
        updateView();
    }

    private void updateView(){
        mMessageTextView.setText(getString(R.string.message_format, mCounter));
    }
}
