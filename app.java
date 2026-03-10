public class VowelConsonant {

    public static void main(String[] args) {

        char ch = 'z';

        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + " is vowel");
                break;
            default:
                System.out.println(ch + " is consonant");
        }
    }
}


public class Main {

  public static void main(String[] args) {

    int count = 0, num = 0003452;

    while (num != 0) {
      // num = num/10
      num /= 10;
      ++count;
    }

    System.out.println("Number of digits: " + count);
  }
}
