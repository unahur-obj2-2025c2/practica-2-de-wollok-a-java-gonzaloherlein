package me.gonzager.ex.operaciones;

import java.util.List;

import me.gonzager.ex.operaciones.drones.Dron;

public class Escuadron {
    private Integer dronesMaximo;
    private List<Dron> drones;

    public Escuadron(Integer dronesMaximo, List<Dron> drones) {
        this.dronesMaximo = dronesMaximo;
        this.drones = drones;
    }

    public Integer getDronesMaximo() {
        return dronesMaximo;
    }

    public void setDronesMaximo(Integer dronesMaximo) {
        this.dronesMaximo = dronesMaximo;
    }

    public List<Dron> getDrones() {
        return drones;
    }

    public void setDrones(List<Dron> drones) {
        this.drones = drones;
    }
    
    public Boolean puedeOperarEn_(Zona zona){
        return this.escuadronTieneUnDronAvanzado() && capacidadOperativa() > zona.getTamanioTotal() * 2;
    }

    public Boolean escuadronTieneUnDronAvanzado(){
        return drones.stream().anyMatch(d -> d.esAvanzado());
    }

    public void agregarDron(Dron dron){
        if(dronesMaximo == drones.size()){
            throw new RuntimeException("Supera la cantidad máxima definida por la ciudad");
        }
        drones.add(dron);
    }

    public void operarEnLaZona_(Zona zona){
        if(puedeOperarEn_(zona)){
            zona.setCantidadDeOperaciones(zona.getCantidadDeOperaciones() + 1);
            drones.stream().forEach(s -> s.setAutonomia(s.getAutonomia() - 2));
        }
    }

    public Double capacidadOperativa(){
        return drones.stream().mapToDouble(d -> d.eficienciaOperativa()).sum();
    }
}
