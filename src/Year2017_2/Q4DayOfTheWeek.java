package Year2017_2;

public class Q4DayOfTheWeek {

    private int h;
    private int q;
    private int m;
    private int y;
    private int J;
    private int K;

    public Q4DayOfTheWeek(int q, int m, int y) {
        this.q = q;
        if(m == 1)this.m = 13;
        else if(m == 2)this.m = 14;
        else this.m = m;
        this.y = y;
        this.J = y / 100;
        this.K = y % 100;
        if (!validDay()) {
            System.out.println(displayDate() + " is invalid Input.");
        } else {
            dayOfTheWeek();
        }
    }

    public String displayDate() {
        int m2;
        if(m == 13){
            m2 = 1;
        }else if(m ==14){
            m2 = 2;
        }else{
            m2 = m;
        }
        return String.format("%d/%d/%d", q, m2, y);
    }

    public boolean validDay() {
        if (this.m == 13 || this.m == 3 || this.m == 5 || this.m == 5
                || this.m == 7 || this.m == 8 || this.m == 10
                || this.m == 12) {
            return (this.q > 0 && this.q < 32);
        } else if (this.m == 4 || this.m == 6 || this.m == 9 || this.m == 11) {
            return (this.q > 0 && this.q < 31);
        } else if (this.m == 14) {
            if (leapYear(y)) {
                return (q > 0 && q < 30);
            } else {
                return (q > 0 && q < 29);
            }
        } else {
            System.out.println("The month may invalid.");
            return false;
        }
    }

    public boolean leapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
    }

    public void dayOfTheWeek() {
        this.h = (int)((q + Math.floor((13 * (m + 1)) / 5) + K + Math.floor(K / 4)
                + Math.floor(J / 4) + 5 * J) % 7);
        m = 2;
        int chengHuiAns =  (int)(q + Math.floor((13 * (m + 1)) / 5) + K + Math.floor(K / 4) + Math.floor(J / 4) + 5 * J) % 7;
        System.out.println("His ans is "+chengHuiAns );
        System.out.println(q);
        System.out.println(Math.floor((13 * (m + 1)) / 5));
        System.out.println(K);
        System.out.println(Math.floor(K / 4.0));
        System.out.println(Math.floor(J / 4.0));
        System.out.println(5 * J);
        String day = "";
        switch(h){
            case 0: day = "Saturday";break;
            case 1: day = "Sunday";break;
            case 2: day = "Monday";break;
            case 3: day = "Tuesday";break;
            case 4: day = "Wednesday";break;
            case 5: day = "Thursday";break;
            case 6: day = "Friday";break;
        }
        System.out.println(displayDate() + " is on " + day);
    }
}
