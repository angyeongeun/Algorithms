public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        int ans = a.length(); //default는 모든 값이 다르다는 가정하에 놓음
        
        for(int i=0; i<=b.length()-a.length(); i++) { //각 문자열의 차이
            int cnt = 0;
            for(int j=0; j<a.length(); j++) {
                if(a.charAt(j) != b.charAt(i+j))
                    cnt++;//차이의 개수
            }
            ans = Math.min(cnt, ans); // 이 코드로 차이의 갯수를 계속 비교할 수 있음
        }
        System.out.println(ans);//최종적으로 비교했을때 가장 작은 값(가장 작은 차이값)을 반환
    }



    
    
    



