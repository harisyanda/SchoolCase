/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Harisyanda
 */
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args){
        
        String nama,matpel,namaguru;
        long nilaiujian;
        String ala;
        
        System.out.println("============================================================");
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Nama Murid : ");
        nama = keyboard.nextLine();
        
        Scanner keyboards = new Scanner(System.in);
        System.out.print("Alamat Rumah Anda : ");        
        ala = keyboards.nextLine();
        
        Scanner keyboarr = new Scanner(System.in);
        System.out.print("Nama Wali Kelas : ");
        namaguru = keyboarr.nextLine();
        
        Scanner keyboarda = new Scanner(System.in);
        System.out.print("Jurusan anda sekarang (IPA atau IPS) :");
        matpel = keyboarda.nextLine();
        
        Scanner baru = new Scanner(System.in);
        System.out.print("Hasil Ujian Anda adalah : ");
        nilaiujian = baru.nextInt();
        
        TeacherClass p = new TeacherClass(namaguru);
        ScientificStudent af;
        af = new ScientificStudent(nama, (int) nilaiujian);
        SocialStudent as;
        as = new SocialStudent(nama, (int) nilaiujian);
           
            
        CourseClass mm = new CourseClass ("Matematika, Fisika, Biologi dan Kimia");
        CourseClass mn = new CourseClass ("Matematika, Sejarah, Geografi dan Akuntasi");
        mm.setMataKuliah("Matematika, fisika dan Akuntasi");
        mn.setMataKuliah("Matematika, Sejarah, Geografi dan Akuntasi");
        if (matpel=="IPA")
        {
            try{
                System.out.println(af.charAt(100));
            }
            catch (Exception e){
                System.out.println();
                System.out.println("==================================================");
                System.out.println("Nama Murid : "+af.NamaMurid);
                System.out.println("Nilai Hasil : "+af.NilaiMurid);
                System.out.println("Alamat Rumah : "+ala);
                System.out.println("Nama Wali Kelas : "+p.NamaGuru);
                System.out.println("Mata Pelajaran yang di ujian kan" + mm.getMataKuliah());
                mm.setMataKuliah("Matematika, Fisika, Kimia dan Biologi");
                System.out.println("Mata Pelajaran yang dipelajari" + mm.getMataKuliah());
                if (nilaiujian <60){
                    System.out.println("Maaf Anda tidak Lolos Apapun");
                }
                else{
                    af.exam();
                    af.exercises();
                    af.interview();
                    af.presentation();
                System.out.println("==================================================");
                }
            }
        } else 
        {
        try{
            System.out.println(as.charAt(100));
        }
        catch (Exception e){
            System.out.println("==================================================");           
            System.out.println();
            System.out.println("Nama Murid : "+as.NamaMurid);
            System.out.println("Nilai Hasil : "+as.NilaiMurid);
            System.out.println("Alamat Rumah : "+ala);
            System.out.println("Nama Wali Kelas : "+p.NamaGuru);
            System.out.println("Mata Pelajaran yang dipelajari" + mn.getMataKuliah());
            if (nilaiujian <60){
                System.out.println("Maaf Anda tidak Lolos Apapun");
            }
            else{
            as.exam();
            as.exercises();
            as.interview();
            as.presentation();
            System.out.println("==================================================");            
            }
        }
        }
        
        
    }
    
}
