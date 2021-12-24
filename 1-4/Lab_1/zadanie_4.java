
//Напишите программу, которая будет выводить список всех
//файлов и каталогов в указанном каталоге с указанием их размера.

package Lab_1;
import java.io.File;
/**
 *
 * @author aidin
 */
public class zadanie_4 {
    
    static int CountSize=0;
    static int CountFolder=0;
    static int CountFile=0;
            
    public static void main(String[] args) {
         
        String dir = new String("C:\\mysql");
        recurs(dir);
        Size(dir);
    }
    public static void recurs(String dirName)
    {
        File dir = new File(dirName);
        CountSize=CountSize+(int) dir.length();
        if(dir.isDirectory())
        {
            CountFolder++;
        }
        else
        {
            CountFile++;
        }
        System.out.println("Название "+dir.getName()+" размер "+dir.length()/1000+" КБ" + (!dir.isDirectory() ? "   Файл" : "   _________________папка_________________"));

        if (dir.isDirectory()) {
            File[] list = dir.listFiles();
            if (list != null)
                for (File name : list)
                    recurs(name.getPath());
        }
    }
    
     public static void Size(String dir)
     {
         System.out.println("Общий размер файлов в каталоге(включая вложенные каталоги) = "+CountSize+" байт");
         System.out.println("В директории "+dir+" содержится "+(CountFolder-1)+" папок и "+CountFile+" файлов");
     }
}
