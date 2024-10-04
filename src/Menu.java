public class Menu {
    private int opcion;

    public void generaMenu(){
        String menu = "******************************************\n"
                    + "Sea bienvenido/a al Conversor de Moneda\n"
                    + "1) Dólar ==> Peso Argentino\n"
                    + "2) Peso Argentino ==> Dólar\n"
                    + "3) Dólar ==> Real Brasileño\n"
                    + "4) Real Brasileño ==> Dólar\n"
                    + "5) Dólar ==> Peso Colombiano\n"
                    + "6) Peso Colombiano ==> Dólar\n"
                    + "7) Salir\n"
                    + "Elija una opción válida: \n"
                    + "*******************************************\n";
        System.out.println(menu);
    }

}
