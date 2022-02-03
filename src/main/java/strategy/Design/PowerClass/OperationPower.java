package strategy.Design.PowerClass;

import strategy.Design.StrategyInterfaceUsedByAll.Strategy;

public class OperationPower implements Strategy {
    @Override
    public int doOperation(int base, int exponent) {
         int result = 1;
        while (exponent != 0) {
            result *= base;
            --exponent;
        }
        return result;
    }
}