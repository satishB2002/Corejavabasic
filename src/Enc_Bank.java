import java.util.jar.Attributes.Name;

import String.intern_method;

public class Enc_Bank {
private String name;
private String accno;
private int	deposit;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAccno() {
	return accno;
}
public void setAccno(String accno) {
	this.accno = accno;
}
public int getDeposit() {
	return deposit;
}
public void setDeposit(int deposit) {
	this.deposit = deposit;
}
public Enc_Bank(String name, String accno, int deposit) {
	super();
	this.name = name;
	this.accno = accno;
	this.deposit = deposit;
}



}
