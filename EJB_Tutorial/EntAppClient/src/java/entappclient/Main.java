
package entappclient;

import ejb.MySessionRemote;
import javax.ejb.EJB;

/**
 * @author Nathaniel Snow - 12060962 (CQUniversity)
 */
public class Main {

    @EJB
    private static MySessionRemote mySession;

    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.err.println("result = " + mySession.getResult());
    }

}
