package me.gonzager.ex.operaciones.misiones;

import java.util.List;

import me.gonzager.ex.operaciones.Sensor;
import me.gonzager.ex.operaciones.drones.Dron;

public class MisionVigilancia implements Mision{

    private List<Sensor> sensores;


    public MisionVigilancia(List<Sensor> sensores) {
        this.sensores = sensores;
    }

    @Override
    public Boolean esAvanzado(Dron dron) {
        return sensores.stream().allMatch(s -> s.esDuradero());
    }

    @Override
    public Double extra() {
        return sensores.stream().mapToDouble(s -> s.eficienciaSensor()).sum();
    }
}
