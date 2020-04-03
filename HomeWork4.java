// ДЗ по уроку 1 пункта 4

import java.util.Scanner;
    public class HomeWork4 {
        public static void main(String[] args) {// запуск программы.
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите число от 1 до 11:");
            int a = sc.nextInt();
            System.out.println("Введите второе число от 1 до 11:");
            int b = sc.nextInt();
            sc.close();
            System.out.println("Сумма чисел равна:" + (a + b));
            if (a + b >= 10 && a + b <= 20) ;
            System.out.println("true!");
        }   else {
            System.out.println("false!");
        }
    }