package App79;
public class Sep  extends NhanVien {
    private int gioLamViec;
   
   public Sep(String ten, int gioLamViec){
       this.ten=ten;
       this.gioLamViec=gioLamViec;
      
   }
   @Override
   public String loaiNhanVien(){
       return "sep";
   }
   public void tinhLuong(){
       luong= Configs.Luong_full_time_sep * gioLamViec;
   }
}
