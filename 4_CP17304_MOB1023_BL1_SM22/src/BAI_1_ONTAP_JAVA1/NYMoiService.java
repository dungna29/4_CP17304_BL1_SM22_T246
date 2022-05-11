/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI_1_ONTAP_JAVA1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author dungna29
 */
public class NYMoiService {//Các chức năng của đối tượng

    private Scanner _sc;
    private List<NYMoi> _lstNyMois;
    private NYMoi _NyMoi;
    private String _input;

    public NYMoiService() {
        _sc = new Scanner(System.in);
        _lstNyMois = new ArrayList<>();
        FakeData();
    }

    public void FakeData() {
        _lstNyMois.add(new NYMoi(90, 1, "Nguyễn Thị A", 2000, 50));
        _lstNyMois.add(new NYMoi(90, 2, "Nguyễn Thị B", 2001, 70));
        _lstNyMois.add(new NYMoi(90, 3, "Nguyễn Thị C", 2002, 90));
    }

    //Phương thức thêm đối tượng
    public void Them1() {
        System.out.println("Mời nhập số lượng: ");
        _input = _sc.nextLine();
        for (int i = 0; i < Integer.parseInt(_input); i++) {
            _NyMoi = new NYMoi();
            System.out.println("Mời bạn nhập ID: ");
            _NyMoi.setId(Integer.parseInt(_sc.nextLine()));
            System.out.println("Mời bạn nhập tên: ");
            _NyMoi.setTen(_sc.nextLine());
            System.out.println("Mời bạn nhập năm sinh: ");
            _NyMoi.setNamSinh(Integer.parseInt(_sc.nextLine()));
            System.out.println("Mời bạn nhập cân nặng: ");
            _NyMoi.setCanNang(Double.parseDouble(_sc.nextLine()));
            System.out.println("Mời bạn vòng 3: ");
            _NyMoi.setVong3(Double.parseDouble(_sc.nextLine()));
            _lstNyMois.add(_NyMoi);
        }
    }
    public void Them2() {
        _input = GetInputValue("số lượng");
        for (int i = 0; i < Integer.parseInt(_input); i++) {
            _lstNyMois.add(new NYMoi(Double.parseDouble(GetInputValue("vòng 3")), Integer.parseInt(GetInputValue("ID")), GetInputValue("tên"),Integer.parseInt(GetInputValue("năm sinh")) , Double.parseDouble(GetInputValue("cân nặng"))));
        }
    }

    public String GetInputValue(String msg) {
        System.out.printf("Mời nhập %s: ", msg);
        return _sc.nextLine();
    }
    public void xuatDS(){
        for (NYMoi x : _lstNyMois)x.InRaManHinh();
    }
    //Sửa, Xoá, Tìm kiếm
    public void TimNY(){
         _input = GetInputValue("id");
         for (int i = 0; i < _lstNyMois.size(); i++) {
             if (_lstNyMois.get(i).getId() == Integer.parseInt(_input)) {
                 _lstNyMois.get(i).InRaManHinh();
                 break;
             }
        }
    }
    public void Xoa(){
         _input = GetInputValue("id");
         for (int i = 0; i < _lstNyMois.size(); i++) {
             if (_lstNyMois.get(i).getId() == Integer.parseInt(_input)) {
                 _lstNyMois.remove(i);
                 break;
             }
        }
    }
    public void Sua(){
         _input = GetInputValue("id");
         for (int i = 0; i < _lstNyMois.size(); i++) {
             if (_lstNyMois.get(i).getId() == Integer.parseInt(_input)) {
                 
             }
        }
    }
    
}
