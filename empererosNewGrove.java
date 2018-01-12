package apCompSci;
import java.util.ArrayList;
import java.util.Arrays;
public class empererosNewGrove {
	public static void main(String[]args) {
		ArrayList<String> emperorCast = new ArrayList<String>();
		emperorCast.addAll(Arrays.asList("Kuzco", "Pacha", "Yzma", "Kronk"));
		System.out.println("Original Array List: " + emperorCast);
		emperorCast.clear();
		emperorCast.addAll(Arrays.asList("Kuzco", "Yzma", "Chaca", "Tipo", "Kronk", "Bucky", "Pacha"));
		System.out.println("Altered Array List: " + emperorCast);
	}
}
