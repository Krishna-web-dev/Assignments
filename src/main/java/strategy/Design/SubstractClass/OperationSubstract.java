package strategy.Design.SubstractClass;

import strategy.Design.StrategyInterfaceUsedByAll.Strategy;

public class OperationSubstract implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}