// dodać interpunkcje
// naprawić zbyt duże whitespaces

public class Zadanie3 {
    public static void main(String[] args) {
        System.out.println(generateLoremIpsum(50));
    }

    public static String generateLoremIpsum(int words){
        String loremIpsumDemo = """
                Lorem ipsum dolor sit amet, consectetur adipiscing elit, 
                sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. 
                Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris 
                nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in 
                reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. 
                Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.
                """;

        String[] loremIpsumDemoArray = loremIpsumDemo.split("\\s+|\n|\\.|,");

        String[] loremIpsum = new String[words + 1];
        for (int i = 0; i < words; i++) {
            if ( i < 5 ) {
                loremIpsum[i] = loremIpsumDemoArray[i];
            }  else {
                int randomInt = getRandomNumber(words - 1);
                loremIpsum[i] = loremIpsumDemoArray[randomInt];
            }
        }
        loremIpsum[words] = ".";

        return new String(String.join(" ", loremIpsum));
    }
    public static int getRandomNumber(int max) {
        int min = 0;
        return (int) ((Math.random() * (max - min)) + min);
    }
}
