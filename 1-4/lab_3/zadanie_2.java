/*
 В стране XYZ население равно 10 миллионов человек. Рождаемость составляет 14 человек
на 1000 человек, смертность - 8 человек. Каждый год рождается и умирает на 1 человек,
меньше чем в предыдущий год. Рассчитайте, какая численность населения будет через 10 лет,
учитывая, что рождаемость не может быть меньше 7 человек на 1000 человек,
а смертностность не может быть меньше 6 человек на 1000 человек.
 */
package Lab_3;

/**
 *
 * @author aidin
 */
public class zadanie_2 {
    
        public static void main(String[] args) {
           
        int population = 10000000;
        int born = 14;
        int death = 8;
        for(int i = 1; i <= 10; i++){
            if (born > 7) born -= 1;
            if  (death > 6) death -=1;
            population += population * (born - death) / 1000;
        }
        System.out.println(population);
    }

}
