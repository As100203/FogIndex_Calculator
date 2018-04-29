import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class sentences {
    public static void main(String args[]){
        int sentences = 0;
        File file = new File("C:\\Users\\Admin\\IdeaProjects\\Fog index\\text.txt");
        try{
            Scanner sc =new Scanner(file);

            while(sc.hasNextLine()){
                String line = sc.nextLine();
                StringTokenizer st = new StringTokenizer(line,".?");
                while(st.hasMoreTokens()){
                    String sta = st.nextToken();
                    sentences++;
                }
            }
            System.out.println(sentences);



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
