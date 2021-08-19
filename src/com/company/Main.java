package com.company;

public class Main {

    public static void main(String[] args) {

        int chargeLevel = 5;

//        if (chargeLevel <= 20) {
//            System.out.println("Зарядите устройство!");
//        } else if (chargeLevel == 100) {
//            System.out.println("Зарядка не требуется!");
//        } else {
//            System.out.println("Уровень заряда нормальный");
//        }

//        int temp = 8;
//        boolean isSnow = false;
//
//        if (isSnow || temp >= 8){
//            System.out.println("Остаться дома");
//        } else {
//            System.out.println("Можно гулять");
//        }

        int number = 4;

        switch (number){
            case 1:
                System.out.println("Это число 1");
                break;
            case 2:
                System.out.println("Это число 2");
                break;
            case 3:
                System.out.println("Это число 3");
                break;
            default:
                System.out.println("Нет такого числа!!!");
        }

    }
}
