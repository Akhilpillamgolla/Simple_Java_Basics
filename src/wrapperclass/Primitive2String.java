package wrapperclass;

public class Primitive2String {

	byte x = 100;

	String s = Byte.toString(x); // primitive to String

	byte y = Byte.parseByte(s); // String to primitive
}
