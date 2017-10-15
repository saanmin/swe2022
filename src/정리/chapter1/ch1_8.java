package 정리.chapter1;

import java.util.ArrayList;

public class ch1_8 { //파스칼삼각형
    public static void main(String[] arg) {
        int n = 5;

        //파스칼 삼각형 구현식
       int[][] triangle = new int[n][];
        for (int i = 0; i < n; i++) {
            triangle[i] = new int[i + 1];
            triangle[i][0] = 1;
            triangle[i][i] = 1;
            for (int j = 1; j < i; j++) {
                triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
            }
        }

        //파스칼 삼각형 ArrayList에 저장하기
        ArrayList<ArrayList<Integer>> triangleAL = new ArrayList<>();
        for (int r = 0; r < triangle.length; r++) {
            ArrayList<Integer> alist = new ArrayList<>();
            for (int c = 0; c < triangle[r].length; c++) {
                alist.add(triangle[r][c]);
                triangleAL.add(alist);
            }
        }



        //파스칼 삼각형 프린트방법1
        for (int r = 0; r < triangle.length; r++) {
            for (int c = 0; c < triangle[r].length; c++) {
                System.out.printf("%4d", triangle[r][c]);
            }
            System.out.println();
        }

        //파스칼 삼각형 프린트방법2
        for (int[] row : triangle) {
            for (int element : row) {
                System.out.printf("%4d", element);
            }
            System.out.println();

        }

    }
}

