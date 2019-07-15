package com.example.palawalygrace;

import android.app.DatePickerDialog;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.Calendar;

public class AddVehicle extends AppCompatActivity {

    private EditText Vehicle_No;
    private EditText Insurance;
    private EditText Tyre_Brand;
    private EditText Axsel;
    private EditText Tyre_Amount;

    private EditText Puspakom;
    private EditText Roadtax;
    private EditText TyreChange;
    private EditText Maintenance;
    private EditText Gearbox;

    private ImageButton toolbar_button;
    private Button continue_button;

    private Calendar mcalendar = Calendar.getInstance();
    private int day,month,year;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.add_vehicle );

        Vehicle_No = findViewById( R.id.Vehicle_No );
        Insurance = findViewById( R.id.Insurance );
        Tyre_Brand = findViewById( R.id.Tyre_Brand );
        Axsel = findViewById( R.id.Axsel );
        Tyre_Amount = findViewById( R.id.Tyre_Amount );

        Puspakom = findViewById( R.id.Puspakom_Expired_Date );
        Roadtax = findViewById( R.id.Roadtax_Expired_Date );
        TyreChange = findViewById( R.id.Tyre_When_Change );
        Maintenance = findViewById( R.id.Maintenance_Date );
        Gearbox = findViewById( R.id.Change_Gearbox_Date );

        Puspakom.setOnClickListener(mClickListener);
        Roadtax.setOnClickListener(mClickListener2);
        TyreChange.setOnClickListener(mClickListener3);
        Maintenance.setOnClickListener(mClickListener4);
        Gearbox.setOnClickListener(mClickListener5);

        day = mcalendar.get(Calendar.DAY_OF_MONTH);
        year = mcalendar.get(Calendar.YEAR);
        month = mcalendar.get(Calendar.MONTH);

        toolbar_button = findViewById( R.id.home_button );
        continue_button = findViewById( R.id.continue_button );

        // Toolbar
//        toolbar_button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(AddVehicle.this, MainActivity.class);
//                startActivity(intent);
//            }
//
//        });
        // End of toolbar

        continue_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String vehicle_no  = Vehicle_No.getText().toString().trim();
                String insurance  = Insurance.getText().toString().trim();
                String tyre_brand  = Tyre_Brand.getText().toString().trim();
                String axsel  = Axsel.getText().toString().trim();
                String tyre_amount  = Tyre_Amount.getText().toString().trim();

                String puspakom  = Puspakom.getText().toString().trim();
                String roadtax  = Roadtax.getText().toString().trim();
                String tyre_change  = TyreChange.getText().toString().trim();
                String maintenance  = Maintenance.getText().toString().trim();
                String gearbox  = Gearbox.getText().toString().trim();

                Intent intent = new Intent(AddVehicle.this, InsertTyre.class);
                intent.putExtra("Vehicle details are inserted.", vehicle_no);
                intent.putExtra("Vehicle details are inserted.", insurance);
                intent.putExtra("Vehicle details are inserted.", tyre_brand);
                intent.putExtra("Vehicle details are inserted.", axsel);
                intent.putExtra("Vehicle details are inserted.", tyre_amount);

                intent.putExtra("Vehicle details are inserted.", puspakom);
                intent.putExtra("Vehicle details are inserted.", roadtax);
                intent.putExtra("Vehicle details are inserted.", tyre_change);
                intent.putExtra("Vehicle details are inserted.", maintenance);
                intent.putExtra("Vehicle details are inserted.", gearbox);
                startActivity(intent);
            }

        });    }

    // Date Picker
    View.OnClickListener mClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            DateDialog();
        }
    };

    View.OnClickListener mClickListener2 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            DateDialog2();
        }
    };

    View.OnClickListener mClickListener3 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            DateDialog3();
        }
    };

    View.OnClickListener mClickListener4 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            DateDialog4();
        }
    };

    View.OnClickListener mClickListener5 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            DateDialog5();
        }
    };


    public void DateDialog(){
        DatePickerDialog.OnDateSetListener listener=new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth)
            {
                Puspakom.setText(dayOfMonth + "/" + monthOfYear + "/" + year);
            }};
        DatePickerDialog dpDialog=new DatePickerDialog(AddVehicle.this, listener, year, month, day);
        dpDialog.show();
    }

    public void DateDialog2(){
        DatePickerDialog.OnDateSetListener listener=new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth)
            {
                Roadtax.setText(dayOfMonth + "/" + monthOfYear + "/" + year);
            }};
        DatePickerDialog dpDialog=new DatePickerDialog(AddVehicle.this, listener, year, month, day);
        dpDialog.show();
    }

    public void DateDialog3(){
        DatePickerDialog.OnDateSetListener listener=new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth)
            {
                TyreChange.setText(dayOfMonth + "/" + monthOfYear + "/" + year);

            }};
        DatePickerDialog dpDialog=new DatePickerDialog(AddVehicle.this, listener, year, month, day);
        dpDialog.show();
    }

    public void DateDialog4(){
        DatePickerDialog.OnDateSetListener listener=new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth)
            {
                Maintenance.setText(dayOfMonth + "/" + monthOfYear + "/" + year);
            }};
        DatePickerDialog dpDialog=new DatePickerDialog(AddVehicle.this, listener, year, month, day);
        dpDialog.show();
    }

    public void DateDialog5(){
        DatePickerDialog.OnDateSetListener listener=new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth)
            {
                Gearbox.setText(dayOfMonth + "/" + monthOfYear + "/" + year);
            }};
        DatePickerDialog dpDialog=new DatePickerDialog(AddVehicle.this, listener, year, month, day);
        dpDialog.show();
    }
    // End of date picker

}

