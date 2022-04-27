package Shape;
import Shape.Point;
import Shape.Triangle;
import Shape.Quadrilateral;
public class App2604 {
    public static void main(String[] args) {
		Point point=new Point();
		point.nhapTenDiem();
		point.nhapHoanhDo();
		point.nhapTungDo();
		point.inDiem();
		Triangle triangle=new Triangle();
		triangle.nhapTenDiem1();
		triangle.nhapTenDiem2();
        triangle.nhapTenDiem3();
        triangle.nhapHoanhDo1();
        triangle.nhapTungDo1();
        triangle.nhapHoanhDo2();
        triangle.nhapTungDo2();
        triangle.nhapHoanhDo3();
        triangle.nhapTungDo3();
        triangle.XetTamGiac();
		Quadrilateral quadrilateral=new Quadrilateral();
		quadrilateral.nhapTenDiem1();
		quadrilateral.nhapTenDiem2();
        quadrilateral.nhapTenDiem3();
        quadrilateral.nhapTenDiem4();
        quadrilateral.nhapHoanhDo1();
        quadrilateral.nhapTungDo1();
        quadrilateral.nhapHoanhDo2();
        quadrilateral.nhapTungDo2();
        quadrilateral.nhapHoanhDo3();
        quadrilateral.nhapTungDo3();
        quadrilateral.nhapHoanhDo4();
        quadrilateral.nhapTungDo4();
        quadrilateral.XetTuGiac();
	}
}