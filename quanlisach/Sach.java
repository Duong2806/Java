/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package quanlisach;

/**
 *
 * @author Pain
 */
import java.text.SimpleDateFormat;
import java.util.Scanner;
 
public class Sach {
    private String maSach, nhaXuatBan;
    private double donGia;
    private int soLuong;
    Scanner scanner = new Scanner(System.in);
     
    public Sach() {
        super();
    }
 
    public Sach(String maSach, String nhaXuatBan, double donGia, int soLuong) {
        super();
        this.maSach = maSach;
        this.nhaXuatBan = nhaXuatBan;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }
    public String getMaSach() {
       return maSach;
    }
    public void setMaSach(String maSach) {
       this.maSach = maSach;
    }
    public String getNhaXuatBan() {
       return nhaXuatBan;
    }
    public void setNhaXuatBan(String nhaXuatBan) {
       this.nhaXuatBan = nhaXuatBan;
    }
    public double getDonGia() {
       return donGia;
    }
    public void setDonGia(double donGia) {
       this.donGia = donGia;
    }
    public int getSoLuong() {
       return soLuong;
    }
    public void setSoLuong(int soLuong) {
       this.soLuong = soLuong;
    }
    public void nhapSach() {
    System.out.print(" mã sách: ");
        maSach = scanner.nextLine();
    System.out.print(" tên nhà xuất bản: ");
        nhaXuatBan = scanner.nextLine();
    System.out.print(" đơn giá: ");
        donGia = scanner.nextDouble();
    System.out.print(" số lượng: ");
        soLuong = scanner.nextInt();
    } 
    @Override
    public String toString() {
     return "Mã sách: " + this.maSach + ", nhà xuất bản: " + this.nhaXuatBan + ", đơn giá: " + 
       this.donGia + ", số lượng: " + this.soLuong;
    }
}
