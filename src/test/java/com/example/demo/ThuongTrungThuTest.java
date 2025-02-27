package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ThuongTrungThuTest {
    ThuongTrungThu trungThu=new ThuongTrungThu();
    @Test
    public void testThuongPhanVungTD(){
        //TC1: SoNam=2
        String exp="Thưởng 3 triệu";
        String act=trungThu.tinhThuong(2);
        Assertions.assertEquals(exp,act);
    }
    @Test
    public void testThuongPhanVungTD_5(){
        //TC1: SoNam=5
        String exp="Thưởng 10 triệu";
        String act=trungThu.tinhThuong(5);
        Assertions.assertEquals(exp,act);
    }
    @Test
    public void testPhanVung(){
        //TC1: SoNam=-1
        Assertions.assertThrows(IllegalArgumentException.class,()->{trungThu.tinhThuong(-1);});

    }

}