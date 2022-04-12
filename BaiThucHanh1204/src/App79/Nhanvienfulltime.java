package App79;
import App79.Configs;
public class Nhanvienfulltime extends NhanVien {
    private int gioLamViec;
   public Nhanvienfulltime(String ten, int gioLamViec){
       this.ten=ten;
       this.gioLamViec=gioLamViec;
   }
   @Override
   public String loaiNhanVien(){
       return "Nhan vien chinh thuc";
   }
   public void tinhLuong(){
       luong= Configs.Luong_full_time * gioLamViec;
   }
public void setloaiNhanVien(int sep) {
}
}
