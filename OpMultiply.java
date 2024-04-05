//  Операция УМНОЖЕНИЯ
class OpMultiply implements Operation {

    @Override
    public double perform(double operator1, double operator2) {
        return (operator1 * operator2);
    }
}