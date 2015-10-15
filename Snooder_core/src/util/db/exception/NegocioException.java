/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util.db.exception;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pernambucanas
 */
public class NegocioException extends Exception {
	private static final long	serialVersionUID	= 6589096117127367891L;
	
	private List<String> msgs;
    
    public NegocioException() {
        this.msgs = new ArrayList<String>();
    }
    
    public NegocioException(String msg, Exception exception) {
        super(msg, exception);
    }

    public NegocioException(String msg) {
        super(msg);
    }
    
    public NegocioException(List<String> msgs) {
        this.msgs = msgs;
    }
    
    public List<String> getMessages() {
        return this.msgs;
    }
}
