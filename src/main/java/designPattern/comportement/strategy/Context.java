package designPattern.comportement.strategy;

public class Context {
    protected Strategy strategy;

    public void appliquerStrategy(){
        strategy.operationStategy();
    }
    public void setStrategy (Strategy strategy){
        this.strategy = strategy;
    }

}
