import java.io.*;
import java.util.Random;

public class RandomDigit {
    public static void main(String[] args) throws IOException{
        int number[] = new int[100];
        Random random = new Random();
        File f = new File("e:\\study\\number.txt");
        BufferedWriter out = new BufferedWriter(new FileWriter(f));
        for(int i=0; i< 99 ; i++){
            number[i] = random.nextInt(100);
            out.write(number[i]+"\n");
        }
        out.flush();
        out.close();
    }

}
