package lesson;

public class App {

    public static void main(String[] args) {
        Talker talkers [] = new Talker[2];
        talkers[0] = new SayHello();
        talkers[1] = new SayWorld();

        for(Talker t : talkers){
            System.out.print(t.SaySomething());
            System.out.print(" ");
        }
        System.out.println();
    }
}
