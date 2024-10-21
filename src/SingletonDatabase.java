public class SingletonDatabase {
    // Static instance
    private static SingletonDatabase instance;

    // Private constructor to prevent instantiation
    private SingletonDatabase() {
        System.out.println("Connected to the Database.");
    }

    // Public method to get the instance
    public static SingletonDatabase getInstance() {
        if (instance == null) {
            instance = new SingletonDatabase();
        }
        return instance;
    }

    // Simulate database operation
    public void query(String sql) {
        System.out.println("Executing query: " + sql);
    }

    public static void main(String[] args) {
        // Accessing the Singleton instance
        SingletonDatabase database = SingletonDatabase.getInstance();
        database.query("SELECT * FROM users");
    }
}
