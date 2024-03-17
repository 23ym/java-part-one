public class Temperature {
    public static void main(String[] args) {
        int temp = 23;
        if (temp > 25) {
            System.out.println("Кондиціонер увімкнуто");
        } else if (temp < 22) {
            System.out.println("Кондиціонер вимкнено");
        } else {
            System.out.println("Кондиціонер не змінює свій стан");
        }
    }
}
