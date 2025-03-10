/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai3lab3;
import java.util.Scanner;
/**
 *
 * @author khoav
 */
public class toado {
    private float x;
    private float y;
    
    public toado(){
        this.x=0.0f;
        this.y=0.0f;
    }
    public toado(float x,float y){
        this.x=x;
        this.y=y;
    }

    public float getx() {
        return x;
    }

    public float gety() {
        return y;
    }
    public void nhaptoado(){
        Scanner kb=new Scanner(System.in);
        System.out.print("nhap toa do x ");
        x=kb.nextFloat();
        System.out.print("nhap toa do y ");
        y=kb.nextFloat();
    }
    public void xuattoado(){
        System.out.println(+x+" "+y);
    }
    public toado tong(toado moi){
        return new toado(this.x+moi.x,this.y+moi.y);
    }
    public toado doixung(){
        this.y=-this.y;
        return new toado(this.x,-this.y);
    }
    public static void main(String[] args) {
        toado diem1=new toado();
        System.out.println("nhap toa do diem 1");
        diem1.nhaptoado();
        toado diem2=new toado();
        System.out.println("nhap toa do diem 2");
        diem2.nhaptoado();
        toado diem3=diem1.tong(diem2);
        System.out.println("tong diem 1 va diem 2 la");
        diem3.xuattoado();
        System.out.println("diem doi xung qua truc hoanh cua toa do tren la ");
        diem3.doixung();
        diem3.xuattoado();
    }
}
