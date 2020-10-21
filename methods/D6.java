import java.util.Scanner;
class D6 {

    public static void main (String[] args) {
        //1. declare variables
        Scanner sc = new Scanner(System.in);
        int numdice = 0;
        int roll = 0;
        int total = 0;
        int sides = 0;
        String ans = "y";

        while(ans.equals("y")){
            System.out.println("How many D6's do you want to roll? ");
            numdice = sc.nextInt();
            System.out.println("How many sides? ");
            sides = sc.nextInt();
            total = 0;
            System.out.println("You rolled: ");
            for (int i = 0; i < numdice; i++){
                roll = rollDie(sides);
                total = total + roll;
                System.out.print(roll + " ");
            }
            System.out.println("");
            System.out.println("Total: " + total);
            System.out.print("Roll again? y/n ");
            ans = sc.next();
            System.out.println("");

        }
    }

    public static int rollDie(int s) {
        return (int) (Math.random()*s) +1;   
    }
}