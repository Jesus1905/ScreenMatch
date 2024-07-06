package com.aluracursos.screenmatch.calculos;

import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Titulo;


public class CalculadoraTiempo {
    private int tiempoTotal;

    public void incluye(Titulo titulo){     //POLIMORFISMO, ESTAMOS REFERIENDONOS A UNA MISMA COSA(SERIE,PELICULA)
        this.tiempoTotal += titulo.getDuracionEnMinutos();
    }

    //METODO GETTER PARA PODER USARLO

    public int getTiempoTotal() {
        return tiempoTotal;
    }
}
