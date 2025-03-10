/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai4lab3;
import java.util.Scanner;
/**
 *
 * @author khoav
 */
public class Nhanvien {
    private int maso;
    private String ten;
    private double luong;
    private double hesoluong;
    private double soluongnv;

    public Nhanvien(int maso, String ten, double luong, double hesoluong) {
        this.maso = maso;
        this.ten = ten;
        this.luong = luong;
        this.hesoluong = hesoluong;
        
    }
    public Nhanvien(){
        this.maso =0;
        this.ten ="";
        this.luong =0.0;
        this.hesoluong =0.0;
        this.soluongnv =0;
    }
    public Nhanvien(Nhanvien nv){
        this.maso=nv.maso;
        this.ten=nv.ten;
        this.luong=nv.luong;
        this.hesoluong=nv.hesoluong;
        this.soluongnv=nv.soluongnv;
    }

    public int getmaso() {
        return maso;
    }

    public void setmaso(int maso) {
        this.maso = maso;
    }

    public String getten() {
        return ten;
    }

    public void setten(String ten) {
        this.ten = ten;
    }

    public double gethesoluong() {
        return hesoluong;
    }

    public void sethesoluong(double hesoluong) {
        this.hesoluong = hesoluong;
    }
    public void nhapnv(){
        Scanner kb=new Scanner(System.in);
        System.out.println("nhap ma so ");
        maso=kb.nextInt();
        kb.nextLine();
        System.out.println("nhap ho ten ");
        ten=kb.nextLine();
        System.out.println("nhap luong co ban ");
        luong=kb.nextDouble();
        System.out.println("nhap he so luong ");
        hesoluong=kb.nextDouble();
    }
    public void xuatnv(){
        System.out.println("ma so "+maso +" ho ten "+ten +" luong co ban "+luong +" he so luong "+hesoluong);
    }
    public void tinhluong(){
        this.soluongnv=this.luong*this.hesoluong;
        System.out.println("luong cua nhan vien "+ten+" la "+soluongnv);
    }
}
