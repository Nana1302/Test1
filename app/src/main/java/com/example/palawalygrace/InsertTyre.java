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
                Intent intent = new Intent(InsertTyre.this, ListOfVehicles.class);
                startActivity(intent);
            }

        });

    }
}
