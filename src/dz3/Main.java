//Д/з Реализовать приложение-игру "Угадай число" с бесконечным циклом запрашивающая
// у пользователя числа и сравнивающая с загаданным алгоритмом числом,
// выдающее "Очень холодно", "Холодно", "Горячо", "Очень горячо", "Угадал".
// При ответе "Угадал" алгоритм закончит игру.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = (int)(Math.random()*100);
        System.out.println(number);
        System.out.println("Hello!!!");

        while (true){
            int userNum = scanner.nextInt();
            if (userNum == number){
                System.out.println("You win!!!");
                break;
            }
            int diff = Math.abs(userNum - number);

            if (diff<=5){
                System.out.println("Very hot");
            } else if (diff>5 && diff <=10) {
                System.out.println("Hot");
            } else if (diff>10 && diff<=20) {
                System.out.println("Cold");
            } else if (diff>20) {
                System.out.println("Very cold");
            }
        }
    }
}