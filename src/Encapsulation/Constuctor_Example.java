package Encapsulation;

public class Constuctor_Example {

	private int id;
	@Override
	public String toString() {
		return  "Id ="+id + "  , name="  + name + "";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	private String name;
	 
	public Constuctor_Example(int id, String name) {
		super();
		this.setId(id);
		System.out.println();
	}

	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	

	
}
