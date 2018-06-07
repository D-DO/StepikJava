public class AsciiCharSequence implements CharSequence {
    String s;
    private final byte[] value;
    private final byte coder;

    static final boolean COMPACT_STRINGS;

    static {
        COMPACT_STRINGS = true;
    }

    public AsciiCharSequence() {
        this.value = "".value;
        this.coder = "".coder;
    }

    public AsciiCharSequence(byte[] bytes) {
        value = bytes;
        //this(bytes, 0, bytes.length);
    }



    @Override
    public int length() {
        return value.length;
    }

    @Override
    public char charAt(int index) {
        if (isLatin1()) {
            return StringLatin1.charAt(value, index);
        } else {
            return StringUTF16.charAt(value, index);
        }
    }

    private boolean isLatin1() {
        return COMPACT_STRINGS && coder == LATIN1;
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return null;
    }
}
