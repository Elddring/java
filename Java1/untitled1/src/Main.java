import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner Read = new Scanner(System.in);
        while (true)
        {
            double num1;
            double num2;
            double result;
            char operation;
            System.out.print("\nВведите действие: (+, - , * - умножение, / - деление, ! - фактриал, ^ - возведение в степень): ");
            operation = Read.next().charAt(0);
            switch(operation) {
                case '+':
                    try {
                        System.out.print("Сложение\n");
                        System.out.print("Введите первое число: ");
                        num1 = Read.nextDouble();
                        System.out.print("Введите второе число: ");
                        num2 = Read.nextDouble();
                        result = num1 + num2;
                        System.out.print("\nРезультат:\n");
                        System.out.printf(num1 + " " + operation + " " + num2 + " = " + result);
                        break;
                    }
                    catch(Exception ex){
                        System.out.print("\nОшибка\n");
                        break;
                    }
                case '-':
                    try {
                        System.out.print("Вычитание\n");
                        System.out.print("Введите первое число: ");
                        num1 = Read.nextDouble();
                        System.out.print("Введите второе число: ");
                        num2 = Read.nextDouble();
                        result = num1 - num2;
                        System.out.print("\nРезультат:\n");
                        System.out.printf(num1 + " " + operation + " " + num2 + " = " + result);
                        break;
                    }
                    catch(Exception ex){
                        System.out.print("\nОшибка\n");
                        break;
                    }
                case '*':
                    try {
                        System.out.print("Умножение\n");
                        System.out.print("Введите первое число: ");
                        num1 = Read.nextDouble();
                        System.out.print("Введите второе число: ");
                        num2 = Read.nextDouble();
                        result = num1 * num2;
                        System.out.print("\nРезультат:\n");
                        System.out.printf(num1 + " " + operation + " " + num2 + " = " + result);
                        break;
                    }
                    catch(Exception ex){
                        System.out.print("\nОшибка\n");
                        break;
                    }
                case '/':
                    try {
                        System.out.print("Деление\n");
                        System.out.print("Введите первое число: ");
                        num1 = Read.nextDouble();
                        System.out.print("Введите второе число: ");
                        num2 = Read.nextDouble();
                        result = num1 / num2;
                        System.out.print("\nРезультат:\n");
                        System.out.printf(num1 + " " + operation + " " + num2 + " = " + result);
                        break;
                    }
                    catch(Exception ex){
                        System.out.print("\nОшибка\n");
                        break;
                    }
                case '!':
                    try {
                        System.out.print("Факториал числа\n");
                        System.out.print("Введите число: ");
                        num1 = Read.nextDouble();
                        if (num1 < 0 ){
                            break;
                        }
                        result = 1;
                        for (int factor = 1; factor <= num1; factor++) {
                            result *= factor;
                        }
                        System.out.print("\nРезультат:\n");
                        System.out.printf(operation + " " +  num1 + " = " + result);
                        break;
                    }
                    catch(Exception ex){
                        System.out.print("\nОшибка\n");
                        break;
                    }
                case '^':
                    System.out.print("Введите число: ");
                    num1 = Read.nextDouble();
                    System.out.print("Введите cтепень числа: ");
                    num2 = Read.nextDouble();
                    result = 1;
                    for (int i = 1; i <= num2; i++) {
                        result = result * num1;
                    }
                    System.out.printf(num1 + " " + operation + " " + num2 + " = " + result);
                default:  System.out.printf("");
            }

        }
    }
}
