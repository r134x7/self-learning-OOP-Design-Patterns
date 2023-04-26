public abstract class StealingMethod {

    protected abstract String pickTarget();

    protected abstract void confuseTarget(String target);

    protected abstract void stealTheItem(String target);

    public final void steal() {
        String target = pickTarget();
        System.out.printf("The target has been as chosen as %s.", target);
        confuseTarget(target);
        stealTheItem(target);
    }
}
