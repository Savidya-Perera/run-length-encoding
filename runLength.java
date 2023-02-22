public class runLength
{
    public static float calRatio(int lenOri, int lenEnc)
    {
        return lenOri/(float) lenEnc;
    }
    public static void repeatCheck(String text)
    {
        String encoded = "";
        int count = 0;
        int length = text.length();
        for(int i=0; i<length-1; i++)
        {
            if(text.charAt(i) == text.charAt(i+1))
            {
                count ++;
            }
            else
            {
                encoded += text.charAt(i);
                if(count != 0)
                {
                    encoded += count;
                }
                count = 0;

            }
        }
        if(text.charAt(length-1) != text.charAt(length-2))
        {
            encoded += text.charAt(length-1);
            if(count != 0)
            {
                encoded += count;
            }
        }

        System.out.println("Compressed test: "+ encoded + "\nComprestion ratio: " + calRatio(length, encoded.length()));

    }
    public static void main(String args[])
    {
        String text = "aaaabcsdsssdere";
        repeatCheck(text);

    }
}
