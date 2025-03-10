/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1lap3;

/**
 *
 * @author khoav
 */
public class Demo2 {
    public static void main(String[] args) {
        Danhsachhocsinh ds=new Danhsachhocsinh();
        ds.nhapds();
        ds.xuatds();
        System.out.println("danh sach sau khi sap xep ");
        ds.sapxep();
        ds.xuatds();
    }
}
