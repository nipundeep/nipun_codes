
public class Rectangle {
	int length;
	int breadth;    //local variables
	  //constructor to initialize the length and breadth
	
	Rectangle(int l, int b){
		length=l;
		breadth=b;
	}
	Rectangle(Rectangle r){
		System.out.println("copy consructor invoked");
		length=r.length;
        breadth=r.breadth;
	}
	
	//method to calculate the area
	
	int area() {
		return (length*breadth);
		
	}

	
	
	
	}

