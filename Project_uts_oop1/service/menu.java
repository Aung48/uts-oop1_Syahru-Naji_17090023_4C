package service;

import java.util.*;
import entity.*;


public class menu {

    private static List<mobil> data = new LinkedList<mobil>();

    public void tambahData(mobil inven) {
        data.add(inven);
        System.out.println("Data sudah tersimpan");
    }

    public void ubahData(mobil inven) {
        int i = data.indexOf(inven);
        if(i >= 0) data.set(i, inven);
        System.out.println("Data sudah berubah");
    }

    public void hapusData(String id) {
        int i = data.indexOf(new mobil(id, "", "", "", "", ""));
        if(i >= 0) data.remove(i);
        System.out.println("Data telah terhapus");
    }

    public void tampilkanData() {
        System.out.println("\n--= Isi Data =--");
        int urutan = 1;
        for(mobil inven : data) {
            System.out.println("data ke-" + urutan++);
            System.out.println("  ID : " + inven.getid());
            System.out.println("  NO. PLAT : " + inven.getnoplat());
            System.out.println("  MERK : " + inven.getmerk());
            System.out.println("  TYPE : " + inven.gettype());
            System.out.println("  WARNA : " + inven.getwarna());
            System.out.println("  Tahun Pembuatan : " + inven.gettahun_buat());
        }
    }

}