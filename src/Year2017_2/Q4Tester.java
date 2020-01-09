package Year2017_2;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Q4Tester {
    public static void main(String[] args) {
        ObjectInputStream in = null;
        int q;
        int m;
        int y;
        try {
            in = new ObjectInputStream(new FileInputStream("Q4.dat"));
            while(true){
                String str = in.readUTF();
                q = Integer.parseInt(str.substring(0, 2));
                m = Integer.parseInt(str.substring(2, 4));
                y = Integer.parseInt(str.substring(4));
                Q4DayOfTheWeek a = new Q4DayOfTheWeek(q,m,y);
            }
        } catch (EOFException ex) {
            System.out.println("End of file");
        } catch (FileNotFoundException ex) {
            System.out.println("File not found");
        } catch (IOException ex) {
            System.out.println("IOException");
        }
    }
    
}
