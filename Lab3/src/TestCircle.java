public class TestCircle
{
    public static void main(String[] args) {
        // Создание экземпляра класса Circle
        Circle circle = new Circle(5.0);

        // Получение радиуса окружности
        double radius = circle.getRadius();
        System.out.println("Radius: " + radius);

        // Изменение радиуса окружности
        circle.setRadius(7.0);

        // Получение площади и длины окружности
        double area = circle.getArea();
        double perimeter = circle.getPerimeter();

        System.out.println("New Radius: " + circle.getRadius());
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
    }
}
