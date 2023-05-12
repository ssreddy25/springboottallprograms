package innerbean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TextEditorMain {

	public static void main(String[] args) {
		
		
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("innerbean.xml");
		
		TextEditor editor=applicationContext.getBean(TextEditor.class);
		
		editor.textEditor();
		
	}

}
