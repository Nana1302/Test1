package com.example.palawalygrace;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageButton toolbar_button;
    private ImageView add_vehicle;
    private ImageView view_list_vehicle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        toolbar_button = findViewById( R.id.home_button );
        add_vehicle = findViewById( R.id.add_vehicle);
        view_list_vehicle = findViewById( R.id.view_button );

        toolbar_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity.class);
                startActivity(intent);
            }

        });

        add_vehicle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AddVehicle.class);
                startActivity(intent);
            }

        });

        view_list_vehicle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ListOfVehicles.class);
                startActivity(intent);
            }

        });
    }
}