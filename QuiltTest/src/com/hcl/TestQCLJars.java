package com.hcl;

/* TestQCLJars.java */

import java.io.*;
import java.lang.Class;
import java.lang.reflect.*;
import java.net.*;

import org.quilt.cl.QuiltClassLoader;
import org.quilt.cl.RunTest;

import junit.framework.*;

/***
 * At the moment this is identical to TestQuiltClassLoader except that
 * test-data.jar is on the classpath and test-data-classes/ is not.
 * 
 * @author <a href="jddixon@users.sourceforge.net">Jim Dixon</a>
 */
public class TestQCLJars extends TestCase {

	private URL[] cp = null;

	private String[] delegating = {
	// EMPTY -- nothing additional to defaults
	};
	private String[] include = {
	// EMPTY -- nothing being instrumented
	};
	private String[] exclude = { "AnonymousClass", "AnonymousClass2Catches",
			"InnerClass", "NestedTryBlocks", "PrivateClass", "SuperClass",
			"Wimple" };
	private QuiltClassLoader qLoader = null;

	public TestQCLJars(String name) {
		super(name);
	}

	public void setUp() {
		// TAKE CARE NO TERMINATING SLASH (/) ON THE JAR
		File sam1 = new File("target/test-data.jar");
		String fullPath1 = sam1.getAbsolutePath();

		File sam2 = new File("target/classes");
		String fullPath2 = sam2.getAbsolutePath() + "/";
		File sam3 = new File("target/test-classes");
		String fullPath3 = sam3.getAbsolutePath() + "/";
		try {
			// Terminating slash is required.  Relative paths don't
			// work.
			URL[] samples = { new URL("file://" + fullPath1),
					new URL("file://" + fullPath2),
					new URL("file://" + fullPath3) };
			cp = samples;
		} catch (MalformedURLException e) {
			e.printStackTrace();
			fail("problem creating class path");
		}
		qLoader = new QuiltClassLoader(cp,null,include,exclude);
		
	}

	/////////////////////////////////////////////////////////////////
	// AnonymousClass comes from test-data.jar, as does BasicLoad,
	// used in testInvokeTestData 
	// //////////////////////////////////////////////////////////////
	public void testLoader() {
		Class a1 = null;
		Class a2 = null;
		try {
			a1 = qLoader.loadClass("AnonymousClass");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			fail("Error loading AnonymousClass using loadClass");
		}
		try {
			a2 = qLoader.loadClass("AnonymousClass");
		} catch (ClassNotFoundException e) {
			fail("Error loading AnonymousClass using loadClass");
		}
		assertNotNull("qLoader returned null", a1);
		assertNotNull("qLoader returned null", a2);
		assertEquals("second load returned a different class", (Object) a1,
				(Object) a2);
	}

	public void testInvokeTestData() {
		Class a1 = null;
		Class a2 = null;
		try {
			a1 = qLoader.loadClass("AnonymousClass");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			fail("Error loading AnonymousClass using loadClass");
		}
		try {
			a2 = qLoader.loadClass("BasicLoad");
		} catch (ClassNotFoundException e) {
			fail("Error loading BasicLoad using loadClass");
		}
		RunTest rt = null;
		// exercise AnonymousClass ////////////////////////
		try {
			rt = (RunTest) a1.newInstance();
		} catch (InstantiationException e) {
			fail("error instantiating loaded AnonymousClass");
		} catch (IllegalAccessException e) {
			fail("error instantiating loaded AnonymousClass");
		}
		// AnonymousClass.runTest(x) returns x
		assertEquals("AnonymousClass isn't working", 47, rt.runTest(47));

		// exercise BasicLoad ////////////////////////
		try {
			rt = (RunTest) a2.newInstance();
		} catch (InstantiationException e) {
			fail("error instantiating loaded BasicLoad");
		} catch (IllegalAccessException e) {
			fail("error instantiating loaded BasicLoad");
		}
		// BasicLoad.runTest(x) returns x*x
		assertEquals("BasicLoad isn't working", 49, rt.runTest(7));
	}
}
