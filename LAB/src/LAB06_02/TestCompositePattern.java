
//Shape 변수를 생성하고 Drawing 변수에 추가한 뒤에 draw,clear를 호출한다. 
package LAB06_02;

public class TestCompositePattern {
    public static void main(String[] args) {
        Shape tri = new Triangle();
        Shape tri1 = new Triangle();
        Shape cir = new Circle();
         
        Drawing drawing = new Drawing();
        drawing.add(tri1);
        drawing.add(tri1);
        drawing.add(cir);
         
        drawing.draw("Red");
         
        drawing.clear();
         
        drawing.add(tri);
        drawing.add(cir);
        drawing.draw("Green");
    }

}
