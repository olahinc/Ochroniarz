import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Proszę podać imię:");
        String firstname=sc.nextLine();
        System.out.print("Proszę podać nazwisko:");
        String lastname=sc.nextLine();
        System.out.print("Proszę podać miejsce zamieszkania:");
        String livingplace=sc.nextLine();
        System.out.print("Proszę podać wiek:");
        int age=sc.nextInt();
        System.out.println("Dziękuję, podsumowując:" + "\n" + "Imię:" + firstname + "\n" + "Nazwisko:" + lastname + "\n" + "Miejsce zamieszkania:" + livingplace + "\n" + "Wiek: " +age);
    }
}