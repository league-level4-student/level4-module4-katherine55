package _01_introduction_to_encapsulation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/*
 * Encapsulation is a way of protecting the data in a class from being
 * unintentionally altered from another class.
 * 
 * To encapsulate a member variable, follow these three steps:
 * 
 * 1. Make the member variable private (or protected)
 * 
 * 2. Make a getter and setter method (accessor and mutator) for the variable.
 * 
 * 3. Add restrictions to the setter method so the member variable cannot be 
 * 	  adversely altered
 * 
 * */


public class EncapsulateTheData {
	//1. Encapsulate the member variables.
	//   Add restrictions to the setters according to the comment.
	
	//2. Create a new JUnit Test case and write tests to verify that 
	//   the member variables' getters and setters are working
	
	private int itemsReceived; //must not be negative. All negative arguments get set to 0.
	private float degreesMcTurned; //must be locked between 0.0 and 360.0 inclusive.
	private String nomenclature = " "; //must not be set to a blank string. Blank Strings get set to a space
	private Object memberObj; //can be any object type except String. Strings get turned into objects.
	
	public static void main(String[] args) {
		
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void test() {
		setItemsReceived(-1);
		assertEquals(getItemsReceived(), 0);
		setDegreesMcTurned(361);
		assertEquals(getDegreesMcTurned(), 1, 0.01);
		setNomenclature("");
		assertEquals(getNomenclature(), " ");
		setMemberObj("jonny");
		assertTrue(getMemberObj() instanceof Object);
	}
	
	int getItemsReceived() {
		return this.itemsReceived;
	}
	
	void setItemsReceived(int num) {
		if(num < 0) {
			num = 0;
		}
		this.itemsReceived = num;
	}
	
	float getDegreesMcTurned() {
		return this.degreesMcTurned;
	}
	
	void setDegreesMcTurned(float degrees) {
		if(degrees >= 0 && degrees <= 360) {
			this.degreesMcTurned = degrees;
		}
		else if(degrees > 360) {
			this.degreesMcTurned = degrees - 360;
		}
		else if(degrees < 0) {
			this.degreesMcTurned = 360 + degrees;
		}	
	}
	
	String getNomenclature() {
		return this.nomenclature;
	}
	
	void setNomenclature(String space) {
		if(space.length() == 0) {
			space = " ";
		}
		this.nomenclature = space;
	}
	
	Object getMemberObj() {
		return this.memberObj;
	}
	
	void setMemberObj(Object bobbby) {
		if(bobbby instanceof String) {
			bobbby = (Object) bobbby;
		}
		this.memberObj = bobbby;
	}
}
