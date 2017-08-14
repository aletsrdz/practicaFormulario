package mx.unam.formulariopractica;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    EditText et_nombre, et_fecha, et_telefono, et_email, et_descripcion;
    private int year, month, day, i, i2, i1;
    Calendar c = Calendar.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        year = c.get(Calendar.YEAR);
        month = c.get(Calendar.MONTH);
        day = c.get(Calendar.DAY_OF_WEEK);

        et_nombre       = (EditText) findViewById(R.id.et_nombre);
        et_fecha        = (EditText) findViewById(R.id.et_fecha);
        et_telefono     = (EditText) findViewById(R.id.et_telefono);
        et_email        = (EditText) findViewById(R.id.et_email);
        et_descripcion  = (EditText) findViewById(R.id.et_descripcion);


        et_fecha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateDate();
            }
        });




    }
        public void clickSiguiente(){
        Button b1 = (Button)findViewById(R.id.btnSiguiente);
        b1.setText("Cambio de texto");
    }

        public void updateDate(){
            new DatePickerDialog(this, d, c.get(Calendar.YEAR), c.get(Calendar.MONTH), c.get(Calendar.DAY_OF_WEEK)).show();
        }

        DatePickerDialog.OnDateSetListener d = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
                c.set(Calendar.YEAR, i);
                c.set(Calendar.MONTH, i1);
                c.set(Calendar.DAY_OF_WEEK, i2);
                updateFecha();
            }
        };

        private void updateFecha(){
            et_fecha.setText(day +" - " + month + " - "  + year);
        }





}
