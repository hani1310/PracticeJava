import javax.swing.text.StyledEditorKit.ForegroundAction;

public class StringReverse {

	public static void main(String[] args) {

		String stringInput = "welcome";
		char[] Reversearray = stringInput.toCharArray();

		for (int i = Reversearray.length - 1; i >= 0; i--) {
			System.out.println(Reversearray[i]);
		}
	}
}