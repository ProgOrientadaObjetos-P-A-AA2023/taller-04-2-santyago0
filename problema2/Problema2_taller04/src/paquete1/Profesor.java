package paquete1;

/**
 *
 * @author santy
 */
public class Profesor {
    private String nombre;
    private String apellido;
    private double sueldoBasico;
    private double sueldoTotal;
    private String cedula;
    private Provincia provincia;
    
    public Profesor(){
        nombre = "Rodrigo";
        apellido = "Mendez";
        sueldoBasico = 1550.25;
        cedula = "1103244358";
        provincia = new Provincia();
    }
    
    public Profesor(String nom, String apll, double sBas
            , String ced, Provincia pro){
        nombre = nom;
        apellido = apll;
        sueldoBasico = sBas;
        cedula = ced;
        provincia = pro;
    }
    
    public void establecerNombre(String x){
        nombre  = x;
    }
    
    public void establecerApellido(String x){
        apellido  = x;
    }
    
    public void establecerSueldoBasico(double x){
        sueldoBasico = x;
    }
    
    public void calcularSueldoTotal(){
        sueldoTotal = sueldoBasico + (sueldoBasico*0.2);
    }
    
    public void establecerCedula(String x){
        cedula = x;
    }
    
    public void establecerProvincia(Provincia x){
        provincia = x;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public String obtenerApellido(){
        return apellido;
    }
    
    public double obtenerSueldoBasico(){
        return sueldoBasico;
    }
    
    public double obtenerSueldoTotal(){
        return sueldoTotal;
    }
    
    public String obtenerCedula(){
        return cedula;
    }
    
    public Provincia obtenerProvincia(){
        return provincia;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("El profesor %s %s tiene las siguientes "
                + "características:\nVive en la provincia de %s (%d)\n"
                + "Sueldo Básico: %.2f\nSueldo Total: %.2f\n"
                + "Cédula: %s\n--------------------------------------------\n",
                nombre,apellido,
                provincia.obtenerNombreProvincia(),
                provincia.obtenerNumeroHabitantes(),sueldoBasico,
                sueldoTotal,cedula);
        return cadena;
    }
    
}
