public class Space {
    public static void main(String[] args) {
        int[] dayOfMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for (int i : dayOfMonth) {
            System.out.println(i);
        }
        String s = "Hello, world!";
        System.out.println(s);

        String name = "Ivan";
        int age = 36;
        String results = "Hi, " + name + "! \nYou're " + age + " years old.";
        System.out.println(results);

        String[] namesOfMonth = {
                "Січень",
                "Лютий",
                "Березень",
                "Квітень",
                "Травень",
                "Червень",
                "Липень",
                "Серпень",
                "Вересень",
                "Жовтень",
                "Листопад",
                "Грудень"
        };
        String result = "";
        for (int i = 0; i < namesOfMonth.length; i++) {
            result += namesOfMonth[i];
            if (i == namesOfMonth.length - 1) {
                result += ".";
            } else {
                result += ", ";
            }
        }
        System.out.println(result);

        int numberOfMonth = 16;
        if (numberOfMonth == 1) {
            System.out.println("Січень");
        } else if (numberOfMonth == 2) {
            System.out.println("Лютий");
        } else if (numberOfMonth == 3) {
            System.out.println("Березень");
        } else if (numberOfMonth == 4) {
            System.out.println("Квітень");
        } else if (numberOfMonth == 5) {
            System.out.println("Травень");
        } else if (numberOfMonth == 6) {
            System.out.println("Червень");
        } else if (numberOfMonth == 7) {
            System.out.println("Липень");
        } else if (numberOfMonth == 8) {
            System.out.println("Серпень");
        } else if (numberOfMonth == 9) {
            System.out.println("Вересень");
        } else if (numberOfMonth == 10) {
            System.out.println("Жовтень");
        } else if (numberOfMonth == 11) {
            System.out.println("Листопад");
        } else if (numberOfMonth == 12) {
            System.out.println("Грудень");
        } else {
            System.out.println("Такого місяця не існує");
        }
        switch (numberOfMonth) {
            case 1:
                System.out.println("Січень");
                break;
            case 2:
                System.out.println("Лютий");
                break;
            case 3:
                System.out.println("Березень");
                break;
            case 4:
                System.out.println("Квітень");
                break;
            case 5:
                System.out.println("Травень");
                break;
            case 6:
                System.out.println("Червень");
                break;
            case 7:
                System.out.println("Липень");
                break;
            case 8:
                System.out.println("Серпень");
                break;
            case 9:
                System.out.println("Вересень");
                break;
            case 10:
                System.out.println("Жовтень");
                break;
            case 11:
                System.out.println("Листопад");
                break;
            case 12:
                System.out.println("Грудень");
                break;
            default:
                System.out.println("Такого місяця не існує");
                break;
        }

        String month = "Січень";

        if (month.equals("Грудень") || month.equals("Січень") || month.equals("Лютий")) {
            System.out.println("Зима");
        } else if (month.equals("Березень") || month.equals("Квітень") || month.equals("Травень")) {
                System.out.println("Весна");
        } else if (month.equals("Червень") || month.equals("Липень") || month.equals("Серпень")) {
            System.out.println("Літо");
        } else if (month.equals("Вересень") || month.equals("Жовтень") || month.equals("Листопад")) {
            System.out.println("Осінь");
        } else {
            System.out.println("Не існуюча пора року");
        }

        month = "Червень";

        switch (month) {
            case  "Грудень":
            case  "Січень":
            case  "Лютий":
                System.out.println("Зима");
                break;
            case  "Березень":
            case  "Квітень":
            case  "Травень":
                System.out.println("Весна");
                break;
            case  "Червень":
            case  "Липень":
            case  "Серпень":
                System.out.println("Літо");
                break;
            case  "Вересень":
            case  "Жовтень":
            case  "Листопад":
                System.out.println("Осінь");
                break;
            default:
                System.out.println("Не існуюча пора року");
                break;
        }

        String first = "Hello";
        String seconds = "Hello";
        if (first.equals(seconds)) {
            System.out.println();
        }
    }
}
