/*
 В цикле программа просит у пользователя ввести
два числа и выводит результат их умножения.
 */
package Lab_3;

import java.util.Scanner;

/**1
 *
 * @author aidin
 */
public class zadanie_6 {
        public static void main(String[] args) {
 
        Scanner in = new Scanner(System.in);
        int n = 0;
        do
        {
            System.out.println("Введите первое число: ");
            int num1 = in.nextInt();
            System.out.println("Введите второе число: ");
            int num2 = in.nextInt();
            System.out.printf("%d * %d = %d \n", num1, num2, num1 * num2);
 
            System.out.println("Для выхода из программы нажмите цифру 1, для подолжения любую другую цифру");
            n = in.nextInt();
        }
        while(n!=1);
    }

}
