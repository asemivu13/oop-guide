package mvc;

public class MVCTest {
    public static void main(String[] args) {
        Model model = new Model("abc", "abc@example.com");
        View view = new View();
        Controller controller = new Controller(model, view);

        controller.setName("iu");
        controller.updateView();
    }
}
