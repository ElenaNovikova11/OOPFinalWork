//  Операция ДЕЛЕНИЯ
class OpDivision implements Operation {
    @Override
    public double perform(double operator1, double operator2) {
        if (operator2 != 0) {
            return (operator1 / operator2);
        } else {
            System.out.println("Ошибка: Деление на ноль");
        }

        return (operator1 / operator2);

    }
}
