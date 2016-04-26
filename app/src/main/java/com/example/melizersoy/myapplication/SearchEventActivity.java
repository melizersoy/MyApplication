package com.example.melizersoy.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class SearchEventActivity extends AppCompatActivity {

    Spinner sCities, sDistrict, sTypes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_event);

        sCities = (Spinner) findViewById(R.id.spinnerCity);
        sDistrict = (Spinner) findViewById(R.id.spinnerDistrict);
        sTypes = (Spinner) findViewById(R.id.spinnerType);

        ArrayAdapter<CharSequence> aCity = ArrayAdapter.createFromResource(this,
                R.array.cities, android.R.layout.simple_spinner_item);
        aCity.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sDistrict.setAdapter(aCity);

        ArrayAdapter<CharSequence> aDistrict = ArrayAdapter.createFromResource(this,
                R.array.ankaraSDistrict, android.R.layout.simple_spinner_item);
        aDistrict.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sCities.setAdapter(aDistrict);

        ArrayAdapter<CharSequence> aType = ArrayAdapter.createFromResource(this,
                R.array.types, android.R.layout.simple_spinner_item);
        aType.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sTypes.setAdapter(aType);

        sCities.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position)
                {
                    case 0:
                        break;
                    case 1:
                        break;
                    case 2:
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
