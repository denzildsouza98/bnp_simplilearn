package override_objectclass;

public class Player {

	private int id;
	private String name;
	
	public Player() {
		// TODO Auto-generated constructor stub
	}

	public Player(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + "]";
	}
	
	@Override
	public boolean equals(Object o) {//implicit
		boolean b=false;
		Player p=(Player)o;//explicit
		if(p.id==this.id) {
			b=true;
		}
		return b;
	}
	
}
