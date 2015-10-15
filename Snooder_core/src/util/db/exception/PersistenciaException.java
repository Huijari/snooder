/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util.db.exception;

/**
 *
 * @author pernambucanas
 */
public class PersistenciaException extends Exception {
	private static final long	serialVersionUID	= -1213452568973563011L;

	public PersistenciaException(String msg, Exception exception) {
        super(msg, exception);
    }

    public PersistenciaException(String msg) {
        super(msg);
    }
}
