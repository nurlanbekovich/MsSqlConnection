//2.	Написать программу, выводящую последние n строк указанного файла.
package Lab_1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class zadanie_2 {
    public static void main(String[] args) throws IOException {
        
        File file = new File("C:\\Users\\Aidin\\Documents\\3 курс\\Весенний  семестр\\Проектирования ПО 4\\lab1.txt");
        
        System.out.println("Начальный текс в файле\n");
        
        try(FileReader reader = new FileReader(file))
        {
           // читаем посимвольно
            int c;
            while((c=reader.read())!=-1){
                 
                System.out.print((char)c);
            } 
        }
        catch(IOException ex){
             
            System.out.println(ex.getMessage());
        }   
        
        Scanner scan = new Scanner(file);
        int counter=1;
        while(scan.hasNextLine())
        {
            String line1 = scan.nextLine();
            counter++;
        }
        scan.close();
        counter=counter-1;
        int count = 0;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
       
        Boolean swap=true;
        while(swap = true)
        {
            System.out.println("\nКоличество строк в файле " + counter + "\n");
            System.out.println("\nВведи количество строк");
            String Inp_str= in.readLine();
            count=Integer.parseInt(Inp_str);
        
            if (count>counter)
            {
                System.out.println("n не должен быть больше количество строк");
                swap=false;
            }
            if(count<counter)
            {
                swap=true;
                break;
            }
        }
        
        
         System.out.println("\n\nПоследние "+count+" строк в файле\n");
       
       try (BufferedReader inp = new BufferedReader( new InputStreamReader(new FileInputStream(file)))) 
       { 
        
        for (int i = 0; i < counter; ++i)
       { 
           String line = inp.readLine();
           if (i>=counter-count)
           {
               System.out.println(line);
           }
           if(line==null)
           {
               break;
           }
       }
       }
        catch(IOException ex){
             
            System.out.println(ex.getMessage());
        } 
    } 
}
