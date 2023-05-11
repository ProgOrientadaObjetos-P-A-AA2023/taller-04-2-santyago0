package paqueteuno;

/**
 *
 * @author santy
 */
public class Automotor {
    private String cedulaDuenio;
    private Fabricante fabricante;
    private int anioFabricacion;
    private double valorVehiculo;
    private double valorMatricula;
    
    public Automotor(){
        cedulaDuenio = "1102563244";
        fabricante = new Fabricante();
        anioFabricacion = 2001;
        valorVehiculo = 2569.69;
    }
    
    public Automotor(String ced, Fabricante fab, int anioFab, double valVeh){
        cedulaDuenio = ced;
        fabricante = fab;
        anioFabricacion = anioFab;
        valorVehiculo = valVeh;
    }
    
    public void establecerCedulaDuenio(String x){
        cedulaDuenio = x;
    }
    
    public void establecerFabricante(Fabricante x){
        fabricante = x;
    }
    
    public void establecerAnioFabricacion(int x){
        anioFabricacion = x;
    }
    
    public void establecerValorVehiculo(double x){
        valorVehiculo = x;
    }
    
    public void calcularValorMatricula(){
        valorMatricula = (valorVehiculo*0.00002) * anioFabricacion;
    }
    
    public String obtenerCedulaDuenio(){
        return cedulaDuenio;
    }
    
    public Fabricante obtenerFabricante(){
        return fabricante;
    }
    
    public int obtenerAnioFabricacion(){
        return anioFabricacion;
    }
    
    public double obtenerValorVehiculo(){
        return valorVehiculo;
    }
    
    public double obtenerValorMatricula(){
        return valorMatricula;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("Características del Vehículo:\n"
                + "Cedula del Dueño: %s\nFabricante: %s\nCiudad de Origen: %s\n"
                + "Año de  Fabricación: %d\nValor del Vehículo: %.2f\n"
                + "Valor de la Matrícula: %.2f\n-----------------------------\n",
                cedulaDuenio,fabricante.obtenerNombreFabricante(),
                fabricante.obtenerCiudadOrigen(),anioFabricacion,
                valorVehiculo,valorMatricula);
        return cadena;
    }
    
}
