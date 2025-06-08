public class Identifiers {
    public static void main(String[] args) {
        // Laillisia tunnuksia:
        int number1 = 10;
        int _arvo = 20;
        int $summa = 30;
        int Tunnus_2 = 40;
        int a123b = 50;

        System.out.println(number1);
        System.out.println(_arvo);
        System.out.println($summa);
        System.out.println(Tunnus_2);
        System.out.println(a123b);

        // Laittomia tunnuksia (nämä aiheuttavat virheitä):
        int 1numero = 60;      // Ei voi alkaa numerolla
        int class = 70;        // Avainsana
        int my-value = 80;     // Väliviiva ei sallittu
        int @home = 90;        // @ ei sallittu
        int double = 100;      // Avainsana

        System.out.println(1numero);
        System.out.println(class);
        System.out.println(my-value);
        System.out.println(@home);
        System.out.println(double);
    }
}
