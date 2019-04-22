package entity;

public class mobil {

    private String id;
    private String noplat;
    private String merk;
    private String type;
    private String warna;
    private String tahun_buat;

    public boolean equals(Object obj) {
        mobil smr = (mobil) obj;
        return id.equals(smr.getid());
    }

    public mobil(String id, String noplat, String merk, String type, String warna, String tahun_buat) {
        this.id = id;
        this.noplat = noplat;
        this.merk = merk;
        this.warna =warna;
        this.type = type;
        this.tahun_buat = tahun_buat;
    }

    public String getid() {
        return id;
    }

    public void setid(String id) {
        this.id = id;
    }

    public String getnoplat() {
        return noplat;
    }

    public void setNoplat(String noplat) {
        this.noplat = noplat;
    }

    public String getmerk() {
        return merk;
    }

    public void setmerk(String merk) {
        this.merk = merk;
    }

    public String gettype() {
        return type;
    }

    public void settype(String type) {
        this.type = type;
    }

    public String getwarna() {
        return warna;
    }

    public void setwarna(String warna) {
        this.warna = warna;
    }

    public String gettahun_buat() {
        return tahun_buat = tahun_buat;
    }

    public void settahun_buat(String tahun_buat) {
        this.tahun_buat = tahun_buat;
    }
}