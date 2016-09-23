
package javauebungen;

public class Bruch {
    
   private int zahler;
   private int nenner;
   static int anzahlBrueche = 0;
    
Bruch (){
    
    this (0,1);  
}
Bruch (int nenner){
    this(1, nenner);
}
Bruch (int z, int n){
    
    setze (z,n);
    anzahlBrueche++;
}   

void ausgeben(){
    System.out.println(getZahler() + (getNenner() == 1 ? "":"/"+ getNenner()));
}

void kuerzen(){
    int hz, hn, r;
    
    hz = getZahler();
    hn = getNenner();
    
    r = hz%hn;
    
    while(r>0){
        hz = hn;
        hn = r;
    
    }
    
    setZahler(getZahler() /hn);
    setNenner(getNenner() / hn);
}

void gekuerztausgeben(){
    kuerzen();
    ausgeben();
}

void multiplizieren(Bruch m){
    setZaheler(getZahler() * m.getZahler());
    setNenner(getNenner() * m.getNenner());
}

void erweitern(int a){
    
    setZahler( getZahler() * a);
    setNenner( getNenner() * a);
}
double dezimalwert(){
    return (double) getZahler() / getNenner();
}

int signum(){
    if( this.dezimalwert() == 0){
        return 0;
    }else if(this.dezimalwert() > 0){
        return 1;
        }else{
        return -1;
          
    }
        
    
}
void setze(int z, int n){
    setZahler(z);
    setNenner(n);
}

public void setZahler() {
    this.zahler = zahler;
    
}
public void setNenner(){
    if(nenner==0){
        System.out.println("Fehler, der Nenner darf nicht 0 sein!");
        nenner = 1;
  
    }
    this.nenner = nenner;
}
public int getNenner(){
return nenner;
}
public int getZahler(){
return zahler;
}
}
