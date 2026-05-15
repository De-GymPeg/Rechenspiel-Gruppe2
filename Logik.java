import java.util.Random;
import java.util.Observable;

public class Logik extends Observable
{
    int zahl1;
    int zahl2;
    String operation;
    
    void initialisiere()
    {
        zahl1Setzen();
        zahl2Setzen();
        operationSetzen();
    }
    
    void zahl1Setzen() {
        // TODO
        zahl1 = zufallszahlGeben(20);
        setChanged();
        notifyObservers();
    }

    void zahl2Setzen() {
        // TODO
        zahl2 = zufallszahlGeben(20);
        setChanged();
        notifyObservers();
    }
    
    void operationSetzen() {
        String[] operationen = {"+", "-", "*"};
        operation = operationen[zufallszahlGeben(3)];
        setChanged();
        notifyObservers();
    }

    boolean istRichtig(int ergebnis) {
        switch (operation) {
            case "+":
            return zahl1 + zahl2 == ergebnis;
                // TODO
               
            case "-":
                // TODO
                return zahl1 - zahl2 == ergebnis;
                
            case "*":
                // TODO
                return zahl1 * zahl2 == ergebnis;
            default:
                return false;
        }
    }

    int zufallszahlGeben(int grenze) {
        // TODO
        Random random = new Random();
        return random.nextInt(grenze);
    }
}