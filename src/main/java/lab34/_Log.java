/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab34;

import java.math.BigInteger;
import java.util.Date;

/**
 *
 * @author Mypc
 */
public class _Log {
    private int maHL,soLuong;
    private String trangThai;
    private BigInteger gia;
    private Date ngay;

    public _Log() {
    }

    public _Log(int maHL, int soLuong, String trangThai, BigInteger gia, Date ngay) {
        this.maHL = maHL;
        this.soLuong = soLuong;
        this.trangThai = trangThai;
        this.gia = gia;
        this.ngay = ngay;
    }

    public int getMaHL() {
        return maHL;
    }

    public void setMaHL(int maHL) {
        this.maHL = maHL;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getTrangThai() {
        return trangThai;
    }
    
    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public BigInteger getGia() {
        return gia;
    }

    public void setGia(BigInteger gia) {
        this.gia = gia;
    }

    public Date getNgay() {
        return ngay;
    }

    public void setNgay(Date ngay) {
        this.ngay = ngay;
    }

    @Override
    public String toString() {
        return "_Log{" + "maHL=" + maHL + ", soLuong=" + soLuong + ", trangThai=" + trangThai + ", gia=" + gia + ", ngay=" + ngay + '}';
    }
    
    
}
