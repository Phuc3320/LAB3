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
public class Danhsachnhanvien {
    private Nhanvien ds[];
    private int n;
    
    public void nhapds(){
        Scanner kb=new Scanner(System.in);
        System.out.println("nhap so luong nhan vien");
        n=kb.nextInt();
        ds=new Nhanvien[n];
        for(int i=0;i<n;i++){
            System.out.println("nhap thong tin nhan vien thu "+(i+1));
            ds[i]=new Nhanvien();
            ds[i].nhapnv();
        }
    }
    public void xuatds(){
        System.out.println("danh sach nhan vien ");
        for(int i=0;i<n;i++){
            ds[i].xuatnv();
        }
    }
}
