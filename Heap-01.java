import java.util.*;





class Solution {
    public void solution(int[] scoville, int K) {
        PriorityQueue<Integer> q = new PriorityQueue<>();

        for(int i = 0; i < scoville.length; i++){
            q.add(scoville[i]);//queue에 넣어줌
        }
        //우선순위 큐에 값을 넣어주면 자동적으로 제일 작은 값부터 정리된다.
    

        int count = 0;
        while(q.size() > 1 && q.peek() < K){
        // queue가 비지 않고, head(제일 첫번째 element)가 K보다 작다면 계속 실행
            int weakHot = q.poll(); // poll method removes and return the head of the queue. it returns null if the queue is empty
      
            int secondWeakHot = q.poll();
    

            int mixHot = weakHot + (secondWeakHot * 2);
            q.add(mixHot);// add method id used to add elements at the tail but! tail로 들어가지만 자동적으로 작은 순서에 맞춰 배열됨....
            count++;
        }

        if(q.size() <= 1 && q.peek() < K)
            count = -1;

        System.out.println(count);
    }


    //test
    // public static void main(String[] args){
    //     Solution sol = new Solution();
    //     int[] scoville = {1, -2, 3, 9, 2, 12};
    //     int K = 7;

    //     sol.solution(scoville,K);




    // }
}
