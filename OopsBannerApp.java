public class OopsBannerApp {

    static class CharacterPatternMap {
        private Character character;
        private String[] pattern;
        public CharacterPatternMap(Character character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }
        public Character getCharacter() {
            return character;
        }
        public String[] getPattern() {
            return pattern;
        }
    }
    public static CharacterPatternMap[] createCharacterPatternMaps() {
        CharacterPatternMap[] charMaps = new CharacterPatternMap[4];

        charMaps[0] = new CharacterPatternMap('O', new String[]{
            "  ***  ",
            " ** ** ",
            "**   **",
            "**   **",
            "**   **",
            " ** ** ",
            "  ***  "
        });

        charMaps[1] = new CharacterPatternMap('P', new String[]{
            "****** ",
            "**  ** ",
            "**  ** ",
            "****** ",
            "**     ",
            "**     ",
            "**     "
        });

        charMaps[2] = new CharacterPatternMap('S', new String[]{
            " *****",
            "**    ",
            "**    ",
            " ***  ",
            "    **",
            "    **",
            "*****  "
        });

        charMaps[3] = new CharacterPatternMap(' ', new String[]{
            "   ",
            "   ",
            "   ",
            "   ",
            "   ",
            "   ",
            "   "
        });

        return charMaps;
    }
    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] charMaps) {
        for (CharacterPatternMap map : charMaps) {
            if (map.getCharacter() == ch) {
                return map.getPattern();
            }
        }
        return getCharacterPattern(' ', charMaps);
    }
    public static void printMessage(String message, CharacterPatternMap[] charMaps) {
        int lines = 7;
        for (int line = 0; line < lines; line++) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < message.length(); i++) {
                String[] pattern = getCharacterPattern(message.charAt(i), charMaps);
                sb.append(pattern[line]).append("  ");
            }
            System.out.println(sb.toString());
        }
    }
    public static void main(String[] args) {
        CharacterPatternMap[] charMaps = createCharacterPatternMaps();
        String message = "OOPS";
        printMessage(message, charMaps);
    }
}
