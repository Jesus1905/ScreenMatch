package com.aluracursos.screenmatch.modelos;

import com.aluracursos.screenmatch.calculos.Clasificacion;

public class Pelicula extends Titulo implements Clasificacion {   //relacion de herencia con 'extends'
    private String director;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
    //PARA LA INTERFACE DEBO IMPLEMENTAR ESTE METODO
    @Override
    public int getClasificacion() {
        return (int)(calculaMedia()/2); //CASTEANDO EL VALOR
    }

    @Override
    public String toString() {
        return "Pelicula: "+this.getNombre()+" ("+getFechaLanzamiento()+")";
    }

    /*  private String nombre;
    private int fechaLanzamiento;
    private int duracionEnMinutos;
    private boolean incluidoEnPlan;
    private double sumaEvaluaciones;
    private int totalEvaluaciones;

    public String getNombre() {
        return nombre;
    }

    public int getDuracionEnMinutos() {
        return duracionEnMinutos;
    }

    public boolean isIncluidoEnPlan() {
        return incluidoEnPlan;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaLanzamiento(int fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public void setIncluidoEnPlan(boolean incluidoEnPlan) {
        this.incluidoEnPlan = incluidoEnPlan;
    }

    public int getTotalEvaluaciones(){
        return totalEvaluaciones;
    }

    public void muestraFichaTecnica(){
        System.out.println("Nombre de la película: "+nombre);
        System.out.println("Fecha de lanzamiento: "+fechaLanzamiento);
        System.out.println("Duracion"+duracionEnMinutos+"min");
    }

    public void evalua(double nota){
        sumaEvaluaciones+=nota;
        totalEvaluaciones++;
    }

    public double calculaMedia(){
        return sumaEvaluaciones/totalEvaluaciones;
    }

*/
}
