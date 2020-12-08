
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class RaporGithub {
     public static String bil(String a){
        return a;
    }
    public static void main(String[] args){
        Scanner yo = new Scanner (System.in);
        String nama,kelas,absen;
        System.out.println("Nama");
        nama = (yo.nextLine());
        System.out.println("Kelas");
        kelas = (yo.nextLine());
        System.out.println("No.Absen");
        absen = (yo.nextLine());
        
    System.out.println("========================================================");
        
        String a = "Kriteria Rapor";
        System.out.println(a);
        String [] kriteria = {"","Tugas Harian","Ulangan harian","PTS","PAS"};
        
        for(int i= 1; i< kriteria.length; i++){
            System.out.println(i+"="+kriteria[i]);}
        
    System.out.println("=======================================================");
        
        System.out.println("Nilai Tugas Harian:");
        int b = (yo.nextInt());
        System.out.println("Nilai Ulangan Harian");
        int c = (yo.nextInt());
        System.out.println("Nilai PTS");
        int d = (yo.nextInt());
        System.out.println("Nilai PAS");
        int e = (yo.nextInt());
        
        int all = b + c + d + e;
        int hsl = all/4;
        System.out.println("Nilai keseluruhan:"+hsl);
        
        if(hsl >= 85){
            System.out.println("Kategori : A");
        } else if(hsl >= 75){
            System.out.println("Kategori : B");
        } else if(hsl >= 55){
            System.out.println("Kategori : C");
        } else if(hsl >= 45){
            System.out.println("Kategori : D");
        } else {
            System.out.println("Kategori : F");
            
    System.out.println("=======================================================");
    
            System.out.println("Apakah siswa ini harus perbaikan?");
            char ket = 'Y';
            switch (ket){
            case'Y':
                System.out.println("Ya, Siswa harus perbaikan");
            case'A':
                System.out.println("atau");
            case'T':
                System.out.println("Tidak, Siswa tidak perlu perbaikan");
            }
        
        }
       
    }

}
