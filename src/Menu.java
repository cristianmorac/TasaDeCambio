import java.util.Map;
import java.util.Scanner;

public class Menu {
    public void opcMenu() {
        Conversion convertirMoneda = new Conversion();
        while(true) {
            System.out.println("========= Menú de conversiones ========");
            System.out.println("Sea bienvenid@ al conversor de Moneda\n");
            System.out.println("1) Dólar =>> Peso Argentino");
            System.out.println("2) Peso Argentino =>> Dólar ");
            System.out.println("3) Dólar =>> Real brasileño");
            System.out.println("4) Real brasileño =>> Dólar ");
            System.out.println("5) Dólar =>> Peso Colombiano");
            System.out.println("6) Peso Colombiano =>> Dólar");
            System.out.println("7) Salir");
            System.out.println("======================================\n");

            System.out.println("Escoja la opción de consulta: ");
            Scanner menu = new Scanner(System.in);
            var opc = Integer.valueOf(menu.nextLine());
            if (opc == 7) {
                break;
            }

            switch (opc) {
                case 1:
                    System.out.println("Dolar a peso Argentino: "
                            +convertirMoneda.filtrarMonedas("USD","ARS")+"\n");
                    break;
                case 2:
                    System.out.println("peso Argentino a Dolar: "
                            +convertirMoneda.filtrarMonedas("ARS","USD")+"\n");
                    break;
                case 3:
                    System.out.println("Dolar a Real brasileño: "
                            +convertirMoneda.filtrarMonedas("USD","BRL")+"\n");
                    break;
                case 4:
                    System.out.println("Real brasileño a Dolar: "
                            +convertirMoneda.filtrarMonedas("BRL","USD")+"\n");
                    break;
                case 5:
                    System.out.println("Dolar a peso Colombiano: "
                            +convertirMoneda.filtrarMonedas("USD","COP")+"\n");
                    break;
                case 6:
                    System.out.println("Peso Colombiano a Dolar: "
                            +convertirMoneda.filtrarMonedas("COP","USD")+"\n");
                    break;
                default:
                    System.out.println("Opción invalida");

            }
        }
        System.out.println("======== Conversor finalizado ========");
    }
}
