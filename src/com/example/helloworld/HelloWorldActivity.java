package com.example.helloworld;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class HelloWorldActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_world);
        initDisplayButton();
        clearButton();
    }
    
     private void initDisplayButton() {
    	Button displayButton = (Button) findViewById(R.id.buttonDisplay);
    	displayButton.setOnClickListener(new OnClickListener() {
    		
    	@Override
        public void onClick(View arg0) {
    	    EditText editName = (EditText) findViewById(R.id.editTextName);
    	    TextView textDisplay = (TextView) findViewById(R.id.textViewDisplay);
    		String nameToDisplay = editName.getText().toString();
    		textDisplay.setText("Hello " + nameToDisplay +"!");
    	}
    });
     }
    	private void clearButton() {
        	Button clearButton = (Button) findViewById(R.id.buttonClear);
        	clearButton.setOnClickListener(new OnClickListener() {
        		
        	@Override
            public void onClick(View arg0) {
        		 EditText editName = (EditText) findViewById(R.id.editTextName);
        		 editName.setText("");
        	    TextView textDisplay = (TextView) findViewById(R.id.textViewDisplay);
        		textDisplay.setText("Hello World!");
        	}
        });
    }

}
