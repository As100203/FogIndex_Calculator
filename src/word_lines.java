import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class word_lines {
    public static void main(String args[]){
       int word=0;
        File file= new File("C:\\Users\\Admin\\IdeaProjects\\Fog index\\text.txt") ;
        //int word=0;
        try {
            Scanner sc = new Scanner(file);
            while(sc.hasNextLine()){
                String sat = sc.next();
                if(sat.charAt(0)=='.' || sat.charAt(0)=='-'||sat.charAt(0)=='?')
                    continue;
                word++;
               // if(sc.)
               // sc.next();

            }
            System.out.println(word);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
