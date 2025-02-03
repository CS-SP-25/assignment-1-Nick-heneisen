// Alaska class extends State and applies no sales tax
public class Alaska extends State {
    public Alaska() {
        super("Alaska", new NoTax());
    }
}