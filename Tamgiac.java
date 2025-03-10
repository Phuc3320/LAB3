/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai5lab3;
import java.util.Scanner;
/**
 *
 * @author khoav
 */
public class Tamgiac {
    private int canh1;
    private int canh2;
    private int canh3;

    public Tamgiac(int canh1, int canh2, int canh3) {
        if(!kiemtra(canh1,canh2,canh3)){
            throw new IllegalArgumentException("khong hop le");
        }
        this.canh1 = canh1;
        this.canh2 = canh2;
        this.canh3 = canh3;
    }
    public Tamgiac(){
        this.canh1=0;
        this.canh2=0;
        this.canh3=0;
    }
    private boolean kiemtra(int canh1,int canh2,int canh3){
        return (canh1+canh2>canh3)&&(canh1+canh3>canh2)&&(canh2+canh3>canh1);
    }
    public void nhap(){
        Scanner kb=new Scanner(System.in);
        System.out.println("nhap canh1 ");
        canh1=kb.nextInt();
        System.out.println("nhap canh2");
        canh2=kb.nextInt();
        System.out.println("nhap canh3");
        canh3=kb.nextInt();
    }
    public void chuvi(){
        int chuvi= canh1+canh2+canh3;
        System.out.println("chu vi la "+chuvi);
    }
    public void dientich(){
        double cv = (canh1+canh2+canh3)/2;
        double dt= Math.sqrt(cv*(cv-canh1)*(cv-canh2)*(cv-canh3));
        System.out.println("dien tich la "+dt);
    }
    public void loaitg(){
        if(canh1==canh2&&canh2==canh3){
            System.out.println("tam gia deu");
        }else if(canh1==canh2 || canh2==canh3 || canh1==canh3){
            if(kiemtratgvuong()){
                System.out.println("tam giac vuong can");
            }
            System.out.println("tam giac can");
        }else if(kiemtratgvuong()){
            System.out.println("tam giac vuong");
        }
        System.out.println("tam giac thuong");
    }
    private boolean kiemtratgvuong() {
        int max = Math.max(canh1, Math.max(canh2, canh3));
        if (max == canh1) {
            return (canh1 * canh1 == canh2 * canh2 + canh3 * canh3);
        } else if (max == canh2) {
            return (canh2 * canh2 == canh1 * canh1 + canh3 * canh3);
        } else {
            return (canh3 * canh3 == canh1 * canh1 + canh2 * canh2);
        }
    }
    public static void main(String[] args) {
        Tamgiac tg=new Tamgiac();
        tg.nhap();
        tg.chuvi();
        tg.dientich();
        tg.loaitg();
    }
}
