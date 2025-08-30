package me.gonzager.ex.operaciones;

public class Zona {
    private Integer tamanioTotal;
    private Integer cantidadDeOperaciones;
    
    public Zona(Integer tamanioTotal, Integer cantidadDeOperaciones) {
        this.tamanioTotal = tamanioTotal;
        this.cantidadDeOperaciones = cantidadDeOperaciones;
    }

    public Integer getTamanioTotal() {
        return tamanioTotal;
    }

    public void setTamanioTotal(Integer tamanioTotal) {
        this.tamanioTotal = tamanioTotal;
    }

    public Integer getCantidadDeOperaciones() {
        return cantidadDeOperaciones;
    }

    public void setCantidadDeOperaciones(Integer cantidadDeOperaciones) {
        this.cantidadDeOperaciones = cantidadDeOperaciones;
    }
}
