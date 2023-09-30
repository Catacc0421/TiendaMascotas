public class TiendaMascotas {
    private String nombreTienda;
    private String direccion;
    private String telefono;

    public TiendaMascotas(String nombreTienda,String direccion, String telefono){
        this.nombreTienda = nombreTienda;
        this.direccion = direccion;
        this.telefono = telefono;
      

}

    public String getNombreTienda(){
    return nombreTienda;
}

    public void setNombreTienda(String nombreTienda){
        this.nombreTienda = nombreTienda;
    }

    public String getDireccion(){
        return direccion;

    }

    public void setDireccion(String direccion){
        this.direccion= direccion;
    }
    public String getTelefono(){
    return telefono;
}

    public void setTelefono(String telefono){
        this.telefono = telefono;
    }
   
     
 
     }


