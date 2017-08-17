package mx.unam.formulariopractica;

import android.text.Editable;

/**
 * Created by AletsRdz on 16/08/17.
 */

public class Usuario {

    private String nombre;
    private String email;
    private String descripcion;
    private int telefono;
    private String fecha;


    public Usuario(String nombre, String email, String fecha) {
        this.nombre = nombre;
        this.email = email;
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}
