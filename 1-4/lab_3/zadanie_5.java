/*
 Напишите программу, которая выводит на консоль таблицу умножения
 */
package Lab_3;

/**
 *
 * @author aidin
 */
public class zadanie_5 {
        public static void main(String[] args) {
 
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.printf("%d\t", i * j);
            }
            System.out.println();
        }
    }

}
