/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2lab3;

/**
 *
 * @author khoav
 */
public class Demo {
    public static void main(String[] args) {
        phanso p1=new phanso();
        System.out.println("phan so 1");
        p1.nhapphanso();
        p1.xuatphanso();
        System.out.println("phan so 2");
        phanso p2=new phanso(4,16);
        p2.xuatphanso();
        System.out.println("phan so 3");
        phanso p3=new phanso();
        p3.nhapphanso();
        p3.xuatphanso();
        System.out.println("tong phan so 1 va phan so 3 la phan so 4");
        phanso tong=p1.cong(p3);
        phanso p4=new phanso(tong);
        System.out.println("phan so 4");
        p4.xuatphanso();
        System.out.println("nhan phan so 2 va phan so 4");
        phanso nhan=p2.nhan(p4);
        nhan.xuatphanso();
    }
}
