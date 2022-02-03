package strategy.Design.DivideClass;

import strategy.Design.StrategyInterfaceUsedByAll.Strategy;

public class OperationDivide implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 / num2;
    }
}
