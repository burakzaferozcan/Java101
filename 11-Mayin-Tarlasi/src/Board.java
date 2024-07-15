import java.util.Random;
import java.util.Scanner;

public class Board {
    private String[][] board;
    private String[][] mineBoard;
    private int rows;
    private int cols;
    private int mines;

    public Board(int rows, int cols) {
        if (rows < 2 || cols < 2) {
            throw new IllegalArgumentException("Matris boyutu en az 2x2 olmalıdır.");
        }

        this.rows = rows;
        this.cols = cols;
        this.mines = (rows * cols) / 4;
        this.board = new String[rows][cols];
        this.mineBoard = new String[rows][cols];

        initializeBoard();
        placeMines();
    }

    private void initializeBoard() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                board[i][j] = "-";
                mineBoard[i][j] = "-";
            }
        }
    }

    private void placeMines() {
        Random rand = new Random();
        int minesPlaced = 0;
        while (minesPlaced < mines) {
            int row = rand.nextInt(rows);
            int col = rand.nextInt(cols);
            if (!mineBoard[row][col].equals("*")) {
                mineBoard[row][col] = "*";
                minesPlaced++;
            }
        }
    }

    public boolean isValidCoordinate(int row, int col) {
        return row >= 0 && row < rows && col >= 0 && col < cols;
    }

    public boolean isMine(int row, int col) {
        return mineBoard[row][col].equals("*");
    }

    public boolean isAlreadySelected(int row, int col) {
        return !board[row][col].equals("-");
    }

    public int[] getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Satır Giriniz : ");
        int row = scanner.nextInt();
        System.out.print("Sütun Giriniz : ");
        int col = scanner.nextInt();
        return new int[]{row, col};
    }

    public void updateBoard(int row, int col) {
        int adjacentMines = countAdjacentMines(row, col);
        board[row][col] = String.valueOf(adjacentMines);
    }

    private int countAdjacentMines(int row, int col) {
        int count = 0;
        int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};

        for (int i = 0; i < 8; i++) {
            int newRow = row + dx[i];
            int newCol = col + dy[i];
            if (isValidCoordinate(newRow, newCol) && isMine(newRow, newCol)) {
                count++;
            }
        }

        return count;
    }

    public void printBoard() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void printMineBoard() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(mineBoard[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean isWin() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (board[i][j].equals("-") && !mineBoard[i][j].equals("*")) {
                    return false;
                }
            }
        }
        return true;
    }

    public void printWelcomeMessage() {
        System.out.println("Mayın Tarlası Oyuna Hoşgeldiniz !");
    }
}
