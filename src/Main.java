import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nombre = scanner.nextLine();
        int id = Integer.parseInt(scanner.nextLine());
        double precio = Double.parseDouble(scanner.nextLine());
        char simbolo = scanner.nextLine().charAt(0);
        boolean envioGratuito = Boolean.parseBoolean(scanner.nextLine());

        System.out.println(nombre + " #" + id);
        System.out.println("Precio: " + simbolo + precio);
        System.out.println("Envio Gratuito: " + envioGratuito);
    }
}