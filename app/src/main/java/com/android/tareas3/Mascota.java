package com.android.tareas3;

public class Mascota {

    private String nombre;
    private int voto;
    private int foto;

    public Mascota(String nombre, int voto, int foto) {
        this.nombre = nombre;
        this.voto = voto;
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVoto() {
        return voto;
    }

    public void setVoto(int voto) {
        this.voto = voto;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    @Override
    public String toString() {
        return "Mascotas{" +
                "nombre='" + nombre + '\'' +
                ", voto=" + voto +
                ", foto=" + foto +
                '}';
    }
}
