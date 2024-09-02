package course;

public class PathsInMatrix {

    static int countPaths(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] paths = new int[n][m];
        paths[0][0] = matrix[0][0] == 1 ? 0 : 1;
        for (int i = 1; i < m; i++)
            if (matrix[0][i] == 1) paths[0][i] = 0;
            else paths[0][i] = paths[0][i - 1];
        for (int i = 1; i < n; i++)
            if (matrix[i][0] == 1) paths[i][0] = 0;
            else paths[i][0] = paths[i - 1][0];
        for (int i = 1; i < n; i++)
            for (int j = 1; j < m; j++)
                if(matrix[i][j] == 1) paths[i][j] = 0;
                else paths[i][j] = paths[i-1][j] + paths[i][j-1];
        return paths[n - 1][m - 1];
    }

}
