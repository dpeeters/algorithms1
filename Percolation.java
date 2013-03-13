public class Percolation {
    private int n;
    private boolean[][] open;
    private WeightedQuickUnionUF uf;
    private WeightedQuickUnionUF nw;
  
    // create N-by-N grid, with all sites blocked
    
    public Percolation(int N) {
        n = N;
        open = new boolean[N][N];
        uf = new WeightedQuickUnionUF(N * N + 2);
        nw = new WeightedQuickUnionUF(N * N + 2);
    }

   public void open(int i, int j)         // open site (row i, column j) if it is not already
   public boolean isOpen(int i, int j)    // is site (row i, column j) open?
   public boolean isFull(int i, int j)    // is site (row i, column j) full?
   public boolean percolates()            // does the system percolate?
}