package com.example.palawalygrace;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.example.palawalygrace.Model.VehicleDetails;

public class InsertTyre extends AppCompatActivity {

    private Button save;
    private DatabaseReference nanaDatabase;

    private String vehicleID, vehicle_no, insurance, tyre_brand, axsel, tyre_amount, puspakom, roadtax,
            tyre_change, maintenance, gearbox;

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
//                vehicle_no = getIntent().getStringExtra("vehicle no");
//                insurance = getIntent().getStringExtra("insurance");
//                tyre_brand = getIntent().getStringExtra("tyre brand");
//                axsel = getIntent().getStringExtra("axsel");
//                tyre_amount = getIntent().getStringExtra("tyre amount");
//                puspakom = getIntent().getStringExtra("puapakom");
//                roadtax = getIntent().getStringExtra("roadtax");
//                tyre_change = getIntent().getStringExtra("tyre change");
//                maintenance = getIntent().getStringExtra("maintenance");
//                gearbox = getIntent().getStringExtra("gearbox");

                tyre1 = Tyre1.getText().toString().trim();
                tyre2 = Tyre2.getText().toString().trim();
                tyre3 = Tyre3.getText().toString().trim();
                tyre4 = Tyre4.getText().toString().trim();
                tyre5 = Tyre5.getText().toString().trim();
                tyre6 = Tyre6.getText().toString().trim();
                tyre7 = Tyre7.getText().toString().trim();
                tyre8 = Tyre8.getText().toString().trim();
                tyre9 = Tyre9.getText().toString().trim();
                tyre10 = Tyre10.getText().toString().trim();
                tyre11 = Tyre11.getText().toString().trim();
                tyre12 = Tyre12.getText().toString().trim();
                tyre13 = Tyre13.getText().toString().trim();
                tyre14 = Tyre14.getText().toString().trim();
                tyre15 = Tyre15.getText().toString().trim();
                tyre16 = Tyre16.getText().toString().trim();
                tyre17 = Tyre17.getText().toString().trim();
                tyre18 = Tyre18.getText().toString().trim();
                tyre19 = Tyre19.getText().toString().trim();
                tyre20 = Tyre20.getText().toString().trim();
                tyre21 = Tyre21.getText().toString().trim();
                tyre22 = Tyre22.getText().toString().trim();

                Intent intent = new Intent(InsertTyre.this, ListOfVehicles.class);
                startActivity(intent);

                vehicleID = nanaDatabase.child("List Of Vehicles").getKey();

                VehicleDetails vehicleDetails = new VehicleDetails();
                vehicleDetails.setTyre1(tyre1);
                vehicleDetails.setTyre2(tyre2);
                vehicleDetails.setTyre3(tyre3);
                vehicleDetails.setTyre4(tyre4);
                vehicleDetails.setTyre5(tyre5);
                vehicleDetails.setTyre6(tyre6);
                vehicleDetails.setTyre7(tyre7);
                vehicleDetails.setTyre8(tyre8);
                vehicleDetails.setTyre9(tyre9);
                vehicleDetails.setTyre10(tyre10);
                vehicleDetails.setTyre11(tyre11);
                vehicleDetails.setTyre12(tyre12);
                vehicleDetails.setTyre13(tyre13);
                vehicleDetails.setTyre14(tyre14);
                vehicleDetails.setTyre15(tyre15);
                vehicleDetails.setTyre16(tyre16);
                vehicleDetails.setTyre17(tyre17);
                vehicleDetails.setTyre18(tyre18);
                vehicleDetails.setTyre19(tyre19);
                vehicleDetails.setTyre20(tyre20);
                vehicleDetails.setTyre21(tyre21);
                vehicleDetails.setTyre22(tyre22);

                nanaDatabase.child("List Of Vehicles").child(vehicleID).child("List Of Tyres").setValue(vehicleDetails);
            }
        });
    }
}
