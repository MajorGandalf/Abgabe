
package kapitel5;

public class Kapitel5 {

    private static int x;

    public static void main(String[] args) {
        
         Bruch a = new Bruch();
         a.zaehler = 3;
         a.nenner = 4;
         
        
         
         Bruch b = new Bruch();
         b.zaehler = 3;
         b.nenner = 4;
         
         b.zaehler = 5;
         b.nenner = 8;
         
         b.zaehler = 3;
         b.zaehler = 12;
         
         
         
         b.zaehler++;
         b.zaehler = a.zaehler;
         b.nenner = a.nenner;
         
         if (b.nenner != 0);
         int zahl1 = 2387;
         int zahl2 = zahl1;
         zahl1 = 46;
         
         if (a == b);
         
        
         if( x > 10) {
             b = new Bruch();
             b.zaehler = 2;
             b.nenner = 3;
         }
         System.out.println(b.zaehler);
         System.out.print("\n Und nach dem Kürzen: ");
         System.out.print(a.dezimalwert());
         
         a.ausgeben();
         b.ausgeben();
         b.erweitern(4);
         b.kuerzen();
         b.ausgeben();
         b.setze(0);
         a.multiplizieren(b);
         b.gekuertausgeben();
    }
    
}
