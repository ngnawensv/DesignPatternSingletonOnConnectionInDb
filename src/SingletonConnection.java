public class SingletonConnection {
    private static final Connection conn;
    //Instantiation d'une variable static
    static {
        conn = new Connection();
    }

    public static Connection getConn() {
        return conn;
    }
}
