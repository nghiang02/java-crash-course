package string;

public class MaskEmail {
    private static final int MAX_MASK_LENGTH = 5;
    public static boolean isValidEmail(String email) {

        if (email == null || email.isBlank()) return false;
        int indexOfAt = email.indexOf('@');
        int lastIndexOfAt = email.lastIndexOf('@');
        return indexOfAt != -1 && indexOfAt != 0 && indexOfAt != email.length() - 1 && lastIndexOfAt == indexOfAt;
    }

    public static String maskEmail(String email) {
        String trimmed = email == null ? "" : email.strip();
        if (!isValidEmail(trimmed)) throw new IllegalArgumentException("Invalid Email");
        int indexOfAt = trimmed.indexOf('@');
        String local = trimmed.substring(0, indexOfAt);
        String domain = trimmed.substring(indexOfAt + 1);
        int maskLength = Math.min(local.length() - 1, MAX_MASK_LENGTH);
        return local.charAt(0) + "*".repeat(maskLength) + "@" + domain;
    }

    public static void test(String email) {
        try {
            System.out.println("[" + maskEmail(email) + "]");
        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName());
        }
    }

    public static void main(String[] args) {
        test("nghiatrungnghia.dev@gmail.com");
        test("antrung@yahoo.com");
        test("a@x.com");
        test("nghia.gmail.com");
        test("@gmail.com");
        test("nghia@");
        test("a@b@gmail.com");
        test(null);
        test("   ");
        test(" @gmail.com");
        test("nghia@ ");
    }
}
