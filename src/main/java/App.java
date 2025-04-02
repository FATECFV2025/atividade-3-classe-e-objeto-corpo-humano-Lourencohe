package main.java;
import java.util.Scanner;
 
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
       
        CorpoHumano c1 = new CorpoHumano(90, 1.87f);
 
        System.out.println("Massa: " + c1.getMassa() + " kg");
        System.out.println("Volume: " + c1.getVolume() + " m³");
        System.out.println("Densidade: " + c1.getDensidade() + " kg/m³");
        System.out.println("Altura: " + c1.getAltura() + " m");
 
       
        System.out.println("IMC: " + c1.IMC());
 
   
        System.out.print("\nDigite uma nova massa (kg): ");
        float novaMassa = scanner.nextFloat();
        c1.setMassa(novaMassa);
 
        System.out.print("Digite uma nova altura (m): ");
        float novaAltura = scanner.nextFloat();
        c1.setAltura(novaAltura);
 
        System.out.println("\nNovos valores:");
        System.out.println("Massa: " + c1.getMassa() + " kg");
        System.out.println("Altura: " + c1.getAltura() + " m");
        System.out.println("Novo IMC: " + c1.IMC());
 
        scanner.close();
    }
}