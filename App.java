public class App {
    public static void main(String[] args) throws Exception {
            Cliente cliente = new Cliente("Catalina", "3002529878", "Calle 30 #60-15", "Perro", "Adoptado");
            System.out.println("Nombre cliente: " + cliente.getNombreCliente());
            System.out.println("Teléfono cliente: " + cliente.getTelefono());
            System.out.println("Dirección: " + cliente.getDireccion());
            System.out.println("Tipo de animal: " + cliente.getTipoAnimal());
            System.out.println("Es comprado o adoptado: " + cliente.getCompraAdopcion());
        
        
       
    }

}


