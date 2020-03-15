package com.company;

import static com.company.list.area;

public class Main {

    public static void main(String[] args) {
	Point3D a = new Point3D();
	Point3D b = new Point3D (2,2,2);
	System.out.println(a.Compare(b));
	System.out.printf("%.2f", a.distanceTo(b));
	System.out.printf("%.2f", area());

    }
}
