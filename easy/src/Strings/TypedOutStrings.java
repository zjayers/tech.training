package Strings;

import java.util.Stack;

public class TypedOutStrings {
    public static boolean compare(String a, String b) {

        if (a.equals(b)) return true;

        Stack<String> finalContentsA = new Stack<>();
        Stack<String> finalContentsB = new Stack<>();

        parseAndPop(a, finalContentsA);
        parseAndPop(b, finalContentsB);

        return finalContentsA.equals(finalContentsB);
    }

    private static void parseAndPop(String str, Stack<String> finalContents) {
        for (char c : str.toCharArray()) {
            if (c == '#') {
                if (!finalContents.isEmpty()) {
                    finalContents.pop();
                }
            } else {
                finalContents.push(String.valueOf(c));
            }
        }
    }
}
