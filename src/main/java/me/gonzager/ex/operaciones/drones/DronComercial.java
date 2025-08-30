package me.gonzager.ex.operaciones.drones;

import me.gonzager.ex.operaciones.misiones.Mision;

public class DronComercial extends Dron{

    public DronComercial(Integer autonomia, Integer nivelDeProcesamiento, Mision misionCiudad) {
        super(autonomia, nivelDeProcesamiento, misionCiudad);
    }

    @Override
    public Double eficienciaOperativa() {
        return super.eficienciaOperativa() + 15;
    }

    @Override
    public Boolean esAvanzado() {
        return Boolean.FALSE || misionCiudad.esAvanzado(this);
    }

}
