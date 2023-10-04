package in.mindcraft.SpringApp;

public class Laptop {
private int lid;
private String make;
private double cost;


public Laptop() {
	lid=1;
	make="abc";
	cost=10000;
}

public Laptop(int id,String m,double c) {
	lid=id;
	make=m;
	cost=c;
}


public int getLid() {
	return lid;
}
public void setLid(int lid) {
	this.lid = lid;
}
public String getMake() {
	return make;
}
public void setMake(String make) {
	this.make = make;
}
public double getCost() {
	return cost;
}
public void setCost(double cost) {
	this.cost = cost;
}

	
 public void show() {
 System.out.println(lid+" "+make+" "+cost);
 }
	}


