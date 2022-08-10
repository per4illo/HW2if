public class Main {
    public static void main(String[] args) {
        // задание 1 2

        int clientOS = 0;
        int clientDeviceYear = 2017;

        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        else if (clientOS == 1 && clientDeviceYear >= 2015){
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        else System.out.println("Установите облегченную версию приложения для Android по ссылке");

        // задание 3
        int year = 2004;
        if ((year % 4 == 0) && year % 100 != 0)
        {
            System.out.println(year + " год является високосным");
        }
        else if ((year % 4 == 0) && (year % 100 == 0) && (year % 400 == 0))
        {
            System.out.println(year + " год является високосным");
        }
        else        {
            System.out.println(year + " год не является високосным");
        }

        // задание 4

        int deliveryDistance  = 95;
        int deliveryDay = 1;

        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: " + deliveryDay);
        }
        else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней: " + (deliveryDay + 1) );
        }
        else if (deliveryDistance >= 60) {
            deliveryDay = deliveryDistance / 40 ;
            System.out.println("Потребуется дней: " + (deliveryDay + 1) );
        }
        // задание 5
        int monthNumber  = 12;

        switch (monthNumber ) {
            case 1 :
                System.out.println("Месяц Зимы");
                break;
            case 2 :
                System.out.println("Месяц Зимы");
                break;
            case 12 :
                System.out.println("Месяц Зимы");
                break;
            case 3 :
                System.out.println("Месяц Весны");
                break;
            case 4 :
                System.out.println("Месяц Весны");
                break;
            case 5 :
                System.out.println("Месяц Весны");
                break;
            case 6 :
                System.out.println("Месяц Лета");
                break;
            case 7 :
                System.out.println("Месяц Лета");
                break;
            case 8 :
                System.out.println("Месяц Лета");
                break;

            case 9 :
                System.out.println("Месяц Осени");
                break;
            case 10:
                System.out.println("Месяц Осени");
                break;
            case 11 :
                System.out.println("Месяц Осени");
                break;

            default:
                System.out.println("Такого дня не существует");
        }

    }
}