package me.gonzager.ex.operaciones.drones;

import me.gonzager.ex.operaciones.misiones.Mision;

public abstract class Dron {
    protected Integer autonomia;
    protected Integer nivelDeProcesamiento;
    protected Mision misionCiudad;

    public Dron(Integer autonomia, Integer nivelDeProcesamiento, Mision misionCiudad) {
        this.autonomia = autonomia;
        this.nivelDeProcesamiento = nivelDeProcesamiento;
        this.misionCiudad = misionCiudad;
    }

    public Integer getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(Integer autonomia) {
        this.autonomia = autonomia;
    }

    public Integer getNivelDeProcesamiento() {
        return nivelDeProcesamiento;
    }

    public void setNivelDeProcesamiento(Integer nivelDeProcesamiento) {
        this.nivelDeProcesamiento = nivelDeProcesamiento;
    }

    public Mision getMisionCiudad() {
        return misionCiudad;
    }

    public void setMisionCiudad(Mision misionCiudad) {
        this.misionCiudad = misionCiudad;
    }

    public abstract Boolean esAvanzado();

    public Double eficienciaOperativa(){
        return this.autonomia * 10 + misionCiudad.extra();
    }
}
