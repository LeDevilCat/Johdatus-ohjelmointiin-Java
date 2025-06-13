package TEH_12;
import java.util.Scanner;

public class TimeConversion {
    public static void main(String[] args) {
        System.out.println("Syötä aijan määrä sekunteina:");
        Scanner scanner = new Scanner(System.in);
        int seconds = scanner.nextInt();
        scanner.close();
        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        int remainingSeconds = seconds % 60;
        System.out.printf("%d tuntia, %d minuuttia ja %d sekuntia%n", hours, minutes, remainingSeconds);        
    }
    
}
