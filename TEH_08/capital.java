package TEH_08;

public class capital {
    public static void main(String[] args) {
        int alkupaaoma = 1000; // Alkupääoma
        double korko = 0.05; // Korkoprosentti
        int vuodet = 1; // Koron laskuaika
        double loppusumma = alkupaaoma * Math.pow((1 + korko), vuodet); // Lasketaan loppusumma

        System.out.println("Ohjelmalle on annettu seuraavat tiedot:");
        System.out.println("Alkupääoma: " + alkupaaoma + " euroa\n" +
                           "Korko: " + (korko * 100) + "%\n" +
                           "Laskuaika: " + vuodet + " vuosi\n");
        System.out.println("Loppusumma: " + loppusumma + " euroa");
        System.out.println("Loppusumma on " + (loppusumma - alkupaaoma) + " euroa enemmän kuin alkupääoma.");
    }
}
