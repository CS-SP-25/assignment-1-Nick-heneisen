// Alaska class extends State and applies no sales tax
public class Hawaii extends State {
    public Hawaii() {
        super("Hawaii", new FourPointFivePercent());
    }
}