package main.java.liasd.asadera.exception;

public class NoDocumentToProcessIDFException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7791132544658713441L;

	public NoDocumentToProcessIDFException() {
		super("NbDocument = 0. Can't process IDF.");
	}
}
