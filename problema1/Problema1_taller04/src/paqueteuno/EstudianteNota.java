package paqueteuno;

/**
 *
 * @author santy
 */
public class EstudianteNota {
    private String nombreEstudiante;
    private double notaMateria1;
    private double notaMateria2;
    private double notaMateria3;
    private double promedioNotas;
    private Universidad universidad;
    
    public EstudianteNota(){
        nombreEstudiante = "Santiago Riofrío";
        notaMateria1 = 9.45;
        notaMateria2 = 8.55;
        notaMateria3 = 9.05;
        universidad = new Universidad();
    }
    
    public EstudianteNota(String nomEst, double ntM1, double ntM2,
            double ntM3, Universidad u){
        nombreEstudiante = nomEst;
        notaMateria1 = ntM1;
        notaMateria2 = ntM2;
        notaMateria3 = ntM3;
        universidad = u;
    }
    
    public void establecerNombreEstudiante(String x){
        nombreEstudiante = x;
    }
    
    public void establecerNotaMateria1(double x){
        notaMateria1 = x;
    }
    
    public void establecerNotaMateria2(double x){
        notaMateria2 = x;
    }
    
    public void establecerNotaMateria3(double x){
        notaMateria3 = x;
    }
    public void calcularPromedioNotas(){
        promedioNotas = (notaMateria1+notaMateria2+notaMateria3)/3;
    }
    
    public void establecerUniverdidad(Universidad x){
        universidad = x;
    }
    
    public String obtenerNombreEstudiante(){
        return nombreEstudiante;
    }
    
    public double obtenerNotaMateria1(){
        return notaMateria1;
    }
    
    public double obtenerNotaMateria2(){
        return notaMateria2;
    }
    
    public double obtenerNotaMateria3(){
        return notaMateria3;
    }
    
    public double obtenerPromedioNotas(){
        return promedioNotas;
    }
    
    public Universidad obtenerUniversidad(){
        return universidad;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("El estudiante %s de la "
                + "universidad %s\n(%s), tiene el siguiente promedio:\n"
                + "Calificación Materia 1: %.2f\n"
                + "Calificación Materia 2: %.2f\n"
                + "Calificación Materia 3: %.2f\n"
                + "Promedio de Notas: %.2f\n"
                + "-------------------------------------------------\n",
                nombreEstudiante,universidad.obtenerNombreUniversidad(),
                universidad.obtenerDireccion(),notaMateria1,
                notaMateria2,notaMateria3,promedioNotas);
        return cadena;
    }
    
}
