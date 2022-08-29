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
            System.out.println(Solution.findUnique(input));
        
            t -= 1;
        }
    }
}
public class Solution{	
    public static int findUnique(int[] arr){
        int k=0;
        boolean [] visited = new boolean[arr.length];
        for (int i = 0; i <arr.length ; i++) {
            int x = arr[i];
            if(visited[i]==false) {
                boolean isDuplicate = false;
                for (int j = i + 1; j < arr.length; j++) {
                    if (x == arr[j]) {
                        isDuplicate = true;
                        visited[j] = true;
                    }
                }
                if (!isDuplicate)
                    k=x;

            }
        }

        return k;
    }
}