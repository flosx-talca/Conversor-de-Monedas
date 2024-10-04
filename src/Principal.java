import java.io.IOException;
import java.util.Scanner;




public class Principal {



    public static void main(String[] args) {

        Menu menu = new Menu();
        ConsultaMoneda consulta = new ConsultaMoneda();
        var opcion = 0;
        Scanner teclado = new Scanner(System.in);
        while (opcion != 7) {
            menu.generaMenu();

            try {
                opcion = Integer.valueOf(teclado.nextLine());

                switch (opcion) {
                    case 1:
                        System.out.println("1");
                        Moneda moneda = consulta.buscaMoneda("USD", "CLP",1);
                        System.out.println(moneda);
                        break;
                    case 2:
                        System.out.println("2");
                        break;
                    case 3:
                        System.out.println("3");
                        break;
                    case 4:
                        System.out.println("4");
                        break;
                    case 5:
                        System.out.println("5");
                        break;
                    case 6:
                        System.out.println("6");
                        break;
                    case 7:
                        System.out.println("Saliendo...");
                        break;
                    default:
                        System.out.println("La opcion ingresada no es correcta...");
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
