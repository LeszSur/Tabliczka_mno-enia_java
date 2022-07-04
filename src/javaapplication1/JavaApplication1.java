package javaapplication1;

public class JavaApplication1 {

    public static void main(String[] args) {
         
        int [] tab = new int[10];
        for (int j = 0; j < 10; j++){

            for (int i = 0; i < 10; i++){
                tab [i] = Obliczenia.mnozenie(i, j);
                if (i == 9){
                      Print.wypiszOstatniaKolumna(tab[i]);}
                else {
                    if (tab[i] < 10)
                    Print.wypiszJednostki(tab[i]);
                    else
                    Print.wypiszDziesiatki(tab[i]);}
                }
        }
    }
}
        class Print {
            
            static void wypiszJednostki(int parametr){
                    System.out.print("   ");    
                    System.out.print(parametr);
                    System.out.print(" |");}
        
            static void wypiszDziesiatki(int parametr){
                    System.out.print("  ");    
                    System.out.print(parametr);
                    System.out.print(" |");}
            
            static void wypiszOstatniaKolumna(int parametr){
                    if (parametr == 100)
                    System.out.println(" " + parametr);
                    else
                    System.out.println("  " + parametr);
            }
        }
        class Obliczenia{
            static int mnozenie(int i, int j){
                int wynik = (j + 1) * (i + 1);
                return wynik;
            }
        }

        

    

