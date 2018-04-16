/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl6.zad3;

import java.util.Scanner;
import static pl.edu.ur.oopl6.zad3.Complex.DodawanieAlgebraiczne;
import static pl.edu.ur.oopl6.zad3.Complex.DzielenieAlgebraiczne;
import static pl.edu.ur.oopl6.zad3.Complex.LiczbaSprzężona;
import static pl.edu.ur.oopl6.zad3.Complex.MnozenieAlgebraiczne;
import static pl.edu.ur.oopl6.zad3.Complex.Moduł;
import static pl.edu.ur.oopl6.zad3.Complex.OdejmowanieAlgebraiczne;

/**
 *
 * @author Monika
 */
public class Main {
    
    public static void main(String[] args) {
        
        int menu;
        Scanner in = new Scanner(System.in);
        System.out.println("Wybierz zadanie: ");
        System.out.println("[1] Moduł liczby zespolonej\n[2]"
                + " Wartość liczby sprezężonej doliczby zespolonej\n"
                + "[3] Dodawanie (postać algebraiczna)\n"
                + "[4] Odejmowanie (postać algebraczna)\n"
                + "[5] Mnożenie algebraiczne\n"
                + "[6] Dzielenie algebraiczne\n");
        menu = in.nextInt();
        switch(menu){
                case 1: System.out.println("Moduł liczby zespolonej wynosi: " + Moduł(3,4));
                    break;
                case 2: LiczbaSprzężona(3,4);
                    break;
                case 3: DodawanieAlgebraiczne(2,4,2,5);
                    break;
                case 4: OdejmowanieAlgebraiczne(2,4,2,5);
                    break;
                case 5: MnozenieAlgebraiczne(3,4,5,1);
                    break;
                case 6: DzielenieAlgebraiczne(3,4,1,2);
                    break;
                default: System.out.println("Wybrałeś zły numer!!");
        }   
    }    
    
}
