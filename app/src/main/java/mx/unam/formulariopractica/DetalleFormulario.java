package mx.unam.formulariopractica;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetalleFormulario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_formulario);

        Bundle parametros    = getIntent().getExtras();

        String nombre       = parametros.getString(getResources().getString(R.string.pnombre));
        String fecha        = parametros.getString(getResources().getString(R.string.pfecha));
        String telefono     = parametros.getString(getResources().getString(R.string.ptelefono));
        String email        = parametros.getString(getResources().getString(R.string.pemail));
        String descripcion  = parametros.getString(getResources().getString(R.string.pdescripcion));

        TextView tvNombre       = (TextView)findViewById(R.id.tv_nombre);
        TextView tvFecha        = (TextView)findViewById(R.id.tv_fecha);
        TextView tvTelefono     = (TextView)findViewById(R.id.tv_telefono);
        TextView tvEmail        = (TextView)findViewById(R.id.tv_email);
        TextView tvDescripcion  = (TextView)findViewById(R.id.tv_descripcion);

        tvNombre.setText(nombre);
        tvFecha.setText(fecha);
        tvTelefono.setText(telefono);
        tvEmail.setText(email);
        tvDescripcion.setText(descripcion);

    }
}
