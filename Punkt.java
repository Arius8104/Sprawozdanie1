package lab1;
import java.util.ArrayList;

public class Punkt {
    private double masa;
    private double promien = 0;

    //Mutator pozwalający zmienić wartość masy
    public void ustawMase(double setMas) {
        masa = setMas;
    }

    //konstruktor domyślny
    public Punkt() {
        masa = 5;
    }

    //konstruktor z argumentem określającym masę
    public Punkt(double m) {
        masa = m;
    }

    //metoda obliczająca moment bezwładności względem głównej osi przy promieniu = 0
    public void glownyMoment() {
        double glownyMom = masa * Math.pow(promien, 2);
        System.out.println("Główny moment bezwładności wynosi: " + glownyMom);
    }

    //metoda obliczająca moment bezwładności względem osi oddalonej o 'odl'
    public void steinerMoment(double odl) {
        double steinerMom = masa * Math.pow((odl + promien), 2);
        System.out.println("Moment bezwladnosci względem osi oddalonej o " + odl + "m wynosi: " + steinerMom);
    }

    //metoda wypisująca podstawowe informacje o punkcie materialnym przy 'odl' = 4
    public void info() {
        System.out.println("Punkt materialny o masie: " + masa);
        glownyMoment();
        steinerMoment(4);
        System.out.println();
    }
    public static void main(String[]args) {
        // stworzenie obiektow klasy Punkt
        Punkt punkt1 = new Punkt();
        Punkt punkt2 = new Punkt(7);
        //wypisanie podstawowych informacji o punktach materialnych
        System.out.println("Informacje o pierwszym punkcie:");
        punkt1.info();
        System.out.println("Informacje o drugim punkcie:");
        punkt2.info();
        //zmiana masy obiektu 'punkt1' na 10 przy użyciu mutatora
        punkt1.ustawMase(10);
        System.out.println("Informacje o pierwszym punkcie po zmianie masy:");
        punkt1.info();
        //utworzenie tablicy obiektów klasy Punkt
        ArrayList<Punkt> listaPunktow = new ArrayList<Punkt>();
        //przypisanie każdemu z 20 punktow innej masy od 1 do 10 i wypisanie informacji o każdym z nich
        for (int i = 0; i < 10; i++) {
            listaPunktow.add(new Punkt(i+1));
            System.out.println("Obiekt: "+ (i+1));
            listaPunktow.get(i).info();
        }
    }
}