/**
 * UC7: Store Character Pattern in a Class using Inner Static Class
 * Demonstrates Encapsulation, Modularity and Reusability
 */
public class OOPSBannerApp {

    /**
     * Inner Static Class to encapsulate Character and Pattern
     */
    static class CharacterPatternMap {

        private final char character;
        private final String[] pattern;

        /**
         * Constructor to initialize character and pattern
         * 
         * @param character The letter
         * @param pattern   7-line banner pattern
         */
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /**
         * Getter for character
         * 
         * @return character
         */
        public char getCharacter() {
            return character;
        }

        /**
         * Getter for pattern
         * 
         * @return pattern array
         */
        public String[] getPattern() {
            return pattern;
        }
    }

    /**
     * Utility method to build and print banner
     * 
     * @param word     Word to print
     * @param patterns Array of CharacterPatternMap
     */
    public static void printBanner(String word, CharacterPatternMap[] patterns) {

        for (int row = 0; row < 7; row++) {
            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {
                for (CharacterPatternMap map : patterns) {
                    if (map.getCharacter() == ch) {
                        line.append(map.getPattern()[row]).append(" ");
                    }
                }
            }

            System.out.println(line);
        }
    }

    public static void main(String[] args) {

        String[] O = {
                "  *****  ",
                " *     * ",
                " *     * ",
                " *     * ",
                " *     * ",
                " *     * ",
                "  *****  "
        };

        String[] P = {
                " ******* ",
                " *     * ",
                " *     * ",
                " ******* ",
                " *       ",
                " *       ",
                " *       "
        };

        String[] S = {
                "  ****** ",
                " *       ",
                " *       ",
                "  *****  ",
                "       * ",
                "       * ",
                " ******  "
        };

        CharacterPatternMap[] patterns = {
                new CharacterPatternMap('O', O),
                new CharacterPatternMap('P', P),
                new CharacterPatternMap('S', S)
        };

        printBanner("OOPS", patterns);
    }
}