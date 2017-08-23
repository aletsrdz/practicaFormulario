package mx.unam.formulariopractica;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DetalleFormulario extends AppCompatActivity {

    private  TextView tvNombre, tvFecha, tvTelefono, tvEmail, tvDescripcion;
    private  Button btnEditar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_formulario);

        Bundle parametros = getIntent().getExtras();

        String nombre = parametros.getString("nombre").toString();
        String fecha = parametros.getString("fecha").toString();
        String telefono = parametros.getString("telefono").toString();
        String email = parametros.getString("email").toString();
        String descripcion = parametros.getString("descripcion").toString();

        tvNombre       = (TextView)findViewById(R.id.tvNombre);
        tvFecha        = (TextView)findViewById(R.id.tvFecha);
        tvTelefono     = (TextView)findViewById(R.id.tvTelefono);
        tvEmail        = (TextView)findViewById(R.id.tvEmail);
        tvDescripcion  = (TextView)findViewById(R.id.tvDescripcion);

        btnEditar = (Button)findViewById(R.id.btnEditar);

        tvNombre.setText(nombre);
        tvFecha.setText(fecha);
        tvTelefono.setText(telefono);
        tvEmail.setText(email);
        tvDescripcion.setText(descripcion);



        btnEditar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                /*
                Intent editar = new Intent(DetalleFormulario.this, MainActivity.class);
                startActivity(editar);
                */
            }
        });









    }
}
