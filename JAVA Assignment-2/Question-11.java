class Num {
    int number;

    public Num(int num) {
        number = num;
    }

    public void showNum() {
        System.out.println("Number: " + number);
    }
}

class HexNum extends Num {
    public HexNum(int num) {
        super(num);
    }

    @Override
    public void showNum() {
        System.out.println("Hexadecimal: " + Integer.toHexString(number));
        System.out.println("Octal: " + Integer.toOctalString(number));
    }
}

public class HexNumDemo {
    public static void main(String[] args) {
        HexNum hexNum = new HexNum(100);
        hexNum.showNum();
    }
}
