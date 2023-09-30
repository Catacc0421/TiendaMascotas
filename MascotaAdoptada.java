public class MascotaAdoptada {
    private String fechaAdopcion;
    private String adoptante;
    private String tipoAnimal;

    public MascotaAdoptada(String fechaAdopcion,String adoptante, String tipoAnimal){
        this.fechaAdopcion = fechaAdopcion;
        this.adoptante = adoptante;
        this.tipoAnimal = tipoAnimal;
      

}

    public String getFechaAdopcion(){
    return fechaAdopcion;
}

    public void setFechaAdopcion(String fechaAdopcion){
        this.fechaAdopcion = fechaAdopcion;
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

    
   
     
 


