// Iris Larsen
// Sara J. Johnson
// Tim Woods
// Wyatt Chapman

public class Checker {
    int ID;
    String color;
    String type;
    String location;

    public Checker(int i, String c, String t, String l) {
	this.ID = i;
	this.color = c;
	this.type = t;
	this.location = l;
    }

    public int getID() {
	return this.ID;
    }

    public String getColor() {
	return this.color;
    }

    public String getType() {
	return this.type;
    }

    public void setType(String newt) {
	this.type = newt;
    }

    public String getLocation() {
	return this.location;
    }

    public void setLocation(String newl) {
	this.location = newl;
    }
}