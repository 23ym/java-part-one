public class ArrayForEach {
    public static void main(String[] args) {
//        int[] nums = new int[100];
//        for (int i = 0; i < nums.length; i++) {
//            nums[i] = i * 10;
//        }
//        for (int i : nums) {
//            System.out.println(i);
//        }
//        char[] chars = new char[10];
//        for (char ch : chars) {
//            System.out.println(ch);
//        }
//      Створити масив чисел від 100 до 1000, створити другий масив довжиною,
//      як перший, заповнити значеннями з першого масиву в зворотному порядку.
//      В циклі for each вивести всі елементи другого масиву.
        int[] first = new int[900];
        for (int i = 0; i < first.length; i++) {
            first[i] = i + 100;
        }
        int[] second = new int[first.length];
        for (int i = 0, j = first.length - 1; i < first.length; i++, j--) {
            second[j] = first[i];
        }
        for (int i : second) {
            System.out.println(i);
        }
    }
}
