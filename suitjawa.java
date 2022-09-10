import java.util.Random;
import java.util.Scanner;

public class suitjawa {
    public static void main(String[] args) {

        while (true) {
            String[] suit = {"j", "t", "k"};
            String computer = suit[new Random().nextInt(suit.length)];
            String player, playAgain;
            Scanner topo = new Scanner(System.in);

            while (true) {
                System.out.print("Tentukan pilihan [j/t/k] : ");
                player = topo.nextLine();
                if (player.equals("j") || player.equals("t") || player.equals("k")) {
                    break;
                }
                System.out.println(player + " tidak sesuai dengan pilihan");
            }
            System.out.println("Computer : " + computer);

            if (player.equals(computer)) {
                System.out.println("Seri!!!");
            } else if (player.equals("j")) {
                if (computer.equals("t")) {
                    System.out.println("kamu menang, good game!!!");
                } else if (computer.equals("k")) {
                    System.out.println("kamu kalah, nice try!!!");
                }
            } else if (player.equals("t")) {
                if (computer.equals("j")) {
                    System.out.println("kamu kalah, nice try!!!");
                } else if (computer.equals("k")) {
                    System.out.println("kamu menang, good game!!!");
                }
            } else if (player.equals("k")) {
                if (computer.equals("j")) {
                    System.out.println("kamu menang, good game!!!");
                } else if (computer.equals("t")) {
                    System.out.println("kamu kalah, nice try!!!");
                }
            }
            System.out.print("ingin main lagi? [y/n] : ");
            playAgain = topo.nextLine();
            if (playAgain.equals("n")) {
                System.out.println("terima kasih sudah bermain");
                break;
            }
        }
    }
}
