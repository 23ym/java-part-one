public class Loop {
    public static void main(String[] args) {

//        int a = 10;
//        a = a + 1;
//        a = += 1;
//        a++;
//        a = a - 1;
//        a -= 1;
//        a--;

//        int i = 1;
//        while (i <= 1000) {
//            System.out.println(i);
//            i++;
//            if (i == 5) {
//                break;

//

//        int sum = 0;
//        int count = 1;
//        while (count <= 100) {
//            sum += count;
//            count++;
//        }
//        float result = sum / (float) count;
//        System.out.println(result);

//        int a = 0;
//        for (int i = 0; i < 100; i++) {
//            System.out.println(i);
//        }

//        for (int i = 1000; i > 0; i--) {
//            if (i % 3 == 0) {
//                System.out.println(i);
//            }
//        }
//        Вивести всі непарні числа від 100 до 1000, що діляться на 5

        for (int i = 100; i <= 1000; i++) {
            if (i % 2 == 1 && i % 5 == 0) {
                System.out.println(i);
            }
        }
    }
}
