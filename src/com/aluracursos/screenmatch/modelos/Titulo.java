package com.aluracursos.screenmatch.modelos;

public class Titulo {
    private String nombre;
    private int fechaLanzamiento;
    private int duracionEnMinutos;
    private boolean incluidoEnPlan;

    public int getFechaLanzamiento() {
        return fechaLanzamiento;
    }

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
        System.out.println("Duracion: "+getDuracionEnMinutos()+" min");
    }

    public void evalua(double nota){
        sumaEvaluaciones+=nota;
        totalEvaluaciones++;
    }

    public double calculaMedia(){
        return sumaEvaluaciones/totalEvaluaciones;
    }




}
