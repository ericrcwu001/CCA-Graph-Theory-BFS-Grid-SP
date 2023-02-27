public class BFSGridRunner {

    public static void main(String[] args) {

        char[][] grid_one = {
                {'S', '.', '.', '#', '.', '.', '.'},
                {'.', '#', '.', '.', '.', '#', '.'},
                {'.', '#', '.', '.', '.', '.', '.'},
                {'.', '.', '#', '#', '.', '.', '.'},
                {'#', '.', '#', 'E', '.', '#', '.'}
        };

        BFSGrid bfsGridOne = new BFSGrid(grid_one, 0, 0);
        System.out.println(bfsGridOne.solve());

    }
}
