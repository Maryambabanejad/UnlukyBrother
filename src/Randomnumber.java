import java.util.Random;

public class Randomnumber {
    public static void main(String[] args) {
        Random Randomnumber = new Random();
        int hesamnumber;
        int hadinumber;
        for (hesamnumber = Randomnumber.nextInt(101), hadinumber = Randomnumber.nextInt(101); hesamnumber<=100 || hadinumber <=100; hesamnumber+=Randomnumber.nextInt(11),hadinumber+= Randomnumber.nextInt(11)) {
            System.out.println("hasan number is : " + hesamnumber + " hadi number is : " + hadinumber);
        }
            if (hadinumber<hesamnumber) {
                System.out.println("hesam  won the game and hadi has buy it");
            }
            else if (hadinumber>hesamnumber) {
                System.out.println("hadi won the game and hesam has buy it");
            }
                else {
                System.out.println("Now they have to think about a third solution");
            }
            }
        }


