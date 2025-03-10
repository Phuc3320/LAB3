/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2lab3;
import java.util.Scanner;
/**
 *
 * @author khoav
 */
public class phanso {
    private int tu;
    private int mau;
    
    public phanso(){
        this.tu=0;
        this.mau=0;
    }
    public phanso(int tu,int mau){
        this.tu=tu;
        this.mau=mau;
        
    }
    public phanso(phanso p){
        this.tu=p.tu;
        this.mau=p.mau;
        
    }
    public void nhapphanso(){
        Scanner kb=new Scanner(System.in);
        System.out.println("nhap tu so ");
        tu=kb.nextInt();
        System.out.println("nhap mau so ");
        mau=kb.nextInt();
    }
    public void xuatphanso(){
        System.out.println(+tu+"/"+mau);
    }
    private int ucln(int a,int b){
        a=Math.abs(a);
        b=Math.abs(b);
        while (b!=0){
            int tam=b;
            b=a%b;
            a=tam;
        }
        return a;
    }
    private void rutgon(){
        int uc = ucln(tu,mau);
        tu=tu/uc;
        mau=mau/uc;
    }
    public phanso cong(phanso p){
        int tumoi=this.tu*p.mau+this.mau*p.tu;
        int maumoi=this.mau*p.mau;
        return new phanso(tumoi,maumoi);
    }
    public phanso tru(phanso p){
        int tumoi=this.tu*p.mau-this.mau*p.tu;
        int maumoi=this.mau*p.mau;
        return new phanso(tumoi,maumoi);
    }
    public phanso nhan(phanso p){
        return new phanso(this.tu*p.tu,this.mau*p.mau);
    }
    public phanso chia(phanso p){
        return new phanso(this.tu*p.mau,this.mau*p.tu);
    }
}
