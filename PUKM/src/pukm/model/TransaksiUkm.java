/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pukm.model;

/**
 *
 * @author AdittyaS
 */
public class TransaksiUkm {
    private int id_transaksi;
    private int id_ukm;
    private String nama_ukm;
    private String tanggal;
    private String detail;
    private int saldo_ukm;
    
    public TransaksiUkm(int id_transaksi, int id_ukm, String nama_ukm,String tanggal,String detail,int saldo_ukm){
        this.id_transaksi = id_transaksi;
        this.id_ukm = id_ukm;
        this.nama_ukm = nama_ukm;
        this.tanggal = tanggal;
        this.detail = detail;
        this.saldo_ukm = saldo_ukm;
    }

    public int getId_transaksi() {
        return id_transaksi;
    }

    public void setId_transaksi(int id_transaksi) {
        this.id_transaksi = id_transaksi;
    }

    public int getId_ukm() {
        return id_ukm;
    }

    public void setId_ukm(int id_ukm) {
        this.id_ukm = id_ukm;
    }

    public String getNama_ukm() {
        return nama_ukm;
    }

    public void setNama_ukm(String nama_ukm) {
        this.nama_ukm = nama_ukm;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public int getSaldo_ukm() {
        return saldo_ukm;
    }

    public void setSaldo_ukm(int saldo_ukm) {
        this.saldo_ukm = saldo_ukm;
    }
    
    
}
