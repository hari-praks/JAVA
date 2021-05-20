package javaprogram;
import java.sql.SQLException;
public class ExceptionChaining {

	public static void main(String[] args) throws Throwable {
		try {
			throw new ArithmeticException("divideBYzero").initCause(new SQLException("Didn't fetch data"));
		}
		catch(ArithmeticException a)
		{
			System.out.println(a.getMessage());
			System.out.println(a.getCause());
		}

	}

}
