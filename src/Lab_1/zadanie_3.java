package Lab_1;
/// 3.	Напишите программу, подсчитывающую число букв, слов и строк в указанном файле.
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aidin
 */
public class zadanie_3 {
    
    public static void main(String[] args) throws IOException, Exception {
        
        File file = new File("C:\\Users\\Aidin\\Documents\\3 курс\\Весенний  семестр\\Проектирования ПО 4\\lab1.txt");
        
        System.out.println("Начальный текс в файле\n");
        
        try(FileReader reader = new FileReader(file))
        {
           // читаем посимвольно
            int c;
            while((c=reader.read())!=-1)
            {
                 
                System.out.print((char)c);
    
            } 
            CountLetters(file);
            CountWords(file);
            CountLines(file);
        }
        catch(IOException ex){
             
            System.out.println(ex.getMessage());
        }   
    }  
    public static void CountLetters(File file)throws Exception
    {
        try {
            FileInputStream FIS = new FileInputStream(file);
            int count=0;
            while(FIS.available()>0)
            {
                if(FIS.read()!=(byte)' ')
                {
                    count++;
                }
            }
            
            System.out.println("\n\nКоличество букв в файле(без пробелов)="+count);

        } catch (FileNotFoundException ex) {
            Logger.getLogger(zadanie_3.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void CountWords(File file)throws Exception
    {
        try {
           Scanner scan = new Scanner(file);
           int count=0;
           while(scan.hasNext())
           {
               scan.next();
               count++;
           }
            scan.close();
            System.out.println("Количество слов в файле="+count);

        } catch (FileNotFoundException ex) {
            Logger.getLogger(zadanie_3.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
     public static void CountLines(File file)throws Exception
    {
        try {
            int count;
            try (Scanner scan = new Scanner(file)) {
                count = 0;
                while(scan.hasNextLine())
                {
                    String line1 = scan.nextLine();
                    count++;
                }
            }
            
            System.out.println("Количество строк в файле="+count);

        } catch (FileNotFoundException ex) {
            Logger.getLogger(zadanie_3.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
