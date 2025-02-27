package com.example.demo;

public class ThuongTrungThu {
    public String tinhThuong(int soNam){
        if(soNam<0){
            throw new IllegalArgumentException("So nam lam viec phai lon hon 0");
        }
        if(soNam<3){
            return "Thưởng 3 triệu";
        }else  if(soNam<=6){
            return "Thưởng 10 triệu";
        }else if(soNam<=10){
            return "Thưởng 20 triệu";
        }else {
            return "Thưởng 40 triệu";
        }
    }

}
