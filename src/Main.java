public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int os = 1;
        if (os == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        System.out.println("Задача 2");
        int clientDeviceYear = 2015;
        int ClientDeviceOs = 1;

        if (ClientDeviceOs == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else if (ClientDeviceOs == 1) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }

        System.out.println("Задача 3");
        int year = 2024;
        if (year > 1584) {
            boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
            if (isLeap) {
                System.out.println(year + " год является високосным");
            } else {
                System.out.println(year + " год не является високосным");
            }
        } else {
            System.out.println("Год должен быть больше, чем 1584.");
        }
        System.out.println("Задача 4");
        int deliveryDistance = 95;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется 1 день");
        } else if (deliveryDistance <= 60) {
            System.out.println("Потребуется 2 дня");
        } else if (deliveryDistance <= 100) {
            System.out.println("Потребуется 3 дня");
        } else {
            System.out.println("Доставка в этот регион невозможна");
        }

        System.out.println("Задача 5");
        int month = 12;
        switch (month) {
            case 12, 1, 2:
                System.out.println("Зима");
                break;
            case 3, 4, 5:
                System.out.println("Весна");
                break;
            case 6, 7, 8:
                System.out.println("Лето");
                break;
            case 9, 10, 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Номер месяца некорректен.");


        }
        }
    }
