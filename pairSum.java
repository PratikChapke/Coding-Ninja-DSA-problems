import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Runner {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static int[] takeInput() throws IOException {
        int size = Integer.parseInt(br.readLine().trim());
        int[] input = new int[size];

        if (size == 0) {
            return input;
        }
        
        String[] strNums; 
        strNums = br.readLine().split("\\s");
        

        for (int i = 0; i < size; ++i) {
            input[i] = Integer.parseInt(strNums[i]);
        }

        return input;
    }


    public static void main(String[] args) throws NumberFormatException, IOException {
        int t = Integer.parseInt(br.readLine().trim());

        while(t > 0) {

            int[] input = takeInput();
            int x = Integer.parseInt(br.readLine().trim());
            System.out.println(Solution.pairSum(input, x));

            t -= 1;
        }
    }
}

public class Solution {  

    public static int pairSum(int input[], int x) {
        int count=0;
    	for(int i=0;i<input.length;i++)
{
    int temp=input[i];
    for(int j=i+1;j<input.length;j++)
    {
        if(temp+input[j]==x)
        {
            if(temp<input[j])
               count++;
                if(temp>input[j])
                      count++;
                   if(temp==input[j])
                     count++;
            
                    
        }
    }
}
	return count;
    }
}