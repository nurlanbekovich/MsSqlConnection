/*
 В стране XYZ население равно 10 миллионов человек. Рождаемость составляет 
14 человек на 1000 человек, смертность - 8 человек. Рассчитайте, какая численность
населения будет через 10 лет,принимая во внимание, что показатели рождаемости и
смертности постоянны.
 */
package Lab_3;

/**
 *
 * @author aidin
 */
public class zadanie_1 {
        public static void main(String[] args) {
        int population = 10000000;
        int born = 14;
        int death = 8;
        int dif = born - death;
        for(int i = 1; i <= 10; i++){
            population += population * dif / 1000;
        }
        System.out.println(population);
    }

}
