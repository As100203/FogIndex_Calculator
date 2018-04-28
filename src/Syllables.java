import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Syllables {
    public static void main(String args[]){

        try {
            int syll=0;
            File file = new File("C:\\Users\\Admin\\IdeaProjects\\Fog index\\text.txt");
            Scanner sc  = new Scanner(file);
            int count = 0;
            while(sc.hasNextLine()) {

                String sat = sc.next();
                System.out.println(sat);
                char ch[] = sat.toCharArray();
                int b = ch.length;
                if (b > 3) {
                    if (ch[0] >= 65 && ch[0] <= 90)
                        continue;
                    for (int i = 0; i < ch.length - 1; i++) {
                        //  int b= ch.length;
                        if ((ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') && (ch[i + 1] != 'a' && ch[i + 1] != 'e' && ch[i + 1] != 'i' && ch[i + 1] != 'o' && ch[i + 1] != 'u') ) {
                            count++;
                            //System.out.println(ch[i]);

                            if (count >= 3) {
                                syll++;
                                break;
                            }
                            //else syll is being incremented even for  syll
                            //System.out.println(ch[i]);
                        }
                    }
                    if(sat.endsWith("ed")||sat.endsWith("es")||sat.endsWith("ing"))
                    {
                        syll--;
                    }
                    count = 0;
                }
            }
                System.out.println("The number of Syllables are "+syll);
            } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
