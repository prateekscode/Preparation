package tags;

import java.util.Date;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class TagHandler extends TagSupport{
@Override
public int doStartTag() throws JspException {
	
	try {
		//task..
		JspWriter out=pageContext.getOut();
		out.println("<h1>This is my Custom Tag</h1>");
		out.println("<h1>Date : "+new Date().toString()+"</h1>");
		
	}catch (Exception e) {
		e.printStackTrace();
	}
	
	return SKIP_BODY;
} 
}
