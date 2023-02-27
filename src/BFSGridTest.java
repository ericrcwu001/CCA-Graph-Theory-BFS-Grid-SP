import static org.junit.jupiter.api.Assertions.*;

class BFSGridTest {

    private char[][] grid_one;
    private char[][] grid_two;
    private char[][] grid_three;
    private char[][] grid_four;

    private BFSGrid bfs_grid_one;
    private BFSGrid bfs_grid_two;
    private BFSGrid bfs_grid_three;
    private BFSGrid bfs_grid_four;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        grid_one = new char[][]{
                {'S', '.', '.', '#', '.', '.', '.'},
                {'.', '#', '.', '.', '.', '#', '.'},
                {'.', '#', '.', '.', '.', '.', '.'},
                {'.', '.', '#', '#', '.', '.', '.'},
                {'#', '.', '#', 'E', '.', '#', '.'}
        };

        grid_two = new char[][]{
                {'S', '.', '.', '#', '.', '.', '.'},
                {'.', '#', '.', '.', '.', '#', '.'},
                {'.', '#', '.', '.', '.', '.', '.'},
                {'.', '.', '#', '#', '.', '.', '.'},
                {'#', '#', 'E', '.', '.', '#', '.'}
        };

        grid_three = new char[][]{
                {'S', '.', '.', '#', '.', '.', '.'},
                {'.', '#', '.', '.', '.', '#', '.'},
                {'.', '#', '.', '.', '.', '.', '.'},
                {'.', '.', '#', '#', '.', '.', '.'},
                {'#', '#', '.', '.', '.', '#', 'E'}
        };

        grid_four = new char[][]{
                {'S', '.', '.', '#', '.', '.', '.'},
                {'.', '#', '.', '.', '.', '#', '.'},
                {'.', '#', '.', '.', '.', '#', '.'},
                {'.', '.', '#', '#', '.', '#', '.'},
                {'#', '.', '.', '.', '.', '#', '.'},
                {'#', '#', '.', '.', '.', '#', '.'},
                {'#', '#', '.', '.', '.', '#', 'E'}
        };

        bfs_grid_one = new BFSGrid(grid_one, 0, 0);
        bfs_grid_two = new BFSGrid(grid_two, 0, 0);
        bfs_grid_three = new BFSGrid(grid_three, 0, 0);
        bfs_grid_four = new BFSGrid(grid_four, 0, 0);

    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
        grid_one = null;
        grid_two = null;
        grid_three = null;
        grid_four = null;

        bfs_grid_one = null;
        bfs_grid_two = null;
        bfs_grid_three = null;
        bfs_grid_four = null;
    }

    @org.junit.jupiter.api.Test
    void solve() {
        assertEquals(9, bfs_grid_one.solve(), "Bruh ...");
        assertEquals(10, bfs_grid_two.solve(), "Bruh ...");
        assertEquals(10, bfs_grid_three.solve(), "Bruh ...");
        assertEquals(14, bfs_grid_four.solve(), "Bruh ...");
    }

}