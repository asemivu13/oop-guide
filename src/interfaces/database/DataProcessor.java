package interfaces.database;

public class DataProcessor {
    private IDatabase database;

    public DataProcessor(IDatabase database) {
        this.database = database;
    }

    public void processData() {
        database.connect();
    }
}
