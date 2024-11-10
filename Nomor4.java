public class Nomor4 {
    public static void main(String[] args) {
        int[][] arrayDua = {
                {12, 10, 40},
                {13, 11, 41},
                {14, 12, 42}
        };

        for (int i = 0; i < arrayDua.length; i++){
            for (int j = 0; j < arrayDua[i].length; j++){
                System.out.print(arrayDua[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
