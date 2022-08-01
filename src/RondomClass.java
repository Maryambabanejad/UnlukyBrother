import java.util.Random;

public class RondomClass {
    public static void main(String[] args) {
        Random myobject = new Random();
        int total = 0;
        for (int i = 1; i<=10 ; i++) {
            int number = myobject.nextInt(200);
            System.out.println(number+"");
            //total+=number;
        }
        //System.out.println("total :" + total);
    }
}
