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
public class dosen extends manusia{
    private String nip;
    private String matakuliah;

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getMatakuliah() {
        return matakuliah;
    }

    public void setMatakuliah(String matakuliah) {
        this.matakuliah = matakuliah;
    }

    public void mengejarApa(){
         System.out.println("Saya " + nama + " umur "+ umur +" tahun sedang mengajar matakuliah " + matakuliah);
    }    

    @Override
    public void siapaKamu() {
        System.out.println("Saya Dosen");
    }
    
}
