import java.io.InputStreamReader;
import java.io.IOException;

public class SubtringFind{

    public static void main(String[] args)  {
        if (args.length == 0) {
            System.out.println("Input args is empty");
            System.exit(1);
        }

        StringBuilder builder = new StringBuilder();
        for (String s : args) {
            builder.append(s);
        }
        String needle = builder.toString();
        findAndSubstitude(needle);
    }

    public static void findAndSubstitude(String needle) {
        InputStreamReader in = new InputStreamReader(System.in);
        boolean keep_going = true;

        while (keep_going) {
            for (int i = 0; i < needle.length(); ++i) {
                int char_in;
                try {
                    char_in = in.read();
                } catch (IOException e) {
                    keep_going = false;
                    break;
                }

                if (char_in == -1) {
                    keep_going = false;
                    break;
                }

                char nextChar = (char) (char_in);
                System.out.print(nextChar);
                if (needle.charAt(i) != nextChar) {
                    break;
                }

                if (i == needle.length() - 1) {
                    System.out.print("*");
                }
            }
        }
    }
}
