import service.Calculation;
import service.Ui;
/*
Запуск
docker build . -t <project_name>
docker run -it --rm <project_name>
*/

public class Main {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        Ui myNum = new Ui();
        Calculation myCalculation = new Calculation();
        System.out.println("Пример простого калькулятора");
        System.out.println("Введите первое число ");
        myNum.setI();
        myCalculation.setA(myNum.getI());
        int firstNum = myNum.getI();
        System.out.println(firstNum);
        System.out.println("Введите второе число ");
        myNum.setI();
        myCalculation.setB(myNum.getI());
        firstNum = myNum.getI();
        System.out.println(firstNum);
        System.out.println(String.format("Результат сложения: %d !",myCalculation.Add()));
        System.out.println(String.format("Результат вычитания: %d !",myCalculation.Sub()));
        System.out.println(String.format("Результат умножения: %d !",myCalculation.Mul()));
        System.out.println(String.format("Результат деления: %.2f !",myCalculation.Div()));
    }
}
