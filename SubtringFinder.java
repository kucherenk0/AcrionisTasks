import java.io.InputStreamReader;

public class SubstringFinder {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("SubstringFind: Input args is empty\nusage: java SubstringFind [PATTERN]");
            System.exit(1);
        }
        try {
            StringBuilder builder = new StringBuilder();
            for (String s : args) {
                builder.append(s);
            }
            String needle = builder.toString();
            int result = findAndSubstitute(needle);
            System.exit(result);
        } catch (Throwable e) {
            System.out.println(e.getMessage());
            System.exit(-1);

        }

    }

    public static int findAndSubstitute(String needle) throws Throwable {
        if (needle == null) {
            return -1;
        }
        int len = needle.length();
        try (InputStreamReader in = new InputStreamReader(System.in)) {
            while (true) {
                for (int i = 0; i < len; i++) {
                    int charIn = in.read();

                    if (charIn == -1) {
                        return 0;
                    }

                    char nextChar = (char) (charIn);
                    System.out.print(nextChar);

                    if (needle.charAt(i) != nextChar) {
                        if (nextChar == needle.charAt(0)) {
                            i = 0;
                            continue;
                        } else {
                            break;
                        }
                    }

                    if (i == needle.length() - 1) {
                        System.out.print("*");
                    }
                }
            }
        }
    }
}
