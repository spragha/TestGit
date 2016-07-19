package com.raghav.corejava.progs.math;

public class FindAngle {

	public static void main(String[] args) {
		System.out.println(angle(0,30));

	}
	static double angle(int h, int m) {
	    double hAngle = 0.5D * (h * 60 + m);
	    double mAngle = 6 * m;
	    double angle = Math.abs(hAngle - mAngle);
	    angle = Math.min(angle, 360 - angle);
	    return angle;
	}

}
