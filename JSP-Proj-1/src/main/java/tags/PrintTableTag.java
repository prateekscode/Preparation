package tags;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class PrintTableTag extends TagSupport {

	public int number;
	public String color;
	

	public void setColor(String color) {
		this.color = color;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public int doStartTag() throws JspException {

		try {
			JspWriter out = pageContext.getOut();
			
			out.println("<div style='color: "+color+"'>");
			out.println("</br>");
			// Print table
			out.println("<h1>Table of the number "+number+" is ---</h1>");
			for (int i = 1; i <= 10; i++) {
				out.println("<h1>"+number + " x " + i +"="+ (number * i)+"</h1>");
			}
			out.println("</div>");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return SKIP_BODY;
	}
}
