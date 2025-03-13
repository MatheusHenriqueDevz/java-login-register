import java.util.Scanner;
import java.util.ArrayList;

public class LoginSistem {
    private ArrayList<Usuario> usuarios;

    public LoginSistem(){
        usuarios = new ArrayList<>();
    }

    /*
     * The registerUser will register the information recived on the input username and password,
     * the informations will be saved on Array .
     * 
     * 
     * 
     */
    public void RegisterUser(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Register a new user");
        System.out.println();
        System.out.print("Write an user name: ");
        String username = scanner.nextLine();

        System.out.print("Write a password: ");
        String password = scanner.nextLine();

        Usuario newUser = new Usuario(username, password);
        usuarios.add(newUser);

        System.out.println("User is register with sucess");
    }

    public void Login(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("====== LOGIN ======");
        System.out.println();
        System.out.print("Username: ");
        String username = scanner.nextLine();

        System.out.print("Password: ");
        String password = scanner.nextLine();

        for(Usuario usuario : usuarios){
            if(usuario.getUsername().equals(username) && usuario.getPassword().equals(password)){
                System.out.println("You loggin sussefuly! Welcome, " + username + "!\n");
                return;
            } else {
                System.out.println("The Username or Password are wrong.\n");
            }
        }
    }

    public static void main(String[] args) {
        LoginSistem sistem = new LoginSistem();
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("===== Welcome to Login and Register login =====");
            System.out.println("");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("0. Close");
            System.out.println("");

            System.out.print("Choise your option: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    sistem.RegisterUser();
                    break;
                case 2:
                    sistem.Login();
                    break;
                case 0:
                    System.out.println("Closing the program.........");
                    break;
                default:
                    System.out.println("Syntaxe error, please wirte correctly.\n");
                    break;
            }
        } while (option != 0 || option > 2);

        scanner.close();
    }
}
