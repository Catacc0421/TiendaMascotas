public class Mascotas {
    private String nombreMascota;
    private int edad;
    private String raza;
    private String tipoMascota;
    
        public Mascotas(String nombreMascota,String raza, String tipoMascota, int edad){
            this.nombreMascota = nombreMascota;
            this.raza = raza;
            this.tipoMascota = tipoMascota;
            this.edad = edad;
            
    
    }
    
        public String getNombreMascota(){
        return nombreMascota;
    }
    
        public void setNombreMascota(String nombreMascota){
            this.nombreMascota = nombreMascota;
        }
    
        public String getRaza(){
            return raza;
    
        }
    
        public void setRaza(String raza){
            this.raza= raza;
        }
        public String getTipoMascota(){
        return tipoMascota;
    }
    
        public void setTipoMascota(String tipoMascota){
            this.tipoMascota = tipoMascota;
        }
        public int getEdad(){
        return edad;
    }
    
        public void setEdad(int edad){
            this.edad = edad;
        }
     
    
     
        }    

