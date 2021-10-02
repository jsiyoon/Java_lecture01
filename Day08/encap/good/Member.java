package encap.good;

public class Member {
	
	private String id;
	private String pw;
	private String name;
	private String email;
	private String addr;
	private int phone;
	private int age;
	
	//기본 생성자 : ctrl + space + enter
	public Member() {
		
	}
	
	//생성자를 한번에
	//alt + shift + s	
	public Member(String id, String pw, String name, String email, String addr, int phone, int age) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.email = email;
		this.addr = addr;
		this.phone = phone;
		this.age = age;
	}
	
	//getter, setter의 자동완성
	//alt + shift + s
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}	
}
