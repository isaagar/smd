/*
    Title: Java program to perform 64-bits numbers multiplication using memorymapped files and utility classes
    */




import java.util.*;
import java.io.*;
import java.nio.*;
import java.nio.channels.*;

class Multiplication64Bits{

    /* converting string to digits    */
    private static byte[] stringToDigits(String num) {
        byte[] result = new byte[num.length()];
        for (int i = 0; i < num.length(); i++) {
            char c = num.charAt(i);
            if (c < '0' || c > '9') {
                throw new IllegalArgumentException("Invalid digit " + c
                        + " found at position " + i);
            }
            result[num.length() - 1 - i] = (byte) (c - '0');
        }
        return result;
    }
	/* Deinition of longmult()    */
    public static String longMult(String num1, String num2) {
        byte[] left = stringToDigits(num1);
        byte[] right = stringToDigits(num2);
        byte[] result = new byte[left.length + right.length];
        for (int rightPos = 0; rightPos < right.length; rightPos++) {
            byte rightDigit = right[rightPos];
            byte temp = 0;
            for (int leftPos = 0; leftPos < left.length; leftPos++) {
                temp += result[leftPos + rightPos];
                temp += rightDigit * left[leftPos];
                result[leftPos + rightPos] = (byte) (temp % 10);
                temp /= 10;
            }
            int destPos = rightPos + left.length;
            while (temp != 0) {
                temp += result[destPos] & 0xFFFFFFFFL;
                result[destPos] = (byte) (temp % 10);
                temp /= 10;
                destPos++;
            }
        }
        StringBuilder stringResultBuilder = new StringBuilder(result.length);
        for (int i = result.length - 1; i >= 0; i--) {
            byte digit = result[i];
            if (digit != 0 || stringResultBuilder.length() > 0) {
                stringResultBuilder.append((char) (digit + '0'));
            }
        }
        return stringResultBuilder.toString();
    }
    public static void main(String args[]) throws Exception{
        Scanner scan = new Scanner(System.in);       
        System.out.println("Enter First Multiplier ");   
       
        String input1 = scan.nextLine();
	System.out.println("Enter Second Multiplier ");   
      
        String input2 = scan.nextLine();

        BufferedWriter writer = new BufferedWriter(new FileWriter("InputFile")); // InputFile is file which holds multiplier
        writer.write(input1);
	writer.write(input2);
        writer.close(); 
	// Reading from memorymapped files

        File file = new File("InputFile");
        FileChannel fc = new RandomAccessFile(file, "rw").getChannel();
        ByteBuffer bb1 = fc.map(FileChannel.MapMode.READ_ONLY, 0, (int)fc.size());

	int count=0;
	
	
        String num1 = null,num2=null;
	
        String token1,token2, multiplier1, multiplier2;
        char ch;       

        while (bb1.hasRemaining()) {
            ch = (char) bb1.get();
	if(count<input1.length())
            {num1 = num1 + ch;}
	else
	    {num2=num2+ch;}
	count++;

        }
       	token1  = num1.substring(4);
        token2  = num2.substring(4);
        multiplier1 = token1;
	multiplier2= token2; 
        
        System.out.println("Final Result: " + longMult(multiplier1,multiplier2)); //calling longmult function
    }
}

/*
        OUTPUT
	[ccoew@localhost 4342]$ javac mul64.java
	[ccoew@localhost 4342]$ java Multiplication64Bits
	Enter First Multiplier 
	30000000000000000000
	Enter Second Multiplier 
	1111111111111111111
	Final Result: 33333333333333333330000000000000000000
	[ccoew@localhost 4342]$ 


*/  

