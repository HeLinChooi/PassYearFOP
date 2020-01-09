package Year2018_1;

public class Test {
//comparing objects' value then gt the highest-value object then return
    //one another property of object
    private int value;
    private String fruit;

    public Test(int value, String fruit) {
        this.value = value;
        this.fruit = fruit;
    }

    public int getValue() {
        return value;
    }

    public String getFruit() {
        return fruit;
    }
    
    public static String max(Test...x){
        String StrongestFruit = "";
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < x.length; i++) {
            if(max<x[i].getValue()){
                max = x[i].getValue();
                StrongestFruit = x[i].getFruit();
            }
        }
        return StrongestFruit;
    }
    public static void main(String[] args) {
        Test apple = new Test(100, "Apple1");
        Test apple2 = new Test(99, "Apple2");
        Test apple3 = new Test(9999, "Apple3");
        System.out.println(max(apple,apple2,apple3));
    }
}
