package com.company;

import java.util.Scanner;

public class SpaceX implements IStart{
    boolean numberMoreThatFortyfour = false;

    public SpaceX (){

    }

    @Override
    public boolean preStartChecking() {
        System.out.println("Введите число от 1 до 100");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if (num > 44){
            numberMoreThatFortyfour = true;
            System.out.println("Проверка прошла успешно!");
            return true;
        }else {
            System.out.println("Предстартовая проверка провалена!");
            return false;
        }
    }

    @Override
    public void startEngine() {
        if (numberMoreThatFortyfour) {
            System.out.println("Запускаем двигатель!!!");
            System.out.println("10 .....");
            System.out.println("9 .....");
            System.out.println("8 .....");
            System.out.println("7 .....");
            System.out.println("6 .....");
            System.out.println("5 .....");
            System.out.println("4 .....");
            System.out.println("3 .....");
            System.out.println("2 .....");
            System.out.println("1");
            System.out.println("Двигатели SpaceX запущены! Все системы в норме!");
        } else {
            System.out.println("Двигатели SpaceX не будут запущены запущены!");
        }
    }

    @Override
    public void start() {
        if (numberMoreThatFortyfour) {
            System.out.println("Старт SpaceX!");
        } else {
            System.out.println("Очень жаль, но старт SpaceX придётся отложить до исправления всех неполадок!");
        }

    }
}
