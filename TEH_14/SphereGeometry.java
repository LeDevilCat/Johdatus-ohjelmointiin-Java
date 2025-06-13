package TEH_14;
import java.util.Scanner;

public class SphereGeometry{
    public static void main(String[] args) {
        System.out.println("Syötä pallon säde:");
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();
        scanner.close();
        
        double surfaceArea = 4 * Math.PI * Math.pow(radius, 2);
        double volume = (4.0 / 3) * Math.PI * Math.pow(radius, 3);
        
        System.out.printf("Pallon pinta-ala on %.2f neliöyksikköä%n", surfaceArea);
        System.out.printf("Pallon tilavuus on %.2f kuutiyksikköä%n", volume);

        
    }
    
}
