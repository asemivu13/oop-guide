package mvc;

public class Controller {
    private Model model;
    private View view;
    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }
    public void setName(String name) {
        model.setName(name);
    }
    public void updateView() {
        String name = model.getName();
        String email = model.getEmail();

        if (name != null && email != null) {
            view.displayUser(name, email);
        }
    }
}
