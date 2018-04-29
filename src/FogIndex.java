import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class FogIndex{


    int Syllables() {
        int syll = 0;
        try {
            syll = 0;
            File file = new File("C:\\Users\\Admin\\IdeaProjects\\Fog index\\text.txt");
            Scanner sc = new Scanner(file);
            int count = 0;
            while (sc.hasNextLine()) {

                String sat = sc.next();
               // System.out.println(sat);
                char ch[] = sat.toCharArray();
                int b = ch.length;
                if (b > 3) {
                    if (ch[0] >= 65 && ch[0] <= 90)
                        continue;
                    for (int i = 0; i < ch.length - 1; i++) {
                        //  int b= ch.length;
                        if ((ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') && (ch[i + 1] != 'a' && ch[i + 1] != 'e' && ch[i + 1] != 'i' && ch[i + 1] != 'o' && ch[i + 1] != 'u')) {
                            count++;
              //              System.out.println(ch[i]);

                            //   if (count >= 3) {
                            //       syll++;
                            //       break;
                        }
                        //else syll is being incremented even for  syll
                        //System.out.println(ch[i]);
                    }


                    if (sat.endsWith("ed") || sat.endsWith("es") || sat.endsWith("ing")) {
                        if (count >= 4) {
                            syll++;
                //            System.out.println("The number of Syllables are0 " + syll);
                        }
                    } else if (count >= 3) {
                        syll++;
                  //      System.out.println("The number of Syllables are1 " + syll);
                    }
                    count = 0;
                }
            }
           // System.out.println("The number of Syllables are " + syll);
           // return syll;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return syll;
    }

    int sentences(){
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
            //System.out.println(sentences);



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return sentences;
    }

    int word_lines(){
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
            //System.out.println(word);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return word;


    }


    public static void main(String args[]){
        FogIndex fi = new FogIndex();
        int syl= fi.Syllables();
        int sen = fi.sentences();
        int wrd =  fi.word_lines();
        double d = (double)wrd/sen;
        int fog = (int)(0.4*(d+syl));
        System.out.println("THE FOG_INDEX OF THE INPUT TEXT FILE IS : "+fog);
    }
}