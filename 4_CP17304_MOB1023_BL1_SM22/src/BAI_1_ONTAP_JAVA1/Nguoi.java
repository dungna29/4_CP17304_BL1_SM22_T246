/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI_1_ONTAP_JAVA1;

/**
 *
 * @author dungna29
 */
/*
    1. Lớp cha
    2. Lớp abstract sẽ luôn phải có phương abstract
*/
public abstract class Nguoi {
    //Phần 1: Khai báo các thuộc tính mà đối tượng cần có
    private int id;
    private String ten;
    private int namSinh;
    private double canNang;
   
    //Phần 2: 2 Contructor trong môi trường đi học

    public Nguoi() {
    }

    public Nguoi(int id, String ten, int namSinh, double canNang) {
        this.id = id;
        this.ten = ten;
        this.namSinh = namSinh;
        this.canNang = canNang;
        //this: dùng để tham chiếu đến thuộc tính và phương thức của lớp hiện tại.
        //super: dùng để tham chiếu đến thuộc tính và phương thức của lớp cha.
    }
    //Nạp chồng phương thức Overloading: Phương thức giống tên nhau nhưng với điều kiện phải khác tham số. Khi gọi số lượng tham số và kiểu dữ liệu sẽ quyết định gọi vào phương thức nào.
    
   //Phần 3: Getter và Setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public double getCanNang() {
        return canNang;
    }

    public void setCanNang(double canNang) {
        this.canNang = canNang;
    }
    
    //Phần 4:Các phương thức của đối tượng

    @Override
    public String toString() {
        return "Nguoi{" + "id=" + id + ", ten=" + ten + ", namSinh=" + namSinh + ", canNang=" + canNang + '}';
    }
    
    public void Method1(int a, int b, String c){
        
    }
    public void Method2(int a, int b){
        
    }
    private void Method3(int a){
        
    }
    //Phương thức abstract không có body code.
    public abstract void InRaManHinh();
}
