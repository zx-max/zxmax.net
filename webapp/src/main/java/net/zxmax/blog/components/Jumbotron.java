package net.zxmax.blog.components;

import org.apache.tapestry5.BindingConstants;
import org.apache.tapestry5.ComponentResources;
import org.apache.tapestry5.SymbolConstants;
import org.apache.tapestry5.annotations.Import;
import org.apache.tapestry5.annotations.Parameter;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.ioc.annotations.Inject;
import org.apache.tapestry5.ioc.annotations.Symbol;


/*
 * -->da qui ok<--
 * ---------------
 * se nel file tml metto questo:
 *  <link rel="stylesheet" type="text/css" href="${context:/css/assets/components/jumbotron/jumbotron.css}" />
 *   
 * Le regole relative al body vengono sovrascritte dal file bootstrap.css. 
 * */
@Import(stylesheet="context:/css/assets/components/jumbotron/jumbotron.css")
public class Jumbotron {
	  @Inject
	  private ComponentResources resources;

	  /**
	   * The page title, for the <title> element and the <h1> element.
	   */
	  @Property
	  @Parameter(required = true, defaultPrefix = BindingConstants.LITERAL)
	  private String title;

	  @Property
	  private String pageName;

	  @Property
	  @Inject
	  @Symbol(SymbolConstants.APPLICATION_VERSION)
	  private String appVersion;

	  public String getClassForPageName()
	  {
	    return resources.getPageName().equalsIgnoreCase(pageName)
	        ? "active"
	        : null;
	  }

	  public String[] getPageNames()
	  {
	    return new String[]{"Index", "About", "Contact"};
	  }
}
