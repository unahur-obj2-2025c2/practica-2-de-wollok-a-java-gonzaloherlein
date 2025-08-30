package me.gonzager.ex.operaciones.drones;

import me.gonzager.ex.operaciones.misiones.Mision;

public class DronSeguridad extends Dron{

    public DronSeguridad(Integer autonomia, Integer nivelDeProcesamiento, Mision misionCiudad) {
        super(autonomia, nivelDeProcesamiento, misionCiudad);
    }

    @Override
    public Boolean esAvanzado() {
        return this.getNivelDeProcesamiento() > 50 || misionCiudad.esAvanzado(this);
    }

    
}
