import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String filename = "credenciales.txt";
        CredentialManager credentialManager = new CredentialManager(filename);
        System.out.print("Ingrese su nombre de usuario: ");
        String username = entrada.nextLine();
        System.out.print("Ingrese su contraseña: ");
        String password = entrada.nextLine();
        if (credentialManager.validateLogin(username, password)) {
            System.out.println("Inicio de sesión exitoso.");
            Menu menu = new Menu();
            menu.mostrarMenu();
        } else {
            System.out.println("Nombre de usuario o contraseña incorrectos.");
        }
        entrada.close();
    }
}