public class NumberToWords {

	static final String[] units = { "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
			"Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen" };

	static final String[] tens = { "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty",
			"Ninety" };

	public static String convert(int num) {
		if (num < 20)
			return units[num];
		else if (num < 100)
			return tens[num / 10] + (num % 10 != 0 ? " " + units[num % 10] : "");
		else if (num == 100)
			return "One Hundred";
		return "";
	}

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + " : " + convert(i));
		}
	}
}
