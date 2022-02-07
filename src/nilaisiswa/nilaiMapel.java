package nilaisiswa;

import java.util.Scanner;

public class nilaiMapel {
  Scanner input = new Scanner (System.in);
  int nilai1, nilai2, nilai3, proses, nilaiRPL, nilaiKJD, nilaiDDG, nilaiMTK, nilaiKimia;
  
  String mapel; 
  
  void RPL (){
      System.out.print("Nilai Ulangan 1 : ");
      nilai1 = input.nextInt();
      System.out.print("Nilai Ulangan 2 : ");
      nilai2 = input.nextInt();
      System.out.print("Nilai Ulangan 3 : ");
      nilai3 = input.nextInt();
      proses = nilai1 + nilai2 + nilai3;
      nilaiRPL = proses /3;
      System.out.println("Rata-rata nilai ulangan = "+nilaiRPL);
  }
  void DDG (){
      System.out.print("Nilai Ulangan 1 : ");
      nilai1 = input.nextInt();
      System.out.print("Nilai Ulangan 2 : ");
      nilai2 = input.nextInt();
      System.out.print("Nilai Ulangan 3 : ");
      nilai3 = input.nextInt();
      proses = nilai1 + nilai2 + nilai3;
      nilaiDDG = proses /3;
      System.out.println("Rata-rata nilai ulangan = "+nilaiDDG);
  }
  void KJD (){
      System.out.print("Nilai Ulangan 1 : ");
      nilai1 = input.nextInt();
      System.out.print("Nilai Ulangan 2 : ");
      nilai2 = input.nextInt();
      System.out.print("Nilai Ulangan 3 : ");
      nilai3 = input.nextInt();
      proses = nilai1 + nilai2 + nilai3;
      nilaiKJD = proses /3;
      System.out.println("Rata-rata nilai ulangan = "+nilaiKJD);
      
  }
   void MTK (){
      System.out.print("Nilai Ulangan 1 : ");
      nilai1 = input.nextInt();
      System.out.print("Nilai Ulangan 2 : ");
      nilai2 = input.nextInt();
      System.out.print("Nilai Ulangan 3 : ");
      nilai3 = input.nextInt();
      proses = nilai1 + nilai2 + nilai3;
      nilaiMTK = proses /3;
      System.out.println("Rata-rata nilai ulangan = "+nilaiMTK);
  }
   void Kimia (){
      System.out.print("Nilai Ulangan 1 : ");
      nilai1 = input.nextInt();
      System.out.print("Nilai Ulangan 2 : ");
      nilai2 = input.nextInt();
      System.out.print("Nilai Ulangan 3 : ");
      nilai3 = input.nextInt();
      proses = nilai1 + nilai2 + nilai3;
      nilaiKimia = proses /3;
      System.out.println("Rata-rata nilai ulangan = "+nilaiKimia);
}
}

