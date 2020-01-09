package Year2017_2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Q4Tester {
    public static void main(String[] args) {
        ObjectInputStream in = null;
        try {
            in = new ObjectInputStream(new FileInputStream("Q4.dat"));
//            System.out.println(in.readUTF());
//            System.out.println(in.readUTF());
//            Q4DayOfTheWeek a = new Q4DayOfTheWeek(25, 3, 2017);
//            Q4DayOfTheWeek b = new Q4DayOfTheWeek(29, 2, 2100);
//            Q4DayOfTheWeek c = new Q4DayOfTheWeek(19, 1, 2017);
//            Q4DayOfTheWeek d = new Q4DayOfTheWeek(31, 9, 2015);
//            Q4DayOfTheWeek e = new Q4DayOfTheWeek(31, 5, 2017);
            Q4DayOfTheWeek f = new Q4DayOfTheWeek(29, 2, 2016);
        } catch (FileNotFoundException ex) {
            System.out.println("File not found");
        } catch (IOException ex) {
            System.out.println("IOException");
        }
    }
    
}
