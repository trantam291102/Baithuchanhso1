package App54;
import App54.HinhChuNhat;
import App54.HinhTron;
import App54.HinhTru;
import App54.HinhVuong;
public class main {
	public static void main(String[] args) {
		HinhTron hinhTron=new HinhTron();
		hinhTron.xuatTen();
		hinhTron.nhapBanKinh();
		hinhTron.tinhChuVi();
		hinhTron.tinhDienTich();
		hinhTron.inChuVi();
		hinhTron.inDienTich();
		HinhTru hinhTru=new HinhTru();
		hinhTru.xuatTen();
		hinhTru.nhapChieuCao();
		hinhTru.tinhTheTich();
		hinhTru.inTheTich();
		HinhChuNhat hinhChuNhat=new HinhChuNhat();
		hinhChuNhat.xuatTen();
		hinhChuNhat.nhapChieuDai();
		hinhChuNhat.nhapChieuRong();
		hinhChuNhat.tinhChuVi();
		hinhChuNhat.tinhDienTich();
		hinhChuNhat.inChuVi();
		hinhChuNhat.inDienTich();
		HinhVuong hinhVuong=new HinhVuong();
		hinhVuong.xuatTen();
		hinhVuong.nhapCanh();
		hinhVuong.tinhChuVi();
		hinhVuong.tinhDienTich();
		hinhVuong.inChuVi();
		hinhVuong.inDienTich();
	}
}