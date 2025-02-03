// Indiana class extends State and applies 7% sales tax
public class Indiana extends State {
    public Indiana() {
        super("Indiana", new SevenPercent());
    }
}
