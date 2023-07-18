public class Question6 {
    public int firstBadVersion(int n) {
        int start=0;
        int end=n;
        int answer=0;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(isBadVersion(mid)){
                answer=mid;
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        
    }
}
