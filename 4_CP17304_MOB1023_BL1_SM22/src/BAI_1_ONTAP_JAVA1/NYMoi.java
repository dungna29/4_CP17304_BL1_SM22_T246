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
  Đối với lớp con khi kế thừa với 1 lớp abstract thì bắt buộc để trở thành con thì phải ghi đè lại toàn bộ các phương thức abstract. 
*/
public class NYMoi extends Nguoi{
    private double Vong3;

    public NYMoi() {
    }

    public NYMoi(double Vong3, int id, String ten, int namSinh, double canNang) {
        super(id, ten, namSinh, canNang);
        this.Vong3 = Vong3;
    }

    public double getVong3() {
        return Vong3;
    }

    public void setVong3(double Vong3) {
        this.Vong3 = Vong3;
    }
    /*
       Override (Ghi đè phương thức): Phương thức lớp con phải giống tuyệt đối từ kiểu, tên, tham số của lớp cha. Lớp con có thể code lại nội dung bên trong. 
    */
    @Override
    public void Method1(int a, int b, String c) {
        super.Method1(a, b, c); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void InRaManHinh() {
        System.out.println(super.toString() + getVong3() + " | "+
                (getCanNang() <=50?"Gầy":getCanNang() <=70?"Bình thường":"Đáng yêu"));
        
    }
   
    
    
}
