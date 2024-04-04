class Delen implements Oper {
    public double execute(double oper1, double oper2) {
        if (oper2 == 0) {
            throw new ArithmeticException("Деление на ноль невозможно");
        }
        return oper1 / oper2;
    }
}
