package com.example.palawalygrace;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ListOfVehicles extends AppCompatActivity {

    private ImageButton toolbar_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.list_of_vehicles );

        toolbar_button = findViewById( R.id.home_button );

        toolbar_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ListOfVehicles.this, MainActivity.class);
                startActivity(intent);
            }

        });
    }
}
