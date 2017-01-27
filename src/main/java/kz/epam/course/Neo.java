package kz.epam.course;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by Temir on 26.01.2017.
 */
//с двумерным массивом и вызовом методов.
public class Neo {
    private int[][] mtr;
    private int[][] mS;
    private int n;
    private int m;

    //колво строк и колво столбцов
    public Neo(int n, int m) {
        this.n = n;
        this.m = m;
        mtr = new int[n][m];

    }

    public void fill() {
        for (int n = 0; n < mtr.length; n++) {
            for (int m = 0; m < mtr[0].length; m++) {// беру длину всегда с 1 строки
                mtr[n][m] = (int) (Math.random() * 10);
                System.out.print(mtr[n][m] + " ");
            }
        }
        System.out.println();
    }

    public int Mult(Neo m1, Neo m2) {

        Neo mtr = new Neo(m1.n, m2.m)

        mS = new int[mtr.length][mtr.length];
        //mS = new int[2][2];

        for (int n = 0; n < mtr1.mtr.length; n++) {
            for (int m = 0; m < mult2.mtr[0].length; m++) {
                mS[a][b] += (mult1.mtr[a]) * +(mult1.mtr[b]) + ((mult2.mtr[b]) * (mult2.mtr[a]));
                System.out.println(mS[a][b] + " ");
            }
        }
        return mS[4][4];
    }
}

    class NeoTest {
        public static void main(String[] args) {
            Neo m1 = new Neo(2, 2);
            m1.fill();
            Neo m2 = new Neo(2, 2);
            m2.fill();
            //m1.mult(m1,m2);


        }
    }

    // без массива, но с костылями.
    class brr {
        brr(int a, int b, int c, int d, int e, int f, int g, int h) {//передачи данных матрицыб разбитых на строку
            int a11 = a;
            int a12 = b;
            int a21 = c;
            int a22 = d;
            int b11 = e;
            int b12 = f;
            int b21 = g;
            int b22 = h;
            int c11, c12, c21, c22;//result

            c11 = (a11 * b11) + (a12 * b21);
            c12 = (a11 * b12) + (a12 * b22);
            c21 = (a21 * b11) + (a22 * b21);
            c22 = (a21 * b12) + (a22 * b22);
            System.out.println("{" + c11 + " " + c12 + " " + c21 + " " + c22 + "}");
        }
    }

    //тест
    class brrtest {
        public static void main(String[] args) {
            brr test = new brr(21, 12, 2, 8, 51, 16, 70, 8);
        }
    }