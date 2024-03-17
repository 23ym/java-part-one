public class Time {
    public static void main(String[] args) {
        int seconds = 60000354;
        int secondsInMinutes = 60;
        int secondsInHours = secondsInMinutes * 60;
        int secondsInDays = secondsInHours * 24;
        int days = seconds / secondsInDays;
        int hours = (seconds % secondsInDays) / secondsInHours;
        int minutes = ((seconds % secondsInDays) % secondsInHours) / secondsInMinutes;
        int leftSeconds = seconds - days * secondsInDays - hours * secondsInHours - minutes * secondsInMinutes;

        System.out.println("Кількість секунд: " + seconds);
        System.out.println("Це дорівнює: ");
        System.out.println("Днів " + days);
        System.out.println("Годин " + hours);
        System.out.println("Хвилин " + minutes);
        System.out.println("Секунд " + leftSeconds);
    }
}
