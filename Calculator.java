import java.rmi.RemoteException;

//Calculator interface
public interface Calculator extends java.rmi.Remote {
    //  addition
    public int add(int n1, int n2) throws RemoteException;

    // subtraction 
    public int sub(int n1, int n2) throws RemoteException;

    // multiplication 
    public int mul(int n1, int n2) throws RemoteException;

    //division 
    public int div(int n1, int n2) throws RemoteException;
}
