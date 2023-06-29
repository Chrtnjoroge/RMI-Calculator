import java.rmi.RemoteException;

public  class CalcImp extends java.rmi.server.UnicastRemoteObject implements Calculator{

private static final long serialVersionUID = 1L;
	//	implementation of the calculations 
	public CalcImp() throws RemoteException {
	super();
		
	}
	public int  add(int n1, int n2) throws java.rmi.RemoteException
	{
		return n1 + n2;
	}
	public int  sub(int n1, int n2) throws java.rmi.RemoteException
	{
		return n1 - n2;
	}
	public int  mul(int n1, int n2) throws java.rmi.RemoteException
	{
		return n1 * n2;
	}
	public int  div(int n1, int n2) throws java.rmi.RemoteException
	{
		return n1 / n2;
	}

}
