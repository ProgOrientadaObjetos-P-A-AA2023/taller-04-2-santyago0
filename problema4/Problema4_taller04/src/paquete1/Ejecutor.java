package paquete1;

/**
 *
 * @author santy
 */
public class Ejecutor {
    public static void main(String[] args) {
        // Creación de los primeros objetos
        EntidadFinanciera enfi = new EntidadFinanciera();
        
        enfi.calcularComisionBanco();
        
        System.out.printf("%s",enfi);
        
        // Creación de los segundos objetos
        String nombres = "Luis Enrique";
        String apellidos = "Riofrío Jaramillo";
        String cedula = "1104487390";
        Cliente cliente = new Cliente(nombres,apellidos,cedula);
        String banco = "Banco Pichincha";
        int sucursales = 9;
        Banco ban = new Banco(banco,sucursales);
        double valorCheque = 1100.50;
        EntidadFinanciera enfi2 = new EntidadFinanciera(cliente,
                ban,valorCheque);
        
        enfi2.calcularComisionBanco();
        
        System.out.printf("%s",enfi2);
    }
    
}
