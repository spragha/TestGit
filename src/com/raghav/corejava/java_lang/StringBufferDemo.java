package com.raghav.corejava.java_lang;

public class StringBufferDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("StringBuffer Demo");
		StringBuffer sb=new StringBuffer("abc");
		sb.append("def").reverse();
		System.out.println(sb);
		sb.insert(2, ">>>>>");
		System.out.println(sb);
		int i=20;
		StringBufferDemo strb=new StringBufferDemo();
		System.out.println(strb);
}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "StringBufferDemo "
				+ ", "
				+ (super.toString() != null ? "toString()=" + super.toString()
						: "") + "]";
	}
}