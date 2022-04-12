package App71;
public class main {
    public static void main(String[] args) {
        HinhTron hinhtron = new HinhTron();
        hinhtron.setBanKinh(7);
        float chuVi = hinhtron.tinhChuVi();
        float dienTich= hinhtron.tinhDienTich();
        System.out.println("Chu vi hinh tron: " + chuVi +"; Dien tich : " + dienTich);
      }
}
