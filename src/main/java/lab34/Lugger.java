/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab34;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author Mypc
 */
public class Lugger {

    private int maHL;
    private String ten;
    private float trongLuong;
    private int soLuong;
    private BigDecimal giaHienTai;
    private Date ngayTao;

    public Lugger() {
    }

    public Lugger(int maHL, String ten, float trongLuong, int soLuong, BigDecimal giaHienTai, Date ngayTao) {
        this.maHL = maHL;
        this.ten = ten;
        this.trongLuong = trongLuong;
        this.soLuong = soLuong;
        this.giaHienTai = giaHienTai;
        this.ngayTao = ngayTao;
    }

    public int getMaHL() {
        return maHL;
    }

    public void setMaHL(int maHL) {
        this.maHL = maHL;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public float getTrongLuong() {
        return trongLuong;
    }

    public void setTrongLuong(float trongLuong) {
        this.trongLuong = trongLuong;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public BigDecimal getGiaHienTai() {
        return giaHienTai;
    }

    public void setGiaHienTai(BigDecimal giaHienTai) {
        this.giaHienTai = giaHienTai;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    @Override
    public String toString() {
        return "Lugger{" + "maHL=" + maHL + ", ten=" + ten + ", trongLuong=" + trongLuong + ", soLuong=" + soLuong + ", giaHienTai=" + giaHienTai + ", ngayTao=" + ngayTao + '}';
    }
    
}
