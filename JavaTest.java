
import java.util.Scanner;

public class JavaTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // 1
        System.out.println("Сколько аниме ты посмотрел(a)?");
        int anime = input.nextInt();
        input.nextLine();

        if (anime > 10) {
            System.out.println("О круто! Откуда ты смотришь аниме? С какого сайта?");
            String site_anime = input.nextLine();

            if (site_anime.equals("Anidab")) {
                System.out.println("О, я тоже оттуда смотрю!");
            } else {
                System.out.println("Прости, я смотрю аниме с Anidab.");
            }
        } else {
            System.out.println("А ты начинающий, тогда посмотри аниме Блич!");
        }
        // 2
        System.out.println("Сколько у тебя эло в шахматах?");
        int elo = input.nextInt();

        if (elo > 2000) {
            System.out.println("You cool!");
        } else {
            System.out.println("Бро нужно тренироваться");
        }

        // 3
        System.out.println("how old are u?");
        int age = input.nextInt();

        if (age > 18) {
            System.out.println("take energy drink");
        } else {
            System.out.println("denied");
        }

        // 4
        System.out.println("Can you bring with you Garyy potter book?");
        String cond = input.nextLine();

        if (cond == "yes") {
            System.out.println("Thank you!");
        } else {
            System.out.println("That s okey");
        }

        // 5
        System.out.println("Сколько ты получил по Мат стат?");
        int goal = input.nextInt();

        if (goal < 50) {
            System.out.println("Я тоже получил меньше 50 баллов(");
        } else {
            System.out.println("Харош!");
        }

        input.close();
    }
}
