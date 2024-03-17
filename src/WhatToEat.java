public class WhatToEat {
    public static void main(String[] args) {
        int countOfMoney = 50;
        if (countOfMoney >= 500) {
            System.out.println("Pizza");
        } else if (countOfMoney >= 300) {
            System.out.println("Gamburger");
        } else if (countOfMoney >= 100) {
            System.out.println("Coffee");
        } else {
            System.out.println("Tea");
        }
    }
}
