package me.gonzager.ex.operaciones;

public class Sensor {
    private final Integer capacidad;
    private final Integer durabilidad;
    private final Boolean mejorasTecnologicas;
    
    public Sensor(Integer capacidad, Integer durabilidad, Boolean mejorasTecnologicas) {
        this.capacidad = capacidad;
        this.durabilidad = durabilidad;
        this.mejorasTecnologicas = mejorasTecnologicas;
    }

    public Integer getCapacidad() {
        return capacidad;
    }

    public Integer getDurabilidad() {
        return durabilidad;
    }

    public Boolean getMejorasTecnologicas() {
        return mejorasTecnologicas;
    }

    public Boolean esDuradero(){
        return this.getDurabilidad() > this.getCapacidad() * 2;
    }

    public Double eficienciaSensor(){
        return (double) (mejorasTecnologicas ? capacidad * 2 : capacidad);
    }
}
