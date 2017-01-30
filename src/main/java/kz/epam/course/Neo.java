package kz.epam.course;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by Temir on 26.01.2017.
 */
//с двумерным массивом и вызовом методов.
public class Neo {
    private int[][] matrix;
    private int n;
    private int m;
    private int l;

    public Neo(int n, int m) {
        this.n = n;
        this.m = m;
        this.matrix = new int[n][m];//уточнение какой матрицы
    }

    public void fill() {
        for (int n = 0; n < matrix.length; n++) {
            for (int m = 0; m < matrix[0].length; m++) {// беру длину всегда с 1 строки
                matrix[n][m] = (int) (Math.random() * 10);
            }
        }
    }

    public Neo Multplay(Neo that) {

        l = this.n;
        m = this.m;
        n = that.m;
        Neo result = new Neo(l, n);

        int[][] a = this.matrix;
        int[][] b = that.matrix;
        int[][] c = result.matrix;

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < n; j++) {
                c[i][j] = 0;
                for (int r = 0; r < m; r++) {
                    c[i][j] = c[i][j] + a[i][r] * b[r][j];
                }
            }
        }
        return result;
    }

    public Neo MultOrig(Neo that) {
        n = this.n;
        m = that.m;
        Neo resultorig = new Neo(n, m);
        int[][] a = this.matrix;
        int[][] b = that.matrix;
        int[][] c = resultorig.matrix;
        for (int n = 0; n < matrix.length; n++) {
            for (int m = 0; m < matrix[0].length; m++) {
                c[n][m] += matrix[n][m] * matrix[n][m];
                System.out.println(matrix[n][m] + " ");
            }
        }
        return resultorig;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder(n * m);
        str.append("Matrix[").append(n).append(",").append(m).append("]={");
        for (int n = 0; n < matrix.length; n++) {
            str.append("\r\n");
            for (int m = 0; m < matrix[0].length; m++) {
                str.append(matrix[n][m]).append(" ");
            }
        }
        str.append("\r\n}");
        return str.toString();
    }
}

class NeoTest {
    public static void main(String[] args) {
        Neo m1 = new Neo(4, 4);
        m1.fill();
        System.out.println("one = " + m1);
        Neo m2 = new Neo(4, 4);
        m2.fill();
        System.out.println("one = " + m2);
        Neo res = m1.Multplay(m2);
        System.out.println(m1.Multplay(m2));
    }
}