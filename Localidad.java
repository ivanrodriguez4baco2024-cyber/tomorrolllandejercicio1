public class Localidad {
    private int nombre;      
    private double precio;
    private int capacidad;
    private int vendidos;

    public Localidad(int nombre, double precio, int capacidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.capacidad = capacidad;
        this.vendidos = 0;
    }

    public int getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public int getVendidos() {
        return vendidos;
    }

    public boolean tieneEspacio() {
        return vendidos < capacidad;
    }

    public int boletosDisponibles() {
        return capacidad - vendidos;
    }

   
    public boolean precioDentroDePresupuesto(double presupuesto) {
        return precio <= presupuesto;
    }

    public void registrarVenta(int cantidad) {
        vendidos += cantidad;
    }
}
