/*
 * Copyright (c) 2002-2006 by OpenSymphony
 * All rights reserved.
 */
package com.opensymphony.webwork.dispatcher;

import java.util.Locale;

import org.springframework.mock.web.MockServletContext;

import com.opensymphony.xwork.util.LocalizedTextUtil;

import junit.framework.TestCase;

/**
 * Test case for DispatcherUtils.
 * 
 * @author tm_jee
 * @version $Date: 2006/03/22 21:01:05 $ $Id: DispatcherUtilsTest.java,v 1.2 2006/03/22 21:01:05 davsclaus Exp $
 */
public class DispatcherUtilsTest extends TestCase {

	public void testDefaultResurceBundlePropertyLoaded() throws Exception {
        Locale.setDefault(Locale.US); // force to US locale as we also have _de and _da properties
        DispatcherUtils.initialize(new MockServletContext());
		
		// some i18n messages from xwork-messages.properties
		assertEquals(
				LocalizedTextUtil.findDefaultText("xwork.error.action.execution", Locale.US), 
				"Error during Action invocation");
		
		// some i18n messages from webwork-messages.properties
		assertEquals(
				LocalizedTextUtil.findDefaultText("webwork.messages.error.uploading", Locale.US, 
						new Object[] { "some error messages" }), 
				"Error uploading: some error messages");
	}
	
}
