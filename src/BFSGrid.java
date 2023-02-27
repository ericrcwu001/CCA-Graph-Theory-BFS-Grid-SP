import java.util.LinkedList;
import java.util.Queue;

public class BFSGrid {

    // *** Global / Class Scope Variables ***

    // R = number of rows, C = number of columns


    // grid = Input character matrix of size R x C

    // sr, sc = 'S' symbol row and column values. In other words, the row and column of the starting cell.


    // The direction vectors for row and column.


    // rq, cq = row queue (rq) and column queue (cq)


    // visited = a 2d array that represents whether the cells have been visited or not.

    // nodesLeftInLayer = number of cells left to explore in the current layer before taking a step. Should initially be 1.

    // nodesInNextLayer = number of cells in the next layer. Should initially be 0.



    // *** Constructor ***
    public BFSGrid(char[][] grid, int startingRow, int startingCol) {

    }

    // ** Solve. This method is the main driver of the program. It uses BFS to explore the grid. ***
    public int solve() {

        // Enqueue the row of the starting cell.

        // Enqueue the column of the starting cell.


        // Record the starting cell as visited


        // Initialize a variable to keep track of whether we have found the exit.


        // Initialize a variable to keep track of the number of moves taken.


        // While the row queue (or column queue) is not empty ...


            // Dequeue the row of the current cell.

            // Dequeue the column of the current cell.


            // Check if the end cell has been reached ... ('E')
            // If the end cell has been reached, we can update our exitFound variable to be true and we can break the while loop.


            // Enqueue all neighbour cells (call the exploreNeighbours method).


            // Decrement the number of nodes left in layer because we have processed a cell from that layer.


            // If nodes left in layer is equal to 0 ...
            // This means that we have looked at all the neighbour cells.
            // This means that we have exhausted our search of the current layer.
            // This means that we will make a move (step towards the next round of plausible cells to visit).

                // Update nodes left in layer to be equal to nodes in next layer.

                // Set nodes in next layer to be equal to 0

                // Increment the number of moves taken.



        // End of while loop

        // If the exit is found return the number of moves taken else return -1

    }

    // *** Explore Neighbours ***
    // This method uses the row and column vectors to access the neighbour cells.
    // Adds the row and column of the neighbour cells to the respective queues and marks the cells as visited if the neighbour cells are valid.
    private void exploreNeighbours(int r, int c) {

        // Iterate over the row and column vectors. Row vector = [-1,1,0,0] Column vector = [0,0,1,-1].

            // Get the row of the neighbour cell.

            // Get the column of the neighbour cell.

            // Skip out of bounds locations.

            // Skip visited locations or blocked cells.

            // Add the neighbour row and column values to the respective queues.

            // Record the neighbour cell as visited.

            // Update the nodes in next layer (increment this value as we have added a node to the 'layer').


    }

}
