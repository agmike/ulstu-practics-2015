package t2.a_cpp_java;

import java.util.Scanner;
import java.util.regex.Pattern;

public class solver {
    public static void main(String[] args) {
        System.out.print(solve(new Scanner(System.in)));
    }

    public static String solve(Scanner in) {
        String ident = in.next();

        if (ident.contains("_")) {
            String[] parts = ident.split("_");
            StringBuilder out = new StringBuilder();
            out.append(parts[0]);
            for (int i = 1; i < parts.length; i++) {
                out.append(Character.toUpperCase(parts[i].charAt(0)));
                out.append(parts[i].substring(1));
            }
            return out.toString();
        } else if (Pattern.compile("[A-Z]").matcher(ident).find()) {
            StringBuilder out = new StringBuilder();
            for (int i = 0; i < ident.length(); i++) {
                if (Character.isUpperCase(ident.charAt(i))) {
                    out.append('_');
                    out.append(Character.toLowerCase(ident.charAt(i)));
                } else {
                    out.append(ident.charAt(i));
                }
            }
            return out.toString();
        } else {
            return ident;
        }
    }
}
