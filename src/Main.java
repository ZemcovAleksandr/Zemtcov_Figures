
//Создать 10 случайных фигур Circle, Triangle, Rectangle со случайными параметрами – радиусом, длиной стороны.
//Все фигуры имплементируют интерфейс Shape с одним методом getPerimeter():double, возвращающим периметр (или длину окружности)
//Найти и вывести информацию о фигуре с максимальным/минимальным периметром



import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
public class Main {
    /// public interface Openable {
     //   void open();
  //  }
    public enum ShapeType {  // Список фиксированных имён
        circle,
        triangle,
        rectangle
    }
    public static void main(String[] args) throws IOException {
        List<Krug> circles = new ArrayList<>();//Список для занесения параметров 10 кругов
        List<Tregl> rectangles = new ArrayList<>();////Список для занесения параметров 10 прямоугольников
        List<Rectng> triangles = new ArrayList<>();//Список для занесения параметров 10 треугольников
        int a = 0; // Начальное значение диапазона - "от"
        int b = 50; // Конечное значение диапазона - "до"
        int[] array = new int[6];
        for (int i = 0; i <10; i++)  {  //Заполнение случайными величинами 10   фигур каждого типа
        for (int j = 0; j < array.length; j++) {
            array[j] = a + (int) (Math.random() * b);; //Заполнение случайными величинами массива, для создания 10 случайны объектов фигур
        }
        circles.add(new Krug(ShapeType.circle,array[0]));
        rectangles.add(new Tregl(ShapeType.triangle, array[1],array[2],array[3]));
        triangles.add(new Rectng(ShapeType.rectangle, array[4],array[5]));    }
        System.out.println("Максимальный периметр круга: "+ MaxPer(circles));
        System.out.println("Максимальный периметр прямоугольника: "+MaxPer(rectangles));
        System.out.println("Максимальный периметр треугольника: "+MaxPer(triangles));
        System.out.println(" ");
        System.out.println("Минимальный периметр круга: "+ MinPer(circles));
        System.out.println("Минимальный периметр прямоугольника: "+ MinPer(rectangles));
        System.out.println("Минимальный периметр треугольника: "+ MinPer(triangles));
    }
    interface Shape { //Объявление интерфейса Фигур. С функцей получения периметра
        double getPerimeter();
        //void close();
    }
   public static class Krug implements Shape{//Объявления клааса фигуры
       // protected double price;
       protected double Radius;
        public Krug (ShapeType type,double a){
            if(type.equals(ShapeType.circle))//Выполнение только при совпадении с нужным типом
            this.Radius = Radius;
        }
        @Override
        public double getPerimeter() {
            return   Math.PI*2*Radius; // Подсчёт периметра.
         //   2 * 3.14 * a
        }
    }
    public static class Tregl implements Shape{
        // protected double price;
        protected double StoronaA;
        protected double StoronaB;
        protected double StoronaC;
        public Tregl (ShapeType type, double a,double b, double c){
            if(type.equals(ShapeType.triangle)) {
                this.StoronaA = StoronaA;
                this.StoronaB = StoronaB;
                this.StoronaC = StoronaC;
            }
        }
        @Override
        public double getPerimeter() {
            return StoronaA+StoronaB+StoronaC;
        }
    }
    public static class Rectng  implements Shape{
        // protected double price;
        protected double StoronaA;
        protected double StoronaB;
        public Rectng (ShapeType type, double a,double b){
            if(type.equals(ShapeType.rectangle)) {
                this.StoronaA = StoronaA;
                this.StoronaB = StoronaB;
            }
        }
        @Override
        public double getPerimeter() {

            return 2 * (StoronaA + StoronaB);
        }
    }
public static double MaxPer(List<? extends Shape> workingList) {// Нахождение максимального периметра
     double a = -1;
     for (int i = 0; i<workingList.size();i++){
         Shape jjj = workingList.get(i);
         if ( jjj.getPerimeter() > a) a= jjj.getPerimeter();
     }
     return a;
 }
static double MinPer(List<? extends Shape> workingList) {//Нахождение минимального периметра
        double a = 999999999;
        for (int i = 0; i<workingList.size();i++){
            Shape jjj = workingList.get(i);
            if ( jjj.getPerimeter() < a) a= jjj.getPerimeter();
        }
        return a;
    }
}
/*
public class Worker
{
    private List<? extends Orderable> workingList;

    public void setList(List<? extends Orderable> value) {this.workingList=value;}

}*/
