package methodrefences;


interface Messageable{
	void getMessage(String msg);
}
class Message{
	Message(String msg){
		System.out.print(msg);
	}
}
public class  ConstructorRefernce{
	public static void main(String[] args) {
		Messageable hello = Message::new;
		hello.getMessage("Hello");
	}
}