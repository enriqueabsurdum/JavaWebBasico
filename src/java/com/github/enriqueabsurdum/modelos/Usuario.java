package com.github.enriqueabsurdum.modelos;

public class Usuario {

    private Integer id;
    private String run;
    private String nombre;
    private String apellido;
    private int edad;

    public Usuario() {
    }

    public Usuario(Integer id, String run, String nombre, String apellido, int edad) {
        this.id = id;
        this.run = run;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRun() {
        return run;
    }

    public void setRun(String run) {
        this.run = run;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", run=" + run + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + '}';
    }

}
