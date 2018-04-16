/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl6.zad3;

/**
 *
 * @author Monika
 */
public class Complex {
     public static void Liczbazespolona(double rez,double imz){
        System.out.println("Liczba zespolona: " + rez + " + " +imz + "i" );
    }
    /** ------------------MODUŁ LICZBY ZESPOLONEJ---------------------
     * @param rez
     * @param imz
     * @return 
     */
    public static double Moduł(double rez, double imz){
        return Math.hypot(rez,imz);
    }
    /** ----------------WARTOŚĆ LICZBY SPRZĘŻONEJ DO LICZBY ZESPOLONEJ----------
     * @param rez
     * @param imz
     */
    public static void LiczbaSprzężona(double rez, double imz){
        if(imz>0){
            System.out.println("Liczba sprzężona do liczby zespolonej to: " + rez 
                    + " - " + imz + "i");
        }
        else
        {
            double imz2 = Math.abs(imz);
            System.out.println("Liczba sprzężona do liczby zespolonej to: " + rez + " + " + imz2 + "i");
        }
    }/** ---------------------DODAWANIE DWÓCH LICZB ZESPOLONYCH-------------- 
     * @param rez
     * @param imz
     * @param rez2
     * @param imz2
     */ 
    public static void DodawanieAlgebraiczne(double rez, double imz, double rez2, double imz2){
        double suma1 = rez + rez2;
        double suma2 = imz + imz2;
        System.out.print("Suma algebraiczna dwóch liczb zespolonych wynosi: " + suma1 + " + "
        + suma2 + "i");
        
    }
    public static void OdejmowanieAlgebraiczne(double rez, double imz, double rez2, double imz2){
        double różnica1 = rez - rez2;
        double różnica2 = imz - imz2;
        if(różnica1 < 0){
            double odejmowanie3 = Math.abs(różnica1);
            System.out.print("Różnica algebraiczna dwóch liczb zespolonych wynosi: -" + odejmowanie3 + " - "
            + różnica2 + "i");
        }
        else{
            System.out.print("Wynik odejmowania to: " + różnica1 + " + "
            + różnica2 + "i");
        }
    }
    public static void MnozenieAlgebraiczne(double rez, double imz, double rez2, double imz2){
        double iloczyn1, iloczyn2;
        iloczyn1 = (rez*rez2) - (imz*imz2);
        iloczyn2 = (rez*imz2) + (rez2*imz);
        System.out.println("Iloczyn dwóch liczb zespolonych wynosi: " + iloczyn1 + " + " 
        + iloczyn2 + "i");
    }
    public static void DzielenieAlgebraiczne(double rez, double imz, double rez2, double imz2){
        
    }
    
}
