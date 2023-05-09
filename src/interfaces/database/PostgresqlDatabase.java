package interfaces.database;

public class PostgresqlDatabase implements IDatabase {
    @Override
    public void connect() {
        System.out.println("connection to postgresql database");
    }
}
