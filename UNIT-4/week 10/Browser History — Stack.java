import java.util.*;

class BrowserHistory {
    public static void main(String[] args) {
        Stack<String> history = new Stack<>();

        history.push("Google");
        history.push("YouTube");
        history.push("Wikipedia");

        System.out.println("Current page: " + history.peek());

        history.pop();

        System.out.println("After Back button: " + history.peek());
    }
}
