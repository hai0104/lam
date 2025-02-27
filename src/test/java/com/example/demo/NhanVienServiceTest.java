package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NhanVienServiceTest {
    NhanVienService nhanVienService = new NhanVienService();

//    @Test
//    public void test(){
//        NhanVien nv1= new NhanVien(1,"NV1","Dang","Hai","HS",200000);
//        nhanVienService.themNV(nv1);
//        NhanVien nv2= new NhanVien(2,"NV2","Kang","Hai","HS",200000);
//        nhanVienService.themNV(nv2);
//        Assertions.assertEquals(1,nhanVienService.timKiem("kang").size());
//    }
    @Test
    public void testNhanVien(){
        NhanVien nv1= new NhanVien(1,"NV1","Dang","Hai","HS",200000);
        String exp="Thêm NV Thành công";
        String act =nhanVienService.themNV(nv1);
        Assertions.assertEquals(exp,act);
    }
    //themNV bat dau bang NV
    @Test
    public void testNhanVien1(){
        Assertions.assertThrows(IllegalArgumentException.class,()->{nhanVienService.timKiem("");});
    }
    @Test
    public void testNhanVien3(){
        Assertions.assertThrows(IllegalArgumentException.class,()->{nhanVienService.timKiem(null);});
    }

}