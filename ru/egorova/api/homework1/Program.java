package ru.egorova.api.homework1;

import java.util.Scanner;

public class Program {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        boolean f = true;
        while(f){
            System.out.println("Введите номер задачи: ");
            System.out.println("1 - Задача № 1;");
            System.out.println("2 - Задача № 2;");
            System.out.println("3 - Задача № 3;");
            System.out.println("0 - Выход из программы.");
            System.out.println("**************************************");

            int no = Integer.parseInt(scanner.nextLine());
            
            switch(no){
                case 1:
                    System.out.print("Введите число n:   ");
                    int n = Integer.parseInt(scanner.nextLine());
                    System.out.printf("Сумма чисел от 1 до n = %d\n", Summa(n));
                    System.out.printf("Сумма чисел от 1 до n = %d\n", Factorial(n));
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Простые числа  от 1 до 1000:");
                    task2();    
                    System.out.println();
                    break;
                case 3:
                
                    System.out.print("Введите первое число - ");
                    Double x = Double.parseDouble(scanner.nextLine());
                    System.out.print("Введите второе число - ");
                    Double y = Double.parseDouble(scanner.nextLine());
                    System.out.print("Введите необходимую операцию (+, -, *, /) = ");
                    String operation = scanner.nextLine();
                    System.out.printf("%.0f %s %.0f = %.2f\n",x,operation, y, task3(x, y, operation));
                    System.out.println();
                    break;
                case 0:
                    System.out.println("Завершение работы приложения");
                    f = false;
                    break;
                default:
                    System.out.println("Вы указали некорректный номер задачи.\nПовторите попытку ввода. ");
                    break;
            }
        }
    }


//      1) Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
    static int Summa(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++)
            sum += i;
        return sum;        
    }

        static int Factorial(int n){
        int F = 1;
        for (int i = 1; i <= n; i++)
            F *= i;
        return F;        
    }


//      2) Вывести все простые числа от 1 до 1000

    static void task2(){
        int count = 0;
        for (int i = 2; i <= 1000; i++) {
            for (int j = 2; j <= i; j++) {
                if (i % j == 0) count++;
            }
            if (count == 1) {
                System.out.printf(" %d", i);
            } 
            count = 0;
        }
    }


//      3) Реализовать простой калькулятор
    static double task3(Double x, Double y, String operation){
        double result = 0;
        switch (operation) {
            case "+":
                result = x + y;
                break;
            case "-":
                result = x - y;
                break;
            case "/":
                result = x / y;
                break;
            case "*":
                result = x * y;
                break;
            default:
                System.out.println("Введена неправильная операция!");
                break;
            }
        return result;
    }
}
