package kz.epam.course;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by Temir on 26.01.2017.
 */
//с двумерным массивом и вызовом методов.
public class Neo {
    public int[][] mtr;
    public int[][] mS;
    public String result;

    //колво строк и колво столбцов
    public Neo(int a, int b) {
        mtr = new int[a][b];
    }

    public void fill() {
        for (int i = 0; i < mtr.length; i++) {
            for (int j = 0; j < mtr[0].length; j++) {
                mtr[i][j] = (int) (Math.random() * 10);
                System.out.print(mtr[i][j] +" ");
            }
        }
        System.out.println();
    }

    public Neo mult1(Neo mult2) {
        mS = new int[mtr.length][mtr[0].length];

//        for (int a = 0; a < 4; a++) {
//            for (int b = 0; b < 4; b++) {
//                for (int s = 0; s < 4; s++) {
//                    mS[a][b] += mtr[a][s] * mtr[s][b];
//                }
//            }
//        }
        for (int c = 0; c < mtr.length; c++) {
            for (int a = 0; a < mtr.length/*2 массив*/; a++) {
                for (int b = 0; b < mtr[0].length; b++) {
                    mS[c][a] += mtr[a][b] * mtr[a][c];
                    System.out.println(mS[a][b]+ " ");
                }
            }
        }
    }

    public class Print {

    }
}

class NeoTest {
    public static void main(String[] args) {
        Neo m1 = new Neo(2, 2);
        m1.fill();
        Neo m2 = new Neo(2, 2);
        m2.fill();
        m1.Mult1(m2);


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