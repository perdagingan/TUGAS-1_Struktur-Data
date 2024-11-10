import java.util.LinkedList;
public class AllCode {
    public static void main(String[] args) {
//  Nomor 1
        int nilai;
        nilai = 92;
        System.out.println("Jawaban nomor 1:");
        System.out.println("variabel nilai adalah = " + nilai + "\n");

//  Nomor 2
        String kata;
        kata = "struktur data";
        System.out.println("Jawaban nomor 2:");
        System.out.println("kata = " + kata + "\n");

//  Nomor 3
        int[] arraySatu = {12, 10, 40};
        int nilaiPertama = arraySatu[0];
        int nilaiKedua = arraySatu[1];
        int nilaiKetiga = arraySatu[2];
        System.out.println("Jawaban nomor 3:");
        System.out.println(nilaiPertama);
        System.out.println(nilaiKedua);
        System.out.println(nilaiKetiga);

        for(int i = 0; i < arraySatu.length; i++){
            System.out.print(arraySatu[i] + "\t");
        }
        System.out.println("\n");
//  Nomor 4
        int[][] arrayDua = {
                {12, 10, 40},
                {13, 11, 41},
                {14, 12, 42}
        };
        System.out.println("Jawaban nomor 4:");
        for(int i = 0; i < arrayDua.length; i++){
            for (int j = 0; j < arrayDua[i].length; j++){
                System.out.print(arrayDua[i][j] + "\t");
            }
            System.out.println("\n");
        }
//  Nomor 5
        LinkedList<Integer> daftarNilai = new LinkedList<>();
//        (10, 20, 30, 40, 50)
        daftarNilai.add(10);
        daftarNilai.add(20);
        daftarNilai.add(30);
        daftarNilai.add(40);
        daftarNilai.add(50);
        System.out.println("Jawaban nomor 5:");
        System.out.println(daftarNilai);
    }
}
