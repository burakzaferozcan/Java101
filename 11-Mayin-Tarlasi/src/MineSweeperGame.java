import java.util.Scanner;

public class MineSweeperGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Satır sayısını giriniz: ");
        int rows = scanner.nextInt();
        System.out.print("Sütun sayısını giriniz: ");
        int cols = scanner.nextInt();

        try {
            MineSweeper mineSweeper = new MineSweeper(rows, cols);
            mineSweeper.playGame();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}
