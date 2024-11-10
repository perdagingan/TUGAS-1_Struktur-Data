public class Nomor3 {
    public static void main(String[] args) {
        int[] arraySatu = {12, 10, 40};

        int nilaiPertama = arraySatu[0];
        int nilaiKedua = arraySatu[1];
        int nilaiKetiga = arraySatu[2];

        System.out.println(nilaiPertama);
        System.out.println(nilaiKedua);
        System.out.println(nilaiKetiga);

        for (int i = 0; i < arraySatu.length; i++){
            System.out.print(arraySatu[i] + "\t");
        }
    }
}
