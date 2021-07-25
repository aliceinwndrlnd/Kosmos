package com.company;

import java.util.Random;

public class Shattl implements IStart {
    boolean numberMoreThenThree = false;

    public Shattl() {
    }

    @Override
    public boolean preStartChecking() {
        int number;
        System.out.println("Генерируем число от 1 до 10");
        Random rnd = new Random();
        number = rnd.nextInt(11);
        System.out.println("Вам выпало число " + number);
        if (number > 3) {
            numberMoreThenThree = true;
            System.out.println("Предстартовая проверка прошла успешно!");
            return true;
        } else {
            numberMoreThenThree = false;
            System.out.println("Предстартовая проверка провалена!");
            return false;
        }
    }

    @Override
    public void startEngine() {
        if (numberMoreThenThree) {
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
            System.out.println("Двигатели Шаттла запущены! Все системы в норме!");
        } else {
            System.out.println("Двигатели Шаттла не будут запущены запущены!");
        }
    }

    @Override
    public void start() {
        if (numberMoreThenThree) {
            System.out.println("Старт Шаттла!");
        } else {
            System.out.println("Очень жаль, но запуск Шаттла придётся отложить до исправления всех неполадок!");
        }
    }
}

