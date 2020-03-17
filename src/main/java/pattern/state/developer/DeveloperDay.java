package pattern.state.developer;

public class DeveloperDay {
    public static void main(String[] args) {
        final Developer developer = new Developer(new Sleeping());
        for (int i = 0; i < 10; i++) {
            developer.justDoIt();
            developer.changeActivity();
        }
    }
}
