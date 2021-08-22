package ejb;

import javax.ejb.Remote;

/**
 *
 * @author Nathaniel Snow - 12060962 (CQUniversity)
 */
@Remote
public interface MySessionRemote {
    public String getResult();
}
