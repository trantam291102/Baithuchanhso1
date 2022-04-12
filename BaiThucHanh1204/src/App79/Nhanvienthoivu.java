package App79;
import App79.Configs;
public class Nhanvienthoivu extends NhanVien {
    private int gioLamViec;
   public Nhanvienthoivu(String ten, int gioLamViec){
       this.ten=ten;
       this.gioLamViec=gioLamViec;
   }
   @Override
   public String loaiNhanVien(){
       return "Nhan vien lam theo gio";
   }
   public void tinhLuong(){
       luong= Configs.Luong_part_time_moi_gio* gioLamViec;
   }
}
