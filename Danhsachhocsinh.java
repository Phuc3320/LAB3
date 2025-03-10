/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1lap3;
import java.util.Scanner;
public class Danhsachhocsinh {
    private hocsinh ds[];
    private int n;
    
    public void nhapds(){
        Scanner kb=new Scanner(System.in);
        System.out.println("nhap so luong hoc sinh ");
        n=kb.nextInt();
        ds=new hocsinh[n];
        for(int i=0;i<n;i++){
            System.out.println("nhap hoc sinh so "+(i+1));
            ds[i]= new hocsinh();
            ds[i].nhaphs();
        }
    }
    public void xuatds(){
        System.out.println("danh sach hoc sinh la ");
        for(int i=0;i<n;i++){
            ds[i].xuaths();
        }
    }
    public void sapxep(){
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n ;j++){
                if(ds[i].getdiemtb()<ds[j].getdiemtb()){
                    hocsinh tam=ds[i];
                    ds[i]=ds[j];
                    ds[j]=tam;
                }
            }
        }
    }
}
