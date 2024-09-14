import java.rmi.*;
import java.rmi.registry.*;

public class myClient {
    public static void main (String[] args) throws RemoteException
    {
        try{
            Registry reg = LocateRegistry.getRegistry("localhost",5000);
            Adder ad = (Adder)reg.lookup("hi_server");
            System.out.println("Addition" + ad.Add(30, 40));
        }
        catch(NotBoundException| RemoteException e)
        {
            System.out.println(e);
        }
    }
}
