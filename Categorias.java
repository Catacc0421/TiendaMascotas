public class Categorias {
    private String tamano;
    private Double peso;
    private String pelaje;
    private String tipoAlimentacion;
    private String habitat;

    public Categorias(String tamano,Double peso, String pelaje, String tipoAlimentacion, String habitat){
        this.tamano = tamano;
        this.peso = peso;
        this.pelaje = pelaje;
        this.tipoAlimentacion = tipoAlimentacion;
        this.habitat = habitat;

}

    public String getTamano(){
    return tamano;
}

    public void setTamano(String tamano){
        this.tamano = tamano;
    }

    public Double getPeso(){
        return peso;

    }

    public void setPeso(Double peso){
        this.peso= peso;
    }
    public String getPelaje(){
    return pelaje;
}

    public void setPelaje(String pelaje){
        this.pelaje = pelaje;
    }
    public String getTipoAlimentacion(){
    return tipoAlimentacion;
}

    public void setTipoAlimentacion(String tipoAlimentacion){
        this.tipoAlimentacion = tipoAlimentacion;
    }
    public String getHabitat(){
    return habitat;
}

    public void setHabitat(String habitat){
        this.habitat = habitat;
    }

 
    }    

