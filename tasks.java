
import java.util.Scanner;

public class Task {

    static void First_Task() {
        Scanner input = new Scanner(System.in);

        System.out.println("`1` – Тариф «Эконом» (10 ГБ интернета, 100 минут, 2000 тенге) \n `2` – Тариф «Стандарт» (30 ГБ, 300 минут, 4000 тенге)\n `3` – Тариф «Премиум» (Безлимит, 1000 минут, 7000 тенге).\n");
        int choose = input.nextInt();

        switch (choose) {
            case 1:
                System.out.println("Your choice is 1 `1` – Тариф «Эконом» (10 ГБ интернета, 100 минут, 2000 тенге)");
                break;
            case 2:
                System.out.println("Your choice is 2 `2` – Тариф «Стандарт» (30 ГБ, 300 минут, 4000 тенге)");
                break;
            case 3:
                System.out.println("Your choice is 3 `3` – Тариф «Премиум» (Безлимит, 1000 минут, 7000 тенге)");
                break;
            default:
                System.out.println("Mistake");
        }
    }

    static void SecondTask() {
        Scanner input = new Scanner(System.in);

        System.out.println("вводит номер месяца (1–12), ");
        int month = input.nextInt();

        switch (month) {
            case 12, 1, 2:
                System.out.println("zima");
                break;
            case 3, 4, 5:
                System.out.println("Vesna");
                break;
            case 6, 7, 8:
                System.out.println("Leto");
                break;
            case 9, 10, 11:
                System.out.println("Osen");
                break;
            default:
                System.out.println("Mistake");
        }
    }

    static void Third_Task() {
        Scanner input = new Scanner(System.in);

        System.out.println("Выберите валюту для конвертации: \n`1` – USD \n`2` – EUR \n`3` – RUB \n`4` – CNY");
        int choose = input.nextInt();

        System.out.println("Введите сумму в тенге: ");
        double amount = input.nextDouble();

        switch (choose) {
            case 1:
                System.out.println("Конвертация в USD: " + amount / 499);
                break;
            case 2:
                System.out.println("Конвертация в EUR: " + amount / 522);
                break;
            case 3:
                System.out.println("Конвертация в RUB: " + amount / 5);
                break;
            case 4:
                System.out.println("Конвертация в CNY: " + amount / 65);
                break;
            default:
                System.out.println("Ошибка");
        }

        input.close();
    }

    static void FourthTask() {
        Scanner input = new Scanner(System.in);

        System.out.println("Введите день недели:");
        int day = input.nextInt();

        switch (day) {
            case 1, 2, 3, 4, 5:
                System.out.println("Рабочий день");
                break;
            case 6, 7:
                System.out.println("Выходной");
                break;
            default:
                System.out.println("Что то пошло не так.");
        }
    }

    static void FifthTask() {
        Scanner input = new Scanner(System.in);

        System.out.println("- `1` – Доставка за 1000 тенге в течение 24 часов.\r\n"
                + //
                "- `2` – Бесплатно, но нужно забрать из магазина.\r\n"
                + //
                "- `3` – 500 тенге, срок 3-5 дней.\r\n"
                + //
                "");
        int choice = input.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Вы выбрали первый вариант пожалуйста подождите");
                break;
            case 2:
                System.out.println("Вы выбрали второй вариант пожалуйста подождите");
                break;
            case 3:
                System.out.println("Вы выбрали третий вариант пожалуйста подождите");
                break;
            default:
                System.out.println("Something goes wrong.");
        }
    }

    static void SixTask() {
        Scanner input = new Scanner(System.in);

        System.out.println("вводит категорию (1:`A`,2: `B`,3: `C`,4: `D`)");
        int category = input.nextInt();

        switch (category) {
            case 1:
                System.out.println("Вы выыбрали A");
                break;
            case 2:
                System.out.println("Вы выыбрали B");
                break;
            case 3:
                System.out.println("Вы выыбрали C");
                break;
            case 4:
                System.out.println("Вы выыбрали D");
                break;
            default:
                System.out.println("Something goes wrong.");
        }
    }

    static void SevenTask() {
        Scanner input = new Scanner(System.in);

        System.out.println("1 Эспрессо\n 2  Латте\n 3  Капучино\n 4  Чай ");
        int coffee = input.nextInt();

        switch (coffee) {
            case 1:
                System.out.println("Вы выыбрали Экспрессо");
                break;
            case 2:
                System.out.println("Вы выбрали латте");
            case 3:
                System.out.println("Вы выбрали Капучино");
                break;
            case 4:
                System.out.println("Вы выбрали чай");
                break;
            default:
                System.out.println("Что то пошло не так.");
        }
    }

    static void EightTask() {
        Scanner input = new Scanner(System.in);

        System.out.println("1 Силовая 2 Кардио 3 Йога 4 Плавание");
        int fitnes = input.nextInt();

        switch (fitnes) {
            case 1:
                System.out.println("Вы выбрали 'Силовая' – тренировка на развитие силы и мышечной массы.");
                break;
            case 2:
                System.out.println("Вы выбрали 'Кардио' – упражнения для улучшения выносливости и сердечно-сосудистой системы.");
                break;
            case 3:
                System.out.println("Вы выбрали 'Йога' – комплекс упражнений для гибкости, дыхания и расслабления.");
                break;
            case 4:
                System.out.println("Вы выбрали 'Плавание' – тренировка для укрепления всех групп мышц и улучшения координации.");
                break;
        }
    }

    static void NineTask() {
        Scanner input = new Scanner(System.in);

        System.out.println("1 Новый клиент 2 Постоянный клиент 3 VIP");
        int client = input.nextInt();

        switch (client) {
            case 1:
                System.out.println("Ваша скидка: 5%");
                break;
            case 2:
                System.out.println("Ваша скидка: 10%");
                break;
            case 3:
                System.out.println("Ваша скидка: 20%");
                break;
            default:
                System.out.println("Ошибка");
        }
    }

    static void Tenth_Task() {
        Scanner input = new Scanner(System.in);

        System.out.println("Выберите жанр фильма: \n`1` – Боевик \n`2` – Комедия \n`3` – Фантастика \n`4` – Драма");
        int choose = input.nextInt();

        switch (choose) {
            case 1:
                System.out.println("Рекомендуемый фильм: 'Джон Уик'");
                break;
            case 2:
                System.out.println("Рекомендуемый фильм: 'Один дома'");
                break;
            case 3:
                System.out.println("Рекомендуемый фильм: 'Интерстеллар'");
                break;
            case 4:
                System.out.println("Рекомендуемый фильм: 'Зеленая миля'");
                break;
            default:
                System.out.println("Ошибка");
        }

        input.close();
    }
}
