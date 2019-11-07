/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if01.pkg10118029.latihan52.siapakamu;

/**
 *
 * @author acer
 * Nama  : Azis komara
 * Nim   : 10118029
 * Kelas : IF-1 
 * Deskripsi program : Program ini menampilkan Siapa Kamu
 */
public class IF0110118029Latihan52Siapakamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         dosen dosen = new dosen();
          
          dosen.setNip("41227829930");
          dosen.setMatakuliah("PBO");
          dosen.setUmur(29);
          dosen.setNama("Rizki Adam Kurniawan");
          System.out.println("NIP DOSEN : " + dosen.getNip());
          dosen.siapaKamu();
          dosen.mengejarApa();
          System.out.println();
          
          mahasiswa mahasiswa = new mahasiswa();
          mahasiswa.setNim("10118029");
          mahasiswa.setKelas("PBO");
          mahasiswa.setNama("Azis Komara");
          mahasiswa.setUmur(19);
          System.out.println("NIM MAHASISWA : " + mahasiswa.getNim());
          mahasiswa.siapaKamu();
          mahasiswa.kelasApa();
    }
    
}
