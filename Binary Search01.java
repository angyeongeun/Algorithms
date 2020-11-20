class Solution {
    public static void main(String[] args) {
    	int brown = 10;
    	int red = 2;

    
        int width = 0;
        int height = 0;


        System.out.println(red/2+1);

        

        
        for(int i=1; i<=red/2+1; i++) {
            width = i;            
            height = (red%i==0) ? red/i:red/i+1;
            
            if(2*width + 2*height + 4 == brown) break;
            
        }
            
        int[] answer = {Math.max(width, height)+2, Math.min(width, height)+2};
        


        for(int i = 0; i < answer.length; i++){

        	System.out.println(answer[i]);


        }
     
    }
}
