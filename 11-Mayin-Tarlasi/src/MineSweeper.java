public class MineSweeper {
    private Board board;
    private boolean gameOver;

    public MineSweeper(int rows, int cols) {
        this.board = new Board(rows, cols);
        this.gameOver = false;
    }

    public void playGame() {
        board.printWelcomeMessage();
        board.printBoard();

        while (!gameOver) {
            int[] coordinates = board.getUserInput();
            int row = coordinates[0];
            int col = coordinates[1];

            if (!board.isValidCoordinate(row, col)) {
                System.out.println("Geçersiz koordinat, lütfen tekrar deneyin.");
                continue;
            }

            if (board.isAlreadySelected(row, col)) {
                System.out.println("Bu koordinat daha önce seçildi, başka bir koordinat girin.");
                continue;
            }

            if (board.isMine(row, col)) {
                gameOver = true;
                System.out.println("Game Over!!");
                board.printMineBoard();
            } else {
                board.updateBoard(row, col);
                board.printBoard();

                if (board.isWin()) {
                    System.out.println("Oyunu Kazandınız !");
                    board.printMineBoard();
                    gameOver = true;
                }
            }
        }
    }
}
