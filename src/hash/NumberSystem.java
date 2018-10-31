package hash;

public class NumberSystem {

    public int Binary2Int(String binary)
    {
        return Integer.parseInt(binary, 2);
    }

    public String Int2Binary(int number)
    {
        return Integer.toBinaryString(number);
    }
}
