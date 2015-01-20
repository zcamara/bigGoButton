package edu.washington.zcamara.biggobutton;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;

public class MainActivity extends Activity
{
    private int tapCounter;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        tapCounter = 0;
        final Button greenButt = (Button) findViewById(R.id.button);
        greenButt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tapCounter++;
                greenButt.setText("You have pushed me "+tapCounter+" times!");
            }
        });
    }
}
