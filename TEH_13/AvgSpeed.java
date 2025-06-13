package TEH_13;
import java.util.Scanner;

public class AvgSpeed {
    public static void main(String[] args) {
        System.out.println("Syötä matka kilometreinä:");
        Scanner scanner = new Scanner(System.in);
        double distance = scanner.nextDouble();
        System.out.println("Syötä aika muodossa h:mm:ss:");
        String timeInput = scanner.next();
        scanner.close();
        String[] timeParts = timeInput.split("[: ]");
        int hours = Integer.parseInt(timeParts[0]);
        int minutes = Integer.parseInt(timeParts[1]);
        int seconds = Integer.parseInt(timeParts[2]);
        double totalTimeInHours = hours + (minutes / 60.0) + (seconds / 3600.0);
        double averageSpeed = distance / totalTimeInHours;
        System.out.printf("Keskinopeus on %.2f km/h%n", averageSpeed);    
    }
}
