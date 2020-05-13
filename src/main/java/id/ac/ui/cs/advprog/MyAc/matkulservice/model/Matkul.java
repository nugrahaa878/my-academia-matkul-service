package id.ac.ui.cs.advprog.MyAc.matkulservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "matkul")
public class Matkul {
    @Id
    @Column(name = "kode")
    private String kode ;

    @Column(name = "nama")
    private String nama;

    @Column(name = "semester")
    private int semester;

    @Column(name = "sks")
    private int sks;

    @Column(name = "penjelasan")
    private String penjelasan;

    public Matkul(String kode,String nama, int semester, int sks){
        this.nama = nama;
        this.kode = kode;
        this.semester = semester;
        this.sks = sks;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public int getSks() {
        return sks;
    }

    public void setSks(int sks) {
        this.sks = sks;
    }

    public String getPenjelasan() {
        return penjelasan;
    }

    public void setPenjelasan(String penjelasan) {
        this.penjelasan = penjelasan;
    }
}
