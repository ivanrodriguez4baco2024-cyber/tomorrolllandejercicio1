public class Validacion{
    private Localidad localidad1;
    private Localidad localidad2;
    private Localidad localidad3;

    public Validacion() {
        localidad1 = new Localidad(1, 100, 20);
        localidad2 = new Localidad(5, 500, 20);
        localidad3 = new Localidad(10, 1000, 20);
    }

   
    public Localidad seleccionarLocalidadAleatoria() {
        int numero = (int) (Math.random() * 3) + 1;

        switch (numero) {
            case 1:
                return localidad1;
            case 2:
                return localidad2;
            case 3:
                return localidad3;
            default:
                return null;
        }
    }

    
    public Localidad getLocalidadPorNombre(int nombre) {
        if (localidad1.getNombre() == nombre) {
            return localidad1;

        } 
        else if (localidad2.getNombre() == nombre){
            return localidad2;

        } 
        else if (localidad3.getNombre() == nombre){
            return localidad3;

        }
        else {
            return null;
        }
    }

   
    public boolean validarEspacio(Localidad localidad) {
        return localidad.tieneEspacio();
    }

    
    public int boletosDisponibles(Localidad localidad) {
        return localidad.boletosDisponibles();
    }


    public boolean validarPresupuesto(Localidad localidad, double presupuesto) {
        return localidad.precioDentroDePresupuesto(presupuesto);
    }

    public void registrarVenta(Localidad localidad, int cantidadVendida) {
        localidad.registrarVenta(cantidadVendida);
    }

    }
