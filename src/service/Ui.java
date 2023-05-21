package service;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ui {
    private int i;

    public Ui() {

    }

    public int getI() {
        return i;
    }

    public void setI() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Число :");
        try {
            this.i = Integer.parseInt(br.readLine());
        } catch(NumberFormatException | IOException nfe) {
            System.err.println("Невернвй формат!");
        }
    }

    @Override
    public String toString() {
        return String.format("Вы ввели число: %d !",i);
    }
}
