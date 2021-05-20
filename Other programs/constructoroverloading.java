
public class constructoroverloading {

	public static void main(String[] args) {
		someclass s = new someclass();
		someclass s2=new someclass("hari","19BIT0283");
		someclass s3 = new someclass("prakash","19BEC0222");
		someclass d = new someclass();
	}
}
class someclass{
	String name;
	String regno;
	//this is a constructor
	//constructor name==class name
	//no return type shd be mentioned in creating constructor
	public someclass()
	{
		name="somename";
		regno="19BIT____";
		System.out.println("name is: "+name+"	regno is: "+regno);
	}
	public someclass(String iname,String iregno)
	{
		this.name=iname;
		this.regno=iregno;
		System.out.println("name is: "+name+"	regno is: "+regno);
	}

}