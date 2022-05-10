import java.util.LinkedList;
public class AppLink{
    public static void main(String[] args){
       LinkedList<nhanvien> nv = new LinkedList<>();
       nhanvien nv1 = new nhanvien(1, "Nguyen Van A", "Hanoi");
       nhanvien nv2 = new nhanvien(2, "Nguyen Van B", "HCM"); 
       nhanvien nv3 = new nhanvien(3, "Nguyen Van C", "Danang");
       nhanvien nv4 = new nhanvien(4, "Nguyen Van D", "Ninhbinh");
       nv.add(nv1);
       nv.add(nv2);
       nv.add(nv3);
       nv.remove(nv3);
       nv.set(3, nv4);
       showList(nv);
    }
} 
