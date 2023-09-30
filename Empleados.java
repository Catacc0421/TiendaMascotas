public class Empleados {
    private String nombreEmpleado;
    private String cargo;
    private String idEmpleado;

    public Empleados(String nombreEmpleado,String cargo, String idEmpleado){
        this.nombreEmpleado = nombreEmpleado;
        this.cargo = cargo;
        this.idEmpleado = idEmpleado;
      

}

    public String getNombreEmpleado(){
    return nombreEmpleado;
}

    public void setNombreEmpleado(String nombreEmpleado){
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getCargo(){
        return cargo;

    }

    public void setCargo(String cargo){
        this.cargo= cargo;
    }
    public String getIdEmpleado(){
    return idEmpleado;
}

    public void setIdEmpleado(String idEmpleado){
        this.idEmpleado = idEmpleado;
    }
   
     
 
     }

        

