package strategy.Design.StrategyInterfaceUsedByAll;

// main interface used  by all classed to use
//name is given as doOperation so it can be implemented by the different classes
public interface Strategy {
    public int doOperation(int num1, int num2);
}
