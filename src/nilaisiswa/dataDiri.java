package nilaisiswa;

import java.util.Scanner;

public class dataDiri {
   Scanner input = new Scanner (System.in);
   
   String namaLengkap, namaPanggilan, kelas, absen;
   
   void pengenalan (){
       System.out.println("=========Kartu Identitas==========");
       System.out.print("Nama Lengkap \t: ");
       namaLengkap = input.nextLine();
       System.out.print("Nama Panggilan \t: ");
       namaPanggilan = input.nextLine();
       System.out.print("Kelas \t: ");
       kelas = input.next();
       System.out.print("Absen \t: ");
       absen = input.next();
       
       
   }
}
