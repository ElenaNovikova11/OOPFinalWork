import java.util.Scanner;

class Calculator {

    MyOpFactory myOpFactory;

    public Calculator(MyOpFactory myOpFactory) {
        this.myOpFactory = myOpFactory;
    }

    // Обеспечивает цикл ввода аргументов и вида операции
    // и вывод результата операции
    public void perform() {

        boolean nextStep = true; // Условие выхода из цикла
        boolean p = true;
        double buf = 0;
        Scanner scanner = new Scanner(System.in); // Объявление потока ввода
        do {
            // Ввод первого числа
            double arg1;
            arg1 = buf;
            if (p) {
                System.out.println("Введите первое число");
                try {
                    if (!scanner.hasNextDouble()) {
                        throw new NumberFormatException();
                    } else
                        arg1 = scanner.nextDouble(); // Ввод числа с клавиатуры
                } catch (NumberFormatException e) {
                    System.out.println(e);
                    break;
                }
            }
            // Ввод операции
            System.out.println("Выберите операцию: 1-сумма, 2-умножение, 3-деление");
            int operation = scanner.nextInt();

            // Ввод второго числа
            System.out.println("Введите второе число");
            double arg2 = scanner.nextDouble();

            // Обработка операций над аргемунтами
            System.out.print("Результат равен: ");
            Operation op = myOpFactory.getOpInstance(operation);
            System.out.println(op.perform(arg1, arg2));

            System.out.println("Что делаем дальше? 1- Еще считаем, 2 - Выходим");
            int Next = scanner.nextInt();
            if (Next == 2)
                nextStep = false;
        } while (nextStep);
    }
}
