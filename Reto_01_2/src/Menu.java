import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 5) {
            mostrarMenu();
            System.out.print("Elige una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Has elegido: 1. Buscar el tren");
                    break;
                case 2:
                    System.out.println("Has elegido: 2. Comprar el billete");
                    break;
                case 3:
                    System.out.println("Has elegido: 3. Modificar reserva");
                    break;
                case 4:
                    System.out.println("Has elegido: 4. Eliminar reserva");
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion no valida.");
                    break;
            }

            System.out.println();
        }

        sc.close();
    }

    public static void mostrarMenu() {
        System.out.println("===== MENU =====");
        System.out.println("1. Buscar el tren");
        System.out.println("2. Comprar el billete");
        System.out.println("3. Modificar reserva");
        System.out.println("4. Eliminar reserva");
        System.out.println("5. Salir");
        System.out.println("============================");
    }
}
