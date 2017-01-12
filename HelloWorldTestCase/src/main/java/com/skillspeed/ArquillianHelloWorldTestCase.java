package com.skillspeed;

import java.io.File;
import java.io.IOException;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.jsfunit.api.InitialPage;
import org.jboss.jsfunit.jsfsession.JSFClientSession;
import org.jboss.jsfunit.jsfsession.JSFServerSession;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;

@RunWith(Arquillian.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ArquillianHelloWorldTestCase {

	@Deployment
	public static WebArchive createDeployment() {

		// Create a WAR (Micro deployment) with a given name called
		// helloworld.war
		WebArchive webArchive = ShrinkWrap.create(WebArchive.class,
				"helloworld.war");

		// Set web.xml inside created micro WAR
		webArchive.setWebXML(new File("src/main/webapp/WEB-INF/web.xml"));

		// Add classes
		webArchive.addPackage("com.journaldev.jsf.helloworld");

		// Add web resource
		webArchive.addAsWebResource(new File("src/main/webapp","helloWorld.xhtml"));

		// Add faces-config.xml as a web-inf resource
		webArchive.addAsWebInfResource(new File("src/main/webapp/WEB-INF/faces-config.xml"),"faces-config.xml");

		// Add required libraries
		webArchive.addAsLibrary(new File("C:/Users/mohammad.amr/.m2/repository/com/sun/faces/jsf-impl/2.1.13/jsf-impl-2.1.13.jar"));
		webArchive.addAsLibrary(new File("C:/Users/mohammad.amr/.m2/repository/com/sun/faces/jsf-api/2.1.13/jsf-api-2.1.13.jar"));
		webArchive.addAsLibrary(new File("C:/Users/mohammad.amr/.m2/repository/jstl/jstl/1.2/jstl-1.2.jar"));

		// return the deployment
		return webArchive;
	}

	@Test
	@InitialPage("/faces/helloWorld.xhtml")
	public void testInitialPage(JSFServerSession server, JSFClientSession client)
			throws IOException {

		// Test navigation to initial viewID
		Assert.assertEquals("/helloWorld.xhtml", server.getCurrentViewID());

	}
	
	@Test
	@InitialPage("/faces/helloWorld.xhtml")
	public void testHelloWorldBeanNotNull(JSFServerSession server, JSFClientSession client){
		
		// Test if Managed Bean is null
		Assert.assertNotNull(server.getFacesContext().getExternalContext().getSessionMap().get("helloWorld"));
	}
	
	@Test
	@InitialPage("/faces/helloWorld.xhtml")
	public void testS1Value(JSFServerSession server, JSFClientSession client){
		
		// Test if Managed Bean is null
		Assert.assertEquals("Hello World!!",server.getManagedBeanValue("#{helloWorld.s1}"));
	}	
}
