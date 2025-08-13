//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        int clientYearOS = 1;
        int clientDeviceYear = 2015;

        if (clientYearOS == 0) {
            if(clientDeviceYear <= 2015){
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else if (clientYearOS == 1) {
            if (clientDeviceYear <= 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }


        int year = 2024;
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) && (year > 1584)) {
            System.out.println("Год является високосным");
        } else {
            System.out.println("Год не является високосным");
        }
        int deliveryDistance = 95;
        int deliveryDays = 1;
        if (deliveryDistance > 100) {
            System.out.println("Доставки нет");
        } else if (deliveryDistance >= 60) {
            deliveryDays += 2;
            System.out.println("Потребуется " + deliveryDays + " дня");
        } else if (deliveryDistance >= 20) {
            deliveryDays += 1;
            System.out.println("Потребуется " + deliveryDays + " дня");
        } else if (deliveryDistance < 20) {
            System.out.println("Потребуется " + deliveryDays + " день");
        }

        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
                System.out.println("Январь, зима");
                break;
            case 2:
                System.out.println("Февраль, зима");
                break;
            case 3:
                System.out.println("Март, весна");
                break;
            case 4:
                System.out.println("Апрель, весна");
                break;
            case 5:
                System.out.println("Май, весна");
                break;
            case 6:
                System.out.println("Июнь, лето");
                break;
            case 7:
                System.out.println("Июль, лето");
                break;
            case 8:
                System.out.println("Август, лето");
                break;
            case 9:
                System.out.println("Сентябрь, осень");
                break;
            case 10:
                System.out.println("Октябрь, осень");
                break;
            case 11:
                System.out.println("Ноябрь, осень");
                break;
            case 12:
                System.out.println("Декабрь, зима");
                break;
            default:
                System.out.println("Месяцев больше нет");
        }
    }
}

