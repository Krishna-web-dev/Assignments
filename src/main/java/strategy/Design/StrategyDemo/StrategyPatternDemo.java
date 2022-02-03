package strategy.Design.StrategyDemo;

import strategy.Design.AddClass.OperationAdd;
import strategy.Design.Context.Context;
import strategy.Design.DivideClass.OperationDivide;
import strategy.Design.MultiplyClass.OperationMultiply;
import strategy.Design.PowerClass.OperationPower;
import strategy.Design.SubstractClass.OperationSubstract;

public class StrategyPatternDemo {
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println("120 + 15 = " + context.executeStrategy(120, 15));

        context = new Context(new OperationSubstract());
        System.out.println("102 - 53 = " + context.executeStrategy(102, 53));

        context = new Context(new OperationMultiply());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationDivide());
        System.out.println("100/ 5 = " + context.executeStrategy(100, 5));

        context = new Context(new OperationPower());
        System.out.println("2 ^ 5 = " + context.executeStrategy(2, 5));
    }
}
