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
    Calendar calendar = Calendar.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        et_nombre       = (EditText) findViewById(R.id.et_nombre);
        et_fecha        = (EditText) findViewById(R.id.et_fecha);
        et_telefono     = (EditText) findViewById(R.id.et_telefono);
        et_email        = (EditText) findViewById(R.id.et_email);
        et_descripcion  = (EditText) findViewById(R.id.et_descripcion);

        Button b1 = (Button)findViewById(R.id.btnSiguiente);


        et_fecha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateDate();
            }
        });


    }

    public void updateDate(){
        new DatePickerDialog(this, d, calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DAY_OF_WEEK)).show();
    }

    DatePickerDialog.OnDateSetListener d = new DatePickerDialog.OnDateSetListener() {
        @Override
        public void onDateSet(DatePicker view, int year, int month, int day) {
            et_fecha.setText(day + "/" + month + "/" + year);
        }
    };

    public void clickSiguiente(){
        Intent i = new Intent(MainActivity.this, DetalleFormulario.class);
        i.putExtra(getResources().getString(R.string.pnombre), et_nombre.getText());
        i.putExtra(getResources().getString(R.string.pfecha), et_fecha.getText());
        i.putExtra(getResources().getString(R.string.ptelefono), et_telefono.getText());
        i.putExtra(getResources().getString(R.string.pemail), et_email.getText());
        i.putExtra(getResources().getString(R.string.pdescripcion), et_descripcion.getText());
        startActivity(i);

    }

}
