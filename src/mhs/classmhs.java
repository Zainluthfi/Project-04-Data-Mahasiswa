/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mhs;
import java.util.ArrayList;
import java.util.Scanner;



/**
 *
 * @author zainn
 */
public class classmhs {
    ArrayList<String> Nim = new ArrayList<>();
    ArrayList<String> Nama = new ArrayList<>();
    ArrayList<String> Tgl = new ArrayList<>();
    ArrayList<Integer> Gender = new ArrayList<>();

    


    void menu(){
        Scanner input = new Scanner (System.in);
        System.out.println("DATA MAHASISWA");
        System.out.println("Menu:");
        System.out.println("1. Tambah Data");
        System.out.println("2. Hapus Data");
        System.out.println("3. Cari Data");
        System.out.println("4. Tampil Data");
        System.out.println("Pilih no menu:");
        int menu = input.nextInt();
        
        if (menu == 1){
        tambah();
        }
        if (menu == 2){
        hapus();
        }
        if (menu == 3){
        cari();
        }
        if (menu == 4){
        tampil();
        }
        
    }
    void tambah(){
        Scanner inputData = new Scanner(System.in);
        String nim;
        String nama;
        String tanggal;
        Integer gender;
        
        System.out.println("Masukkan Data:");
        System.out.print("NIM: ");
        nim = inputData.nextLine();
        Nim.add(nim);
        System.out.print("Nama: ");
        nama = inputData.nextLine();
        Nama.add(nama);
        System.out.print("Tanggal Lahir (dd/mm/yyyy): ");
        tanggal = inputData.nextLine();
        Tgl.add(tanggal);
        System.out.print("Gender (0:Laki-laki 1:Perempuan): ");
        gender = inputData.nextInt();
        Gender.add(gender);
        menu();    
    }
    
    void hapus(){
        Scanner inputData = new Scanner(System.in);
        if(Nim.size() > 0){
            System.out.print("Masukkan NIM: ");
            String hapusdata = inputData.nextLine();
            inputData.nextLine();
            int index = Nim.indexOf(hapusdata);
            Nim.remove(index);
            Nama.remove(index);
            Tgl.remove(index);
            Gender.remove(index);
                
        }
    }

    void cari(){
        Scanner inputData = new Scanner(System.in);
        System.out.println("Cari Data : ");
        System.out.println("1. NIM");
        System.out.println("2. Gender");
        System.out.print("Pilih no menu: ");
        int inputcari = inputData.nextInt();
        switch(inputcari){
            case 1:
                inputData.nextLine();
                System.out.print("  Masukkan NIM : ");
                String cari1 = inputData.nextLine();
                for(String n: Nim){
                    if(Nim.contains(cari1)){
                        int index = Nim.indexOf(cari1);
                        String jeniskelamin = (Gender.get(index) == 0) ? "Laki-laki" : "Perempuan";
                        System.out.println("Mahasiswa NIM " + Nim.get(index));
                        System.out.println("NIM : " + Nim.get(index));
                        System.out.println("Nama : " + Nama.get(index));
                        System.out.println("Tanggal Lahir : " + Tgl.get(index));
                        System.out.println("Gender : " + jeniskelamin);
                        break;
                    }
                }
                break;
            case 2:
                inputData.nextLine();
                System.out.print("  Masukkan Gender(0:Laki-laki 1:Perempuan):");
                int cari2 = inputData.nextInt();
                for(int n = 0; n < Gender.size(); n++){
                    if(Gender.get(n) == cari2){
                        String jeniskelamin = (Gender.get(n) == 0) ? "Laki-laki" : "Perempuan";
                        System.out.println("Data Berdasarkan Gender");
                        System.out.println("NIM : " + this.Nim.get(n));
                        System.out.println("Nama : " + this.Nama.get(n));
                        System.out.println("Tanggal Lahir : " + this.Tgl.get(n));
                        System.out.println("Gender : " + jeniskelamin);
                    }
                }
                break;
            
        }

    }
    
    void tampil(){
            for(int n = 0; n < Nim.size(); n++){
                String jeniskelamin = (Gender.get(n) == 0) ? "Laki-laki" : "Perempuan";
                System.out.println((n+1)+" Data Mahasiswa");
                System.out.println("NIM : " + Nim.get(n));
                System.out.println("Nama : " + Nama.get(n));
                System.out.println("Tanggal Lahir : " + this.Tgl.get(n));
                System.out.println("Gender : " + jeniskelamin);
            }
            System.out.println("Jumlah Seluruh Mahasiswa : " + Nim.size());
            menu();
    }
    

}
