import java.util.Random;

public class MainClass {
    public static void main(String[] args) {
//        Random rand =new Random();
//        int x = rand.nextInt(21);
//        System.out.println(x);
//        //10     60
//      int y =  rand.nextInt(51) +10;
//        System.out.println(y);
//        int z = rand.nextInt(201)+100;  // 100       300
//        System.out.println(z);
//        //int a =20;
//        //int b=50;
//        int w = rand.nextInt(31)+20;
//        System.out.println(w);
//    }
//}
        Random rand = new Random();
//A  65
//B  66

//a  97
//b  98

// 0  48
// 1  49

//    32
        int x = rand.nextInt(26) + 65;      //0      25
        System.out.println((char) x);
    }
}