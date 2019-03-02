package com.example.alamin.converternumbersystem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Spinner sp1;
    ArrayAdapter<CharSequence> array;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sp1 = (Spinner)findViewById(R.id.spinner1);
        array= ArrayAdapter.createFromResource(this,R.array.Number_item,
                android.R.layout.simple_spinner_item);
        array.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp1.setAdapter(array);

        sp1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),parent.getItemAtPosition(position) +
                        " was selected",Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
