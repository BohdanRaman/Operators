package task_8;

/**
 * Show that hex and octal notations work with long values. Use
 * Long.toBinaryString( ) to display the results.
 */
public class HexAndOctalNotations {
    private int hex;
    private int octal;

    public HexAndOctalNotations(int a, int b) {
        this.hex = a;
        this.octal = b;
    }

    public int getHex() {
        return hex;
    }

    public void setHex(int hex) {
        this.hex = hex;
    }

    public int getOctal() {
        return octal;
    }

    public void setOctal(int octal) {
        this.octal = octal;
    }
}
