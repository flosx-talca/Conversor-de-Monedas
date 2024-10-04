import java.util.Scanner;




public class Principal {



    public static void main(String[] args) {

        Menu menu = new Menu();
        ConsultaMoneda consulta = new ConsultaMoneda();
        Scanner teclado = new Scanner(System.in);
        int  opcion = 0;
        //double monto=0;
        String moneda1 = "";
        String moneda2 = "";

        while (opcion != 7) {
            menu.generaMenu();

            try {
                opcion = Integer.parseInt(teclado.nextLine());
                System.out.println(opcion);


                switch (opcion) {
                    case 1:
                        moneda1= "USD";
                        moneda2= "ARS";
                        break;
                    case 2:
                        moneda1= "ARS";
                        moneda2= "USD";
                        break;
                    case 3:
                        moneda1= "USD";
                        moneda2= "BRL";
                        break;
                    case 4:
                        moneda1= "BRL";
                        moneda2= "USD";
                        break;
                    case 5:
                        moneda1= "USD";
                        moneda2= "COP";
                        break;
                    case 6:
                        moneda1= "COP";
                        moneda2= "USD";
                        break;
                    case 7:
                        System.out.println("Saliendo...");
                        break;
                    default:
                        System.out.println("La opcion ingresada no es correcta...");
                }
                if (opcion != 7) {
                    System.out.print("Ingrese Monto: ");
                    double monto = Double.parseDouble(teclado.nextLine());
                    Moneda moneda = consulta.buscaMoneda(moneda1, moneda2, monto);
                    System.out.println("\nEl monto solicitado para la conversion es: " + monto +" " + moneda+"\n\n");
                }

            } catch (NumberFormatException e) {
                System.out.println("Número no encontrado " + e.getMessage());
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
                System.out.println("Finalizando la aplicación.");
            }
        }
    }
}
