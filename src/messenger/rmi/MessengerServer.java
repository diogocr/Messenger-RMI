package messenger.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MessengerServer extends Remote {
    void login(MessengerClient client, String userName) throws RemoteException;
	
    boolean sendMsg(String from, String to, String msg) throws RemoteException;
    
    boolean multicast(String from, String msg) throws RemoteException;
    
	String listUsers(String userName) throws RemoteException;
    
    void logout(String userName) throws RemoteException;
    
    String timer(String userName, int time) throws RemoteException;
} 
