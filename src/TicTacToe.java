import javax.imageio.metadata.IIOMetadataFormatImpl;

public class TicTacToe {

    public static final char SYMBOL_X = 'X';
    public static final char SYMBOL_0 = '0';

    public static final int SIZE = 3;

    public char[][] board = new char[SIZE][SIZE];

    public Player player1;
    public Player player2;

    public TicTacToe(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void intBoard() {
        System.out.println("board");
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                board[i][j] = ' ';

            }
        }
    }

    public void showBoard() {
        System.out.println("board");
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                int x = i * SIZE + j + 1;
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }


    public void playGame() {
        // init board
        intBoard();
        showBoard();
    }

}
