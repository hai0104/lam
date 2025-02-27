package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class NhanVienService {
  private   List<NhanVien> list= new ArrayList<>();
   //Trả về số lượng nhân vien thêm được vào size( int -output)
//  public void themNV(NhanVien nhanVien){
//       list.add(nhanVien);
//
//   }
    public String themNV(NhanVien nhanVien){
        //Mã nhân viên bắt đầu bằng nv
        if(nhanVien.getCodeEmployee().startsWith("NV")){
            list.add(nhanVien);
            return "Thêm NV Thành công";
        }else {
            return "Thêm NV phai bat dau bang NV";
        }

    }
   public List<NhanVien> timKiem(String firstName){
        if (firstName==null||firstName.isEmpty()){
            throw new IllegalArgumentException("Ten Nhan Vien Khong de trong");
        }
       List<NhanVien> kq=new ArrayList<>();
       for (NhanVien nv:list){
           if(nv.getFirstName().equalsIgnoreCase(firstName)){
               kq.add(nv);
           }
       }
       return kq;
   }
   // chuc nang sua theo ten nhan vien

}
