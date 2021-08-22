package ejb;

import javax.ejb.Stateless;

/**
 *
 * @author Nathaniel Snow - 12060962 (CQUniversity)
 */
@Stateless
public class MySession implements MySessionRemote {

    public String getResult() {
        return "This is My Session Bean";
    }
}
