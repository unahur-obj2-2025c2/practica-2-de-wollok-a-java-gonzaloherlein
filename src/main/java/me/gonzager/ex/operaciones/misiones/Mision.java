package me.gonzager.ex.operaciones.misiones;

import me.gonzager.ex.operaciones.drones.Dron;

public interface Mision {

    public abstract Boolean esAvanzado(Dron dron);
    public abstract Double extra();
}
