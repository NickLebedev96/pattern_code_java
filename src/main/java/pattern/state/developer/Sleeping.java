package pattern.state.developer;

public class Sleeping implements Activity {
    @Override
    public void justDoIt() {
        System.out.println("Sleeping ...");
    }
}
