import java.util.Random;

public class RondomClass {
    public static void main(String[] args) {
        Random rand = new Random();
        int total=0;
        for (int i = 1 ; i<=10; i++){
            int x = rand.nextInt(101)+10;
            System.out.println(x+"");
            total+=x;
        }
        System.out.println("total:" + total);
    }
}