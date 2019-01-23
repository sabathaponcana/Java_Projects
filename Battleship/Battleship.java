/* This class must instantiate a Grid object and use its methods to let the player pick a game grid,
update the game grid according to player input, print a feedback grid for the player, and check if
the player has sunk all the ships. See the Sample I/O in the assignment brief for details on what you
you should print to the console */

import java.util.Scanner;

public class Battleship {
    public static void main(String[] args) {
       /** Grid grid = new Grid(2);
        Grid grid1 = new Grid(3);
        grid.checkGrid();**/

        Scanner in = new Scanner(System.in);
        int count = 12;
        System.out.println("Pick your grid (1-4):");
        int seed = in.nextInt();

        Grid grid = new Grid(seed);
        System.out.println("The battle begins!");
       do {
           System.out.println("You have " + count + " shots remaining.");
           System.out.println("choose your square:");
           String square = in.next();

           int row = Integer.parseInt(square.split("")[0]);
           int col = Integer.parseInt(square.split("")[0]);
           System.out.println(grid.fire(row,col));
           grid.printGrid();
           count--;


       }while (grid.checkGrid() && count > 0);

       if (count == 0)
       {
           System.out.println("You’re out of ammunition! Game Over");
           //System.exit();
       }






    }
}