import java.util.InputMismatchException;
import java.util.Scanner;

public class TicTacToe {

    /* Main Runner Method: Do not edit. */
    public static void main(String[]args){

        // scanner for getting input
        Scanner in = new Scanner(System.in);

        // create vars to store player input
        int row;
        int col;

        // create a new instance of a TicTacToe game
        TicTacToe game = new TicTacToe();

        // create a new blank game grid
        char[][] grid = game.initializeGrid();

        // set the game state to 'c' for 'continue'
        char gameState = 'c';

        // declare a boolean to keep track of who's turn it is
        boolean playerToggle = true;

        // main game loop
        while(true){
            // print out the current game board
            game.printGrid(grid);

            // check to see if the game is over (won or drawn)
            //gameState = game.checkGameState(grid);
            if(gameState == 'w'){
                if(playerToggle){
                    System.out.println("Game over! X won!");
                }else{
                    System.out.println("Game over! O won!");
                }
                break;
            }else if(gameState == 'd'){
                System.out.println("Game over! It's a draw!");
                break;
            }
            // get the current player's desired move location (row and col)
            row = game.getRow(in);
            col = game.getCol(in);

            // flip to other player's turn
            playerToggle = !playerToggle;

            // try to place a token
            char[][] newGrid;
            if(playerToggle){
                newGrid = game.placeToken(grid, 'X', row, col);
            }else{
                newGrid = game.placeToken(grid, 'O', row, col);
            }
           //compare this new grid to the old grid to see if the move was legal
            //if(game.sameValues(grid, newGrid)){
                System.out.println("Illegal move! Try again.");
                playerToggle = !playerToggle;
            //}else{
                // if it was legal, set the current board to the new one
                for(int i=0 ; i<grid.length ; i++){
                    for(int j=0 ; j<grid.length ; j++){
                       grid[i][j] = newGrid[i][j];
                    }
                }
            }
        }
        //in.close();
    //
    /************************************/

    public int getRow(Scanner in){
        /* Your Code Here */
        int err = -1;

        int row;
        try{
            row = in.nextInt();
        }catch(InputMismatchException ex)
        {
            System.out.println(ex.toString());
            in =  new Scanner(System.in);
            row = -1;
        }
        return row;
    }

    public int getCol(Scanner in){
        /* Your Code Here */
        int err = -1;

        int col;
        try{
            col = in.nextInt();
        }catch(InputMismatchException ex)
        {
            System.out.println(ex.toString());
            in =  new Scanner(System.in);
            col = -1;
        }
        return col;
    }

    //public char checkGameState(char[][] gameGrid){
        /* Your Code Here */
        //return
   // }

    public char[][] initializeGrid(){
        /* Your Code Here */
        char[][] board = new char[5][5];
        for(int x = 0; x <  board.length;x++){
            for(int y = 0; y <  board.length;y++){
                if(x%2 == 0) {
                    if (y % 2 == 0) {
                        board[x][y] = ' ';
                    } else {
                        board[x][y] = '|';
                    }
                }else{
                    board[x][y] = '_';
                }
            }

        }
        return  board;
    }

    //public boolean sameValues(char[][] gridA, char[][] gridB){
        /* Your Code Here */
        //return
    //

    public char[][] placeToken(char[][] gameGrid, char token, int row, int col){
        /* Your Code Here */
        if(gameGrid[row][col] == ' ') {
            gameGrid[row][col] = token;
        }
        return  gameGrid;
    }

    public void printGrid(char[][] gameGrid){
        /* Your Code Here */
        for(int x = 0; x <  gameGrid.length;x++){
            for(int y = 0; y <  gameGrid.length;y++){
                System.out.print(gameGrid[x][y]);
            }
            System.out.println();
        }
    }
}


