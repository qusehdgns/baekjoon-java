/**
 * "OOXXOXXOOO"와 같은 OX퀴즈의 결과가 있다. O는 문제를 맞은 것이고, X는 문제를 틀린 것이다. 문제를 맞은 경우 그 문제의 점수는 그 문제까지 연속된 O의 개수가 된다. 예를 들어, 10번 문제의 점수는 3이 된다.
 *
 * "OOXXOXXOOO"의 점수는 1+2+0+0+1+0+0+1+2+3 = 10점이다.
 *
 * OX퀴즈의 결과가 주어졌을 때, 점수를 구하는 프로그램을 작성하시오.
 */
package oneDimensionalArray_5;

import java.util.Arrays;
import java.util.Scanner;

public class No_8958 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int length = sc.nextInt();
        String[] arr = new String[length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.next();
        }

        Arrays.stream(arr).forEach(str -> {
            int point = 0;
            String[] arrStr = str.split("");
            int[] arrScore = new int[arrStr.length];

            for (int i = 0; i < arrStr.length; i++) {
                if(arrStr[i].equalsIgnoreCase("O"))
                    point++;
                else
                    point = 0;

                arrScore[i] = point;
            }

            System.out.println(Arrays.stream(arrScore).reduce((x, y) -> x + y).getAsInt());
        });
    }
}
