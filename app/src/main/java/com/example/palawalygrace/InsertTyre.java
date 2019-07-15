package com.example.palawalygrace;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class InsertTyre extends AppCompatActivity {

    private Button save;
    private DatabaseReference nanaDatabase;

    private EditText Tyre1, Tyre2, Tyre3, Tyre4, Tyre5, Tyre6, Tyre7, Tyre8, Tyre9, Tyre10, Tyre11, Tyre12,
            Tyre13, Tyre14, Tyre15, Tyre16, Tyre17, Tyre18, Tyre19, Tyre20, Tyre21, Tyre22;

    String  tyre1, tyre2, tyre3, tyre4, tyre5, tyre6, tyre7, tyre8, tyre9, tyre10, tyre11, tyre12,
            tyre13, tyre14, tyre15, tyre16, tyre17, tyre18, tyre19, tyre20, tyre21, tyre22;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.insert_tyre );

        Tyre1 = findViewById( R.id.Tyre1 );
        Tyre2 = findViewById( R.id.Tyre2 );
        Tyre3 = findViewById( R.id.Tyre3 );
        Tyre4 = findViewById( R.id.Tyre4 );
        Tyre5 = findViewById( R.id.Tyre5 );
        Tyre6 = findViewById( R.id.Tyre6 );
        Tyre7 = findViewById( R.id.Tyre7 );
        Tyre8 = findViewById( R.id.Tyre8 );
        Tyre9 = findViewById( R.id.Tyre9 );
        Tyre10 = findViewById( R.id.Tyre10 );
        Tyre11 = findViewById( R.id.Tyre11 );
        Tyre12 = findViewById( R.id.Tyre12 );
        Tyre13 = findViewById( R.id.Tyre13 );
        Tyre14 = findViewById( R.id.Tyre14 );
        Tyre15 = findViewById( R.id.Tyre15 );
        Tyre16 = findViewById( R.id.Tyre16 );
        Tyre17 = findViewById( R.id.Tyre17 );
        Tyre18 = findViewById( R.id.Tyre18 );
        Tyre19 = findViewById( R.id.Tyre19 );
        Tyre20 = findViewById( R.id.Tyre20 );
        Tyre21 = findViewById( R.id.Tyre21 );
        Tyre22 = findViewById( R.id.Tyre22 );

        nanaDatabase = FirebaseDatabase.getInstance().getReference();

        save = findViewById( R.id.save_button );

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tyre1 = Tyre1.getText().toString().trim();
                String tyre2 = Tyre2.getText().toString().trim();
                String tyre3 = Tyre3.getText().toString().trim();
                String tyre4 = Tyre4.getText().toString().trim();
                String tyre5 = Tyre5.getText().toString().trim();
                String tyre6 = Tyre6.getText().toString().trim();
                String tyre7 = Tyre7.getText().toString().trim();
                String tyre8 = Tyre8.getText().toString().trim();
                String tyre9 = Tyre9.getText().toString().trim();
                String tyre10 = Tyre10.getText().toString().trim();
                String tyre11 = Tyre11.getText().toString().trim();
                String tyre12 = Tyre12.getText().toString().trim();
                String tyre13 = Tyre13.getText().toString().trim();
                String tyre14 = Tyre14.getText().toString().trim();
                String tyre15 = Tyre15.getText().toString().trim();
                String tyre16 = Tyre16.getText().toString().trim();
                String tyre17 = Tyre17.getText().toString().trim();
                String tyre18 = Tyre18.getText().toString().trim();
                String tyre19 = Tyre19.getText().toString().trim();
                String tyre20 = Tyre20.getText().toString().trim();
                String tyre21 = Tyre21.getText().toString().trim();
                String tyre22 = Tyre22.getText().toString().trim();

                Intent intent = new Intent(InsertTyre.this, ListOfVehicles.class);
                startActivity(intent);

                InsertDetails();
            }

        });

    }

    private void InsertDetails(String userId, String name, String email) {
        final DatabaseReference s = databaseReference;
        vehicleID = s.child("Vehicle Details").push().getKey();

        VehicleDetails vehicleDetails = new VehicleDetails();

        s.child("Vehicle Details").child(vehicleID).setValue(vehicleDetails);

    }
}
