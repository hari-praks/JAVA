package javaprogram;

public class cat3question {
	public static void main(String[] args) {
		
		another obj = new another();
		
		obj.setTitle("Alex in wonderland");
	}

	
	abstract class Book
	{
		String title;
		abstract void setTitle(String s);
		String getTitle() {
			return title;
		}
	}
	class another extends Book
	{

		@Override
		void setTitle(String s) {
			System.out.println("title : "+ s);
			
		}
		
	}


}
