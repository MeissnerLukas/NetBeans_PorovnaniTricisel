// seřazení tří čísel podle velikosti (vzestupně)
// Algoritmus používá techniku Bubble sort
// Složitost jsou 3 porovnání a v nejhorším případě 3 prohození
// Neexistuje algoritmus s méně, než 3 porovnáními
//je 6 kombinací (n!=6) a ceil(log_2(n!)) = 3

package serazenitricisel;

import java.util.Scanner;


public class SerazeniTriCisel {

  
    public static void main(String[] args) {
        Scanner vstup = new Scanner(System.in);
        System.out.println("Zadej 1. číslo: ");
        int a = vstup.nextInt ();
        System.out.println("Zadej 2. číslo: ");
        int b = vstup.nextInt ();
        System.out.println("Zadej 3. číslo: ");
        int c = vstup.nextInt ();
        
        if (a>b) {
            // prohozeni obsahu proměnných b,c
            int pom = a;
            a = b;
            b = pom;
        }
        if (b>c) {
            // prohozeni obsahu proměnných b,c
            int pom = b;
            b = c;
            c = pom;
        }
        if (a>b) {
            // prohozeni obsahu proměnných b,c
            int pom = a;
            a = b;
            b = pom;
    }
    System.out.println("Seřazeno: "+ a +","+ b +","+ c);
}
}