package String;

public class Compress {
    static void main(String[] args) {


        int i = 0, count = 0, write = 0;
        char can = '0';
    char[] chars = {
            'a', 'b', 'b', 'b', 'b', 'b',
            'b', 'b', 'b', 'b', 'b', 'b', 'b'
    };
//        char[] chars = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};

        while (i < chars.length) {
            if (count == 0) {
                chars[write] = chars[i];
                count++;
                write++;
                can = chars[i];

            } else if (can == chars[i]) {
                count++;
                if (i == chars.length - 1) {
                    System.out.println(write);
                    chars[write] = (char) count;
                    write++;

                }
            } else if (can != chars[i]) {

                can = chars[i];
                chars[write] = (char) count;
                write++;
                chars[write] = chars[i];
                write++;
                count = 1;

            }
            i++;
        }
        System.out.println(write);
        System.out.println((char) 12);
        char[] ch = new char[5];
        System.out.println(ch[4] = (char) 12);

    }
}

