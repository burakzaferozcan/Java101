package Konular;

public class CokBoyutluDiziler {
    public static void main(String[] args) {
        int[][] matris1 = new int[6][6];
        matris1[0][0] = 0;
        matris1[0][1] = 453;
        matris1[0][2] = 939;
        matris1[0][3] = 243;
        matris1[0][4] = 783;
        matris1[0][5] = 891;
        matris1[1][0] = 453;
        matris1[1][1] = 0;
        matris1[1][2] = 490;
        matris1[1][3] = 384;
        matris1[1][4] = 620;
        matris1[1][5] = 439;
        matris1[2][0] = 939;
        matris1[2][2] = 490;
        matris1[2][3] = 0;
        matris1[2][4] = 839;
        matris1[2][5] = 263;
        matris1[3][0] = 243;
        matris1[3][1] = 384;
        matris1[3][2] = 839;
        matris1[3][3] = 0;
        matris1[3][4] = 544;
        matris1[3][5] = 823;
        matris1[4][0] = 783;
        matris1[4][1] = 820;
        matris1[4][2] = 863;
        matris1[4][3] = 544;
        matris1[4][4] = 0;
        matris1[4][5] = 1045;
        matris1[5][0] = 891;
        matris1[5][1] = 439;
        matris1[5][2] = 423;
        matris1[5][3] = 823;
        matris1[5][4] = 145;
        matris1[5][5] = 0;

        int[][] matris2 = {
                {0, 453, 939, 243, 783, 891},
                {453, 0, 490, 384, 620, 439},
                {939, 490, 0, 839, 863, 423},
                {243, 384, 839, 0, 544, 823},
                {783, 620, 863, 544, 0, 1045},
                {891, 439, 423, 823, 1045, 0}
        };

        int[][] matris3 = new int[3][4];
        System.out.println("sütun : " + matris3.length);
        System.out.println("satır : " + matris3[0].length);
        int count = 1;
        for (int i = 0; i < matris3.length; i++) {
            System.out.println();
            for (int j = 0; j < matris3[0].length; j++) {
                matris3[i][j] = count++;
                System.out.print(matris3[i][j] + " ");
            }
        }

    }
}
