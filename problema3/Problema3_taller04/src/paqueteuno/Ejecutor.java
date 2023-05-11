package paqueteuno;

/**
 *
 * @author santy
 */
public class Ejecutor {
    public static void main(String[] args) {
        // Creación de los primeros objetos
        Automotor auto = new Automotor();
        
        auto.calcularValorMatricula();
        
        System.out.printf("%s",auto);
        
        // Creación de los segundos objetos
        String fabricante = "Nissan";
        String ciudad = "Canadá";
        Fabricante fab = new Fabricante(fabricante,ciudad);
        String cedulaDuenio = "1106525217";
        int anioFabricacion = 1999;
        double valorVehiculo = 3050.99;
        Automotor auto2 = new Automotor(cedulaDuenio,fab
                ,anioFabricacion,valorVehiculo);
        
        auto2.calcularValorMatricula();
        
        System.out.printf("%s",auto2);
    }
    
}
