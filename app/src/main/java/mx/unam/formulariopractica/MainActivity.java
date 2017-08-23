package mx.unam.formulariopractica;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;


import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    private EditText etNombre, etFecha, etTelefono, etEmail, etDescripcion;
    private  Calendar calendar = Calendar.getInstance();
    private Button btnSiguiente;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        etNombre       = (EditText) findViewById(R.id.etNombre);
        etFecha        = (EditText) findViewById(R.id.etFecha);
        etTelefono     = (EditText) findViewById(R.id.etTelefono);
        etEmail        = (EditText) findViewById(R.id.etEmail);
        etDescripcion  = (EditText) findViewById(R.id.etDescripcion);


        etFecha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateDate();
            }
        });

        btnSiguiente = (Button)findViewById(R.id.btnSiguiente);

        btnSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, DetalleFormulario.class);

                intent.putExtra("nombre", etNombre.getText().toString());
                intent.putExtra("fecha", etFecha.getText().toString());
                intent.putExtra("telefono", etTelefono.getText().toString());
                intent.putExtra("email", etEmail.getText().toString());
                intent.putExtra("descripcion", etDescripcion.getText().toString());
                startActivity(intent);

            }
        });




    }

    public void updateDate(){
        new DatePickerDialog(this, d, calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DAY_OF_WEEK)).show();
    }

    DatePickerDialog.OnDateSetListener d = new DatePickerDialog.OnDateSetListener() {
        @Override
        public void onDateSet(DatePicker view, int year, int month, int day) {
            etFecha.setText(day + "/" + month + "/" + year);
        }
    };



}
