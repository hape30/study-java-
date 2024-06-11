import static java.lang.System.out;
import java.util.Scanner;

public class JustSwitchIt {
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        out.println("Why el stand in rain");
        int verse = keyboard.nextInt();

        switch (verse) {
            case 1:
                out.println("Because what's going on  long tine");
                break;

            case 2:
                out.println("Because he said");
                break;

            case 3:
                out.println("Because he it's allready wet anyway");
                break;
            default:
                out.println(" he have not reasons");
                break;

        }
        out.println("OOO...OOOO");

        keyboard.close();
    }
}
