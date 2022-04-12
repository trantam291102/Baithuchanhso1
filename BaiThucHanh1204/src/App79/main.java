package App79;
import App79.Nhanvienfulltime;
import App79.Nhanvienthoivu;
import App79.Configs;
public class main {
    public static void main(String[] args) {  
        Nhanvienfulltime sep = new Nhanvienfulltime("Trần Văn Sếp",1);
        sep.setloaiNhanVien(Configs.SEP);
        Nhanvienfulltime linh1 = new Nhanvienfulltime("Nguyễn Văn Lính",0); 
        Nhanvienfulltime linh2 = new Nhanvienfulltime("Lê Thị Lính", 3); 
        Nhanvienthoivu thoiVu = new Nhanvienthoivu("Phan Thị Thời Vụ", 240); 
        sep.tinhLuong();
        linh1.tinhLuong();
        linh2.tinhLuong();
        thoiVu.tinhLuong();
        sep.xuatThongTin();
        linh1.xuatThongTin();
        linh2.xuatThongTin();
        thoiVu.xuatThongTin();
    }
}
