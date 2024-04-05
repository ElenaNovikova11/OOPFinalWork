//  Операция СУММА
class OpPlus implements Operation {

    @Override
    public double perform(double operator1, double operator2) {
        return (operator1 + operator2);
    }
}