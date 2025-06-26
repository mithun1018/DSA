class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int originalRows = mat.length;
        int originalCols = mat[0].length;

        if (originalRows * originalCols != r * c) return mat;

        int[][] result = new int[r][c];
        for (int i = 0; i < originalRows * originalCols; i++) {
            result[i / c][i % c] = mat[i / originalCols][i % originalCols];
        }

        return result;
    }
}
