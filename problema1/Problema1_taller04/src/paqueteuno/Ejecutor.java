package paqueteuno;

/**
 *
 * @author santy
 */
public class Ejecutor {
    public static void main(String[] args) {
        // Creación de los primeros objetos
        EstudianteNota alumno = new EstudianteNota();
        
        alumno.calcularPromedioNotas();
        
        System.out.printf("%s",alumno);
        
        // Creación de los segundos objetos
        String universidad = "UTPL";
        String direccion = "San Cayetano Alto";
        Universidad u = new Universidad(universidad,direccion);
        String nombre = "Luis Enrique";
        double nota1 = 9.6;
        double nota2 = 9.05;
        double nota3 = 8.85;
        EstudianteNota alumno2 = new EstudianteNota(nombre,nota1,
                nota2,nota3,u);
        
        alumno2.calcularPromedioNotas();
        
        System.out.printf("%s",alumno2);
    }
    
}
