package com.javaInterview.oops.inheritance.homeA;

public class InheritenceTest {

	public static void main(String[] args) {

		HomeA_MOTHER homeAMotherRefChild1Obj = new HomeA_CHILD1(); // Polymorphic
																	// way of
																	// calling...
		homeAMotherRefChild1Obj.homeADoMethod(); // overridden method gets
													// called..

		// protected method access
		homeAMotherRefChild1Obj.homeAMotherAgeMethod();
		new HomeA_CHILD2().homeAChild2Method();

		homeAMotherRefChild1Obj.homeADoMethod("Sleeping");

		HomeA_CHILD1 homeAChild1 = new HomeA_CHILD1();
		homeAChild1.homeADoMethod("playing");

		HomeA_MOTHER homeAMother2 = new HomeA_MOTHER();
		homeAMother2 = homeAChild1; // upcast with no explicit cast
		HomeA_MOTHER homeAMother3 = (HomeA_MOTHER) homeAChild1; // upcast with an
																// explicit cast

		// homeAChild1 = homeAMother2; //cannot cast parent to child
		homeAChild1 = (HomeA_CHILD1) homeAMotherRefChild1Obj; // downcast
		homeAMother2.homeADoMethod("playing");

		new HomeA_CHILD2().homeAChild2Method();

	}

}
