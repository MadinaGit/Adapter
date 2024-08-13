package ru.netology;

public class IntsCalculator implements Ints {

    protected final Calculator target;

    public IntsCalculator() {
        this.target = new Calculator();
    }

    @Override
    public int sum(int arg0, int arg1) {
        double a = arg0;
        double b = arg1;
        Calculator.Formula calculate = target.newFormula().addOperand(a).addOperand(b).calculate(Calculator.Operation.SUM);
        return (int) calculate.result();
    }

    @Override
    public int mult(int arg0, int arg1) {
        double a = arg0;
        double b = arg1;
        Calculator.Formula calculate = target.newFormula().addOperand(a).addOperand(b).calculate(Calculator.Operation.MULT);
        return (int) calculate.result();
    }

    @Override
    public int pow(int a, int b) {
        double i = a;
        double ii = b;
        Calculator.Formula calculate = target.newFormula().addOperand(i).addOperand(ii).calculate(Calculator.Operation.SUM);
        return (int) calculate.result();
    }
}
