/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1lap3;
public class Demo1 {
    public static void main(String[] args) {
        hocsinh hs1=new hocsinh();
        hs1.nhaphs();
        hs1.xuaths();
        hocsinh hs2=new hocsinh(222,"Nguyen Gia Phuc",7.5);
        hs2.xuaths();
        hocsinh hs3=new hocsinh(hs2);
        hs3.xuaths();
        hs3.setten("Phuc Gia");
        hs3.xuaths();
        double max=hs1.getdiemtb();
        String hoten=hs1.getten();
        if(max<hs2.getdiemtb()){
            max=hs2.getdiemtb();
            hoten=hs2.getten();
        }
        if(max<hs3.getdiemtb()){
            max=hs3.getdiemtb();
            hoten=hs3.getten();
        }
        System.out.println("hoc sinh "+hoten +" co diem trung binh lon nhat "+max);
    }
}
