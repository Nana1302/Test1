package com.example.palawalygrace;

import android.app.DatePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;

import java.util.Calendar;
import java.util.Date;

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

    }

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
}

