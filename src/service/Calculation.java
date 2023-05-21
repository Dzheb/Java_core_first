package service;

/**
 * @brief Класс калькулятор
 * @warning Для работы методов в других файлах необходимо подключить этот файл
 * @code{.java}
import Calculation';
 * @endcode
 * @details Класс производит простейшие арифметичес кие операции: сложение, вычитание,умножение, деление.
 * @param a - аргумент1 - типа int.
 * @param b - аргумент2 - типа int.
 * @date 17.05.2023
 * @author Джериев Борис
 */
public class Calculation {
    private int a;
    private int b;
    public Calculation () {

    }
    public int getA() {
        return a;
    }
    public int getB() {
        return b;
    }
    public void setA(int a) {
        this.a = a;
    }
    public void setB(int b) {
        this.b = b;
    }

    public int Add () {
        return a + b;
    }
    public int Sub () {
        return a - b;
    }
    public int Mul () {
        return a * b;
    }
    public double Div () {
        return (double)a / (double)b;
    }

}
