package nilaisiswa;
public class NilaiSiswa {
    public static void main(String[] args) {
        dataDiri siswa = new dataDiri();
        nilaiMapel siswa2 = new nilaiMapel();
        siswa.pengenalan();
        
        System.out.println("Masukkan nilai");
        System.out.println("1. RPL ");
        siswa2.RPL();
        System.out.println("2. KJD ");
        siswa2.KJD();
        System.out.println("3. DDG ");
        siswa2.DDG();
        System.out.println("4. MTK ");
        siswa2.MTK();
        System.out.println("5. Kimia ");
        siswa2.Kimia();

        int proses = siswa2.nilaiRPL + siswa2.nilaiKJD + siswa2.nilaiDDG + siswa2.nilaiMTK + siswa2.nilaiKimia;
        int kelulusan = proses/5;
        
        System.out.println();
        
    if (kelulusan >=80){
        System.out.println("Siswa / siswi atas nama "+siswa.namaLengkap+" dinyatakan LULUS");
        System.out.println("dengan rata-rata nilai"+kelulusan);
    }else if (kelulusan<80){
        System.out.println("Siswa / siswi atas nama "+siswa.namaLengkap+" dinyatakan TIDAK LULUS");
        System.out.println("dengan rata-rata nilai "+kelulusan);
    }
}
}
