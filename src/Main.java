public class Main {
    public static void main(String[] args) {
        System.out.println();

        System.out.println("Задача 1");
        {
            int clientOS = 1;
            if (clientOS == 0) {
                System.out.println("Установите версию приложения для iOS по ссылке.");
            } else if (clientOS == 1) {
                System.out.println("Установите версию приложения для Android по ссылке.");
            } else {
                System.out.println("Неизвестная операционная система.");
            }

            System.out.println();
        }

        System.out.println("Задача 2");
        {
            int clientOS = 1;
            int clientDeviceYear = 2015;
            if (clientDeviceYear < 2015) {
                if (clientOS == 0) {
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
                }
                if (clientOS == 1) {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке.");
                }
            } else {
                if (clientOS == 0) {
                    System.out.println("Установите версию приложения для iOS по ссылке.");
                }
                if (clientOS == 1) {
                    System.out.println("Установите версию приложения для Android по ссылке.");
                }
            }
            System.out.println();
        }

        System.out.println("Задача 3");
        int year = 1995;
        int everyFourth = year % 4;
        int everyHundredth = year % 100;
        int everyFourthHundredth = year % 400;
        if (year > 1584) {
            if (everyFourth == 0 && everyHundredth != 0) {
                System.out.println(year + " год является високосным.");
            } else if (everyHundredth == 0 && everyFourthHundredth == 0) {
                System.out.println(year + " год является високосным.");
            } else {
                System.out.println(year + " год является невисокосным.");
            }
        } else {
            System.out.println("Извините, високосный год еще не был введен.");
        }
        System.out.println();

        System.out.println("Задача 4");
        int deliveryDistance =95;
        if (deliveryDistance < 100) {
            if (deliveryDistance <= 20) {
                System.out.println("Потребуется дней: 1 сутки доставкию");
            }
            else if (deliveryDistance > 20 && deliveryDistance < 60)
            {
                System.out.println("Потребуется дней: 2 сутки доставкию");
            } else {
                System.out.println("Потребуется дней: 3 сутки доставкию");
            }
        } else System.out.println("Доставки нет!");
        System.out.println();

        System.out.println("Задача 5");
        int monthNumber=11;
        switch (monthNumber)
        {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Неверно введен номер месяца!");
        }

    }
}