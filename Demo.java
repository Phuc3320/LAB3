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
public class Demo {
    public static void main(String[] args) {
        Nhanvien nv1=new Nhanvien();
        System.out.println("nhap thong tin nhan vien 1");
        nv1.nhapnv();
        Nhanvien nv2=new Nhanvien(222,"Phuc Gia",10.500000,1.2);
        Nhanvien nv3=new Nhanvien(nv2);
        System.out.println("thong tin nhan vien");
        nv1.xuatnv();
        nv2.xuatnv();
        nv3.xuatnv();
        nv3.setten("Nguyen Van A");
        System.out.println("doi ten nhan vien 3");
        nv3.xuatnv();
        double max=nv1.gethesoluong();
        String hoten=nv1.getten();
        if(max<nv2.gethesoluong()){
            max=nv2.gethesoluong();
            hoten=nv2.getten();
        }
        if(max<nv3.gethesoluong()){
            max=nv3.gethesoluong();
            hoten=nv3.getten();
        }
        System.out.println("nhan vien "+hoten +" co he so luong lon nhat "+max);
        Danhsachnhanvien dsnv=new Danhsachnhanvien();
        dsnv.nhapds();
        dsnv.xuatds();
    }
}
