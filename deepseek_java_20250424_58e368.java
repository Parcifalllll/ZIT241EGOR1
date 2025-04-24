import java.util.Arrays;

public class BarycenterCalculator {
    public static void main(String[] args) {
        // Пример входных данных
        double[] pointA = {4, 6};
        double[] pointB = {12, 4};
        double[] pointC = {10, 10};
        
        // Вычисление барицентра
        double[] barycenter = calculateBarycenter(pointA, pointB, pointC);
        
        // Вывод результата с округлением до 4 знаков после запятой
        System.out.printf("Барицентр треугольника: {%.4f, %.4f}%n", 
                         barycenter[0], barycenter[1]);
    }
    
    public static double[] calculateBarycenter(double[] a, double[] b, double[] c) {
        // Барицентр - среднее арифметическое координат вершин
        double x = (a[0] + b[0] + c[0]) / 3;
        double y = (a[1] + b[1] + c[1]) / 3;
        
        return new double[]{x, y};
    }
}