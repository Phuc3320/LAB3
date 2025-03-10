/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1lap3;
import java.util.Scanner;
public class hocsinh {
    private int maso;
    private String ten;
    private double diemtb;

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

    public double getdiemtb() {
        return diemtb;
    }

    public void setdiemtb(double diemtb) {
        this.diemtb = diemtb;
    }

    public hocsinh(int maso, String ten, double diemtb) {
        this.maso = maso;
        this.ten = ten;
        this.diemtb = diemtb;
    }
    public hocsinh(){
        this.maso=0;
        this.ten="";
        this.diemtb=0.0;
    }
    public hocsinh(hocsinh tmp){
        this.maso=tmp.maso;
        this.ten=tmp.ten;
        this.diemtb=tmp.diemtb;
    }
    public void nhaphs(){
        Scanner kb=new Scanner(System.in);
        System.out.println("nhap ma so ");
        maso=kb.nextInt();
        kb.nextLine();
        System.out.println("nhap ho ten ");
        ten=kb.nextLine();
        System.out.println("nhap diem trung binh ");
        diemtb=kb.nextDouble();
    }
    public void xuaths(){
        System.out.println("ma so "+maso +"ho ten "+ten +"diem trung binh "+diemtb);
    }  
}
