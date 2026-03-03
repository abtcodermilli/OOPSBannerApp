import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {

    /**
     * Utility method to build character pattern map
     */
    public static Map<Character, String[]> buildCharacterMap() {

        Map<Character, String[]> bannerMap = new HashMap<>();

        bannerMap.put('O', new String[] {
                "  *****  ",
                " *     * ",
                " *     * ",
                " *     * ",
                " *     * ",
                " *     * ",
                "  *****  "
        });

        bannerMap.put('P', new String[] {
                " ******* ",
                " *     * ",
                " *     * ",
                " ******* ",
                " *       ",
                " *       ",
                " *       "
        });

        bannerMap.put('S', new String[] {
                "  ****** ",
                " *       ",
                " *       ",
                "  *****  ",
                "       * ",
                "       * ",
                " ******  "
        });

        return bannerMap;
    }

    /**
     * Utility method to print banner
     */
    public static void printBanner(String word, Map<Character, String[]> bannerMap) {

        for (int row = 0; row < 7; row++) {

            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {
                String[] pattern = bannerMap.get(ch);
                if (pattern != null) {
                    line.append(pattern[row]).append(" ");
                }
            }

            System.out.println(line);
        }
    }

    public static void main(String[] args) {

        Map<Character, String[]> bannerMap = buildCharacterMap();
        printBanner("OOPS", bannerMap);
    }
}
// code is completed
