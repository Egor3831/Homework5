public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Неизвестная операционная система");

            System.out.println("Задача 2");
            int clientDeviceYear = 2015;
            int clientOS2 = 0;
            if (clientDeviceYear < 2015) {
                if (clientOS2 == 0) {
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                } else if (clientOS2 == 1) {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                }
            } else {
                if (clientOS2 == 0) {
                    System.out.println("Установите версию приложения для iOS по ссылке");
                } else if (clientOS2 == 1) {
                    System.out.println("Установите версию приложения для Android по ссылке");

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
                        int monthNumber = 12;
                        if (monthNumber > 0 && monthNumber <= 12) {
                            String season;
                            switch (monthNumber) {
                                case 12:
                                case 1:
                                case 2:
                                    season = "зима";
                                    break;
                                case 3:
                                case 4:
                                case 5:
                                    season = "весна";
                                    break;
                                case 6:
                                case 7:
                                case 8:
                                    season = "лето";
                                    break;
                                case 9:
                                case 10:
                                case 11:
                                    season = "осень";
                                    break;
                                default:
                                    season = "";
                            }
                            System.out.println("Месяц " + monthNumber + " принадлежит к сезону " + season);
                        } else {
                            System.out.println("Номер месяца некорректен.");


                        }
                    }
                }
            }
        }
    }
}