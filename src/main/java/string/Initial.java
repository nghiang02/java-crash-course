package string;

public class Initial {
    public static String initials(String fullName) {
        if (fullName == null || fullName.isBlank()) return "";

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < fullName.length(); i++) {
            char c = fullName.charAt(i);
            if (!Character.isWhitespace(c) && (i == 0 || Character.isWhitespace(fullName.charAt(i - 1)))) {
                result.append(Character.toUpperCase(c));
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println("[" + initials("  nguyen   van an  ") + "]");
        System.out.println("[" + initials("nguyen van an") + "]");
        System.out.println("[" + initials("an") + "]");
        System.out.println("[" + initials("   ") + "]");
        System.out.println("[" + initials(null) + "]");
    }
}
