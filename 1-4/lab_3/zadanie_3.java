/*
За каждый месяц банк начисляет к сумме вклада 7% от суммы. 
Напишите консольную программу, в которую пользователь вводит
сумму вклада и количество месяцев. А банк вычисляет конечную сумму вклада
с учетом начисления процентов за каждый месяц.
 */
package Lab_3;

import java.util.Scanner;

/**
 * @author aidin
 */
public class zadanie_3 {
        public static void main(String[] args) {
 
        Scanner in = new Scanner(System.in);
        System.out.print("Введите сумму вклада: ");
        float sum = in.nextFloat();
        System.out.print("Введите срок вклада в месяцах: ");
        int period = in.nextInt();
 
        for(int i = 1; i <= period; i++){
            sum += sum * 0.07;
        }
        System.out.printf("После %d месяцев сумма вклада составит %f", period, sum);
    }

}
