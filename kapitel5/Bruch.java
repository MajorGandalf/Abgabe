/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kapitel5;

/**
 *
 * @author User
 */
public class Bruch {

    int zaehler;
    int nenner;
    Bruch (int z, int n){
        int hz, hn, r;
        if (n == 0) {
         System.out.print("Fehler! Der Nenner darf nicht 0 sein!");
        } else {
            hz = z;
            hn = n;
            r = hz % hn;
            while (r > 0){
                hz = hn;
                hn = r;
                r = hz % hn;
            }// in hn steht jetzt der ggT
            zaehler = z/hn;
            nenner = n/hn;
        }
    }
    Bruch(){
        this(0, 1);
        }
    
    Bruch(int n) {
        this(n, 1);
    }


    void ausgeben() {
        System.out.print(this.zaehler + "/" + nenner);
    }

    void kuerzen() {
        int m, n, r;

        m = zaehler;
        n = nenner;
        r = m % n;
        while (r > 0) {
            m = n;
            n = r;
            r = m % n;
        }
        zaehler /= n;
        nenner /= n;
        zaehler = zaehler / n; // in n steht der ggT
        nenner = nenner / n;
    }

    void gekuertausgeben() {
        kuerzen();
        ausgeben();
    }

    void erweitern(int a) {
        zaehler *= a;
        nenner *= a;
    }

    void multiplizieren(Bruch m) {
        zaehler *= m.zaehler;
        nenner *= m.nenner;
    }

    void setze(int z) {
        zaehler = z;
        nenner = 1;
    }

    void setze(int z, int n) {
        zaehler = z;
        nenner = n;        
    }
    
    double dezimalwert() {
        return (double) zaehler/nenner;
    }

    int signum() {
        if (this.dezimalwert() == 0) {
            return 0;
        }
        if (this.dezimalwert() > 0) {
            return 1;
        }
        return -1;
    }
    // Bruch() {
       // zaehler = 0;
       // nenner = 1;
    // }
    //Bruch (int z, int n){
      //  zaehler = z;
        //nenner = n;
    //}
}
