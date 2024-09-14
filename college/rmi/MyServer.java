





import java.rmi.*;
import java.rmi.registry.*;
import java.rmi.server.UnicastRemoteObject;
public class MyServer extends UnicastRemoteObject implements Adder {
    public MyServer() throws RemoteException
    {
        super();
    }
    
    public static void main(String[] args) throws RemoteException{
        try{
            Registry reg = LocateRegistry.createRegistry(5000);
            reg.rebind("hi_server", new MyServer());
            System.out.println("Server is now Ready");
        }
        catch (RemoteException e)
        {
            System.out.println(e);
        }
    }
    public int Add(int x , int y ) throws RemoteException{
        return x + y;
    }
}

