import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Validacion validacion = new Validacion();

        System.out.println("Venta de E-tickets de Tomorrowland");

        boolean continuar = true;
        while (continuar) {
            Solicitud solicitud = new Solicitud();

           
            System.out.print("Ingrese su nombre: ");
            solicitud.setNombre(teclado.nextLine());

            System.out.print("Ingrese su email: ");
            solicitud.setEmail(teclado.nextLine());

            System.out.print("Ingrese la cantidad de boletos que desea comprar: ");
            solicitud.setCantidadBoletos(Integer.parseInt(teclado.nextLine()));

            System.out.print("Ingrese su presupuesto maximo: ");
            solicitud.setMaxPresupuesto(Double.parseDouble(teclado.nextLine()));

           
            solicitud.setNumeroTicket();
            System.out.println("\nSu numero de E-ticket es: " + solicitud.getNumeroTicket());

            
            Ticket ticket = new Ticket();
            System.out.println("Numeros de validacion generados: " + ticket.getPrimerNumAleatorio() + " y " + ticket.getSegunNumAleatorio());

            if (ticket.validarTicket(solicitud.getNumeroTicket())) {
                System.out.println("Su E-ticket es apto para comprar boletos.");

                Localidad localidad = validacion.seleccionarLocalidadAleatoria();

                System.out.println("Localidad asignada: " + localidad.getNombre() + " (precio por boleto: $" + localidad.getPrecio() + ")");

           
                if (!validacion.validarEspacio(localidad)) {
                    System.out.println("Lo sentimos, la localidad " + localidad.getNombre() + " ya no tiene espacio disponible.");
                }
              
                else if (!validacion.validarPresupuesto(localidad, solicitud.getMaxPresupuesto())) {
                    System.out.println("El precio de la localidad " + localidad.getPrecio() + " supera su presupuesto maximo. No se puede realizar la compra.");
                }
              
                else {
                    int disponibles = validacion.boletosDisponibles(localidad);
                    int aComprar;
                    if (solicitud.getCantidadBoletos() <= disponibles) {
                        aComprar = solicitud.getCantidadBoletos();
                        } else { aComprar = disponibles;
                        
                        }

                    validacion.registrarVenta(localidad, aComprar);

                    if (aComprar < solicitud.getCantidadBoletos()) {
                        System.out.println("Solo habia espacio disponible para " + aComprar + " boleto.");
                    }

                    double total = aComprar * localidad.getPrecio();
                    System.out.println("Compra exitosa: " + aComprar + " boleto en localidad " + localidad.getNombre() + ". Total a pagar: $" + total);
                }
            } 
            else{
                System.out.println("Lo sentimos, su E-ticket no fue seleccionado en esta ronda de ventas.");
            }

            System.out.print("\n¿Desea realizar otra solicitud? (S/N): ");
            String respuesta = teclado.nextLine();
            continuar = respuesta.equalsIgnoreCase("S");
        }

        System.out.println("\nGracias por participar en la venta de E-tickets de Tomorrowland.");
        teclado.close();
    }
}
