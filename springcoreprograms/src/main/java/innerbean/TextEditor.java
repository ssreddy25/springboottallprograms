package innerbean;

public class TextEditor {
	
	private Spellcheker spellcheker;

	public TextEditor() {
		
		System.out.println("texteditor");
		
	}

	public Spellcheker getSpellcheker() {
		return spellcheker;
	}

	public void setSpellcheker(Spellcheker spellcheker) {
		this.spellcheker = spellcheker;
	}
	
	public void textEditor(){
		spellcheker.spellcher();
	}

	
	
	

}
