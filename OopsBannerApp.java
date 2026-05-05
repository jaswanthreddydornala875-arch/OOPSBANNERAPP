import java.util.HashMap;
import java.util.Map;
public class OopsBannerApp {
    public static Map<Character, String[]> buildPatternMap() {
        Map<Character, String[]> patternMap = new HashMap<>();

        patternMap.put('O', new String[]{
            "  ***  ",
            " ** ** ",
            "**   **",
            "**   **",
            "**   **",
            " ** ** ",
            "  ***  "
        });

        patternMap.put('P', new String[]{
            "****** ",
            "**  ** ",
            "**  ** ",
            "****** ",
            "**     ",
            "**     ",
            "**     "
        });

        patternMap.put('S', new String[]{
            " *****",
            "**    ",
            "**    ",
            " ***  ",
            "    **",
            "    **",
            "*****  "
        });

        patternMap.put(' ', new String[]{
            "   ",
            "   ",
            "   ",
            "   ",
            "   ",
            "   ",
            "   "
        });

        return patternMap;
    }
    public static void displayBanner(String message, Map<Character, String[]> patternMap) {
        int lines = 7;
        for (int line = 0; line < lines; line++) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < message.length(); i++) {
                char ch = message.charAt(i);
                String[] pattern = patternMap.getOrDefault(ch, patternMap.get(' '));
                sb.append(pattern[line]).append("  ");
            }
            System.out.println(sb.toString());
        }
    }
    public static void main(String[] args) {
        Map<Character, String[]> patternMap = buildPatternMap();
        String message = "OOPS";
        displayBanner(message, patternMap);
    }
}