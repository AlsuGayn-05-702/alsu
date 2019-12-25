package com.company;

public class Matrix {
    private static double[] arr;
    int rows = 0;
    int cols = 0;
    double[][] m;

    public Matrix(double[][] m) {
        this.m = m.clone();
        rows = this.m.length;
        cols = this.m[0].length;
    }

    public static double det(double[][] matrix) {
        if (matrix.length == 1) {
            return matrix[0][0];
        }
        double result = 0; //áóäåì äîáàâëÿòü ýäåìåíòû
        for (int i = 0; i < matrix.length; i++) {
            double[][] minor = createMinor(matrix, 0, i);
            int sign = 1; //çíàê ìèíîðà
            if (i % 2 == 0) {
                sign = 1;
            } else {
                sign = -1;
            }
            result += sign * matrix[0][i] * det(minor);

        }

        return result;
    }

    public static double[][] createMinor(double[][] m, int row, int column) {
        double[][] minor = new double[m.length - 1][m[0].length - 1];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                if (i == row || j == column) {
                    continue;
                }
                int rowIndex = 0;
                int colIndex = 0;//êóäà áóäåì êëàñòü ìèíîð
                if (i > row) {
                    rowIndex = i - 1;
                } else {
                    rowIndex = i;
                }
                if (j > column) {
                    colIndex = j - 1;
                } else {
                    colIndex = j;
                }
                minor[rowIndex][colIndex] = m[i][j];

            }

        }
        return minor;

    }

    public static void printArray(double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }

    public static double[][] multyMatrix(double[][] matrix1, double[][] matrix2) {
        double[][] matrix = new double[matrix1.length][matrix2[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix2[0].length; j++) {
                for (int k = 0; k < matrix2.length; k++) {
                    matrix[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return matrix;
    }

    public static Matrix multyMatrixonNumber(double[][] matrix1, double k) {
        double[][] matrix = new double[matrix1.length][matrix1[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] += matrix1[i][j] * k;
            }
        }
        return new Matrix(matrix);
    }


    public static double[] kramerMatrix(double[][] matrix, double[] b) {
        double k = det(matrix);
        double[] x = new double[matrix[0].length];
        double[][] matrix2 = matrix;
        double[][] n = new double[b.length][matrix[0].length];
        for (int i = 0; i < b.length; i++) {

            for (int j = 0; j < b.length; j++) {
                n[j][i] = matrix[j][i];
                matrix2[j][i] = b[j];
            }
            x[i] = det(matrix2) / k;
            for (int f = 0; f < b.length; f++) {
                matrix2[f][i] = n[f][i];
            }
        }
        return x;
    }

    public static double[][] TMatrix(double[][] matrix) {
        double[][] Tmatrix = new double[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                Tmatrix[i][j] = matrix[j][i];
            }
        }
        return Tmatrix;
    }

    public static double[][] UnioneMatrix(double[][] matrix) {
        double[][] m = new double[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                double sign = Math.pow(-1, i + j);
                m[i][j] = sign * det(createMinor(matrix, i, j));
            }
        }
        return m;
    }


    public static Matrix retromarciaMatrix(double[][] matrix) {
        return multyMatrixonNumber(UnioneMatrix(TMatrix(matrix)), 1 / det(matrix));
    }

    @Override
    public String toString() {
        String res = "";
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                res += m[i][j] + " ";
            }
            res += "\n"; //ïåðåâîä ñòðîêè
        }
        return res;
    }
}
