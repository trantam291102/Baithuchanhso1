public class NhanVien{
    int id;
    String name;
    String diachi;
    public NhanVien(int id, String name, String diachi){
        this.id = id;
        this.name = name;
        this.diachi = diachi;
    }
    public void nhapthongtin(int id, String name, String diachi){
        this.id = id;
        this.name = name;
        this.diachi = diachi;
    }
    public void ThongTin(){
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
        System.out.println("Address: " + diachi);
    }
} 