package interfaces.database;

public class DatabaseTest {
    public static void main(String[] args) {
        IDatabase database1 = new MysqlDatabase();
        IDatabase database2 = new PostgresqlDatabase();
        DataProcessor processor = new DataProcessor(database1);
        processor.processData();
    }
    void playWithDatabaseV1(MysqlDatabase database) {
        database.connect();
    }
    void playWithDatabaseV2(IDatabase database) {

    }
}
