public class MascotaComprada {
    private Double precio;
    private String adoptante;
    private String tipoAnimal;

    public MascotaComprada(Double precio,String adoptante, String tipoAnimal){
        this.precio = precio;
        this.adoptante = adoptante;
        this.tipoAnimal = tipoAnimal;
      

}

    public Double getPrecio(){
    return precio;
}

    public void setPrecio(Double precio){
        this.precio = precio;
    }
    public String getAdoptante(){
            return adoptante;
}

    public void setAdoptante(String adoptante){
        this.adoptante = adoptante;

    }
    public String getTipoAnimal(){
    return tipoAnimal;
}

    public void setTipoAnimal(String tipoAnimal){
        this.tipoAnimal= tipoAnimal;

    }
}
