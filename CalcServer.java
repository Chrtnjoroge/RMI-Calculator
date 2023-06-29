import java.rmi.Naming;

public class CalcServer {
    // Server configuration
    public CalcServer() {
    }

    {
        try {
             Calculator c = new CalcImp();
            
            // Bind to the RMI registry
             Naming.rebind("server", c);

            
            System.out.println("Server is running");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        new CalcServer();
    }
}
