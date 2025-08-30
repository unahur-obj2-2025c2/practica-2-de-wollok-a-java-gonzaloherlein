package me.gonzager.ex.operaciones.misiones;

import me.gonzager.ex.operaciones.drones.Dron;

public class MisionExploracion implements Mision{

    @Override
    public Boolean esAvanzado(Dron dron) {
        if(dron.eficienciaOperativa() % 2 == 0){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public Double extra() {
        return 0.0;
    }

}
