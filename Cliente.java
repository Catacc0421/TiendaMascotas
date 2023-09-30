public class Cliente {
    private String nombreCliente;
    private String telefono;
    private String direccion;
    private String tipoAnimal;
    private String compraAdopcion;

    public Cliente(String nombreCliente,String telefono, String direccion, String tipoAnimal, String compraAdopcion){
        this.nombreCliente = nombreCliente;
        this.telefono = telefono;
        this.direccion = direccion;
        this.tipoAnimal = tipoAnimal;
        this.compraAdopcion = compraAdopcion;

}

    public String getNombreCliente(){
    return nombreCliente;
}

    public void setNombreCliente(String nombreCliente){
        this.nombreCliente = nombreCliente;
    }

    public String getTelefono(){
        return telefono;

    }

    public void setTelefono(String telefono){
        this.telefono= telefono;
    }
    public String getDireccion(){
    return direccion;
}

    public void setDireccion(String direccion){
        this.direccion = direccion;
    }
    public String getTipoAnimal(){
    return tipoAnimal;
}

    public void setTipoAnimal(String tipoAnimal){
        this.tipoAnimal = tipoAnimal;
    }
    public String getCompraAdopcion(){
    return compraAdopcion;
}

    public void setCompraAdopcion(String compraAdopcion){
        this.compraAdopcion = compraAdopcion;
    }

 
    }    