public class Solicitud {
    private String nombre;
    private String email;
    private int cantidadBoletos;
    private double maxpresupuesto;
    private int ticket;

    public Solicitud(){
        nombre = "";
        email = "";
        cantidadBoletos = 0;
        maxpresupuesto = 0;

    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public void setEmail(String email){
        this.email = email;

    }
    public String getEmail(){
        return email;
    }

    public void setCantidadBoletos(int cantBoletos){
        this.cantidadBoletos = cantBoletos;
    }
    public int getCantidadBoletos(){
        return cantidadBoletos;
    }
    
    public void setMaxPresupuesto(double maxpresupuesto){
        this.maxpresupuesto = maxpresupuesto;
    }

    public double getMaxPresupuesto(){
        return maxpresupuesto;
    }

    public void setNumeroTicket(){

    this.ticket = (int) (Math.random() * 15000) + 1;
    
}

    public int getNumeroTicket(){
        return ticket;

    }

  

}
