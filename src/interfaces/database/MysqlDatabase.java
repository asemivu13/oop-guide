package interfaces.database;

public class MysqlDatabase implements IDatabase {

    @Override
    public void connect() {
        System.out.println("connection to mysql database");
    }
}
