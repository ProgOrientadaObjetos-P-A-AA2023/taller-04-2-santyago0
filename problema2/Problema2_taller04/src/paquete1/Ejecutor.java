package paquete1;

/**
 *
 * @author santy
 */
public class Ejecutor {
    public static void main(String[] args) {
        // Creación de los primeros objetos
        Profesor prof = new Profesor();
        
        prof.calcularSueldoTotal();
        
        System.out.printf("%s",prof);
        
        // Creación de los segundos objetos
        String provincia = "Esmeraldas";
        int numHabitantes = 216901;
        Provincia pro = new Provincia(provincia,numHabitantes);
        String nombre = "Francisco";
        String apellido = "Gonzales";
        double sueldoBasico = 1080.20;
        String cedula = "11063256294";
        Profesor prof2 = new Profesor(nombre,apellido
                ,sueldoBasico,cedula,pro);
        
        prof2.calcularSueldoTotal();
        
        System.out.printf("%s",prof2);
    }
    
}
