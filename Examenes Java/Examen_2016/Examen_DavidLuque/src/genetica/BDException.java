package genetica;

public class BDException extends RuntimeException 
{
	private static final long serialVersionUID = 5365056309038157314L;

	public BDException()
	{
		super();
	}

	public BDException(String msg)
	{
		super(msg);
	}
	
	public BDException(String msg, Throwable cause) {
		super(msg, cause);
	}
}
