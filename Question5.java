import java.util.Stack;

public class Question5 {
    public int largestRectangleArea(int[] heights) {
        //Approach1
        //1.find previous smaller
        //2.find next smaller
        //3.find width=nextsmaller(i)-previoussmaller(i)-1
        //4.find area=heights*width
        //return maxarea
        // int n=heights.length;
        // if(n==0){
        //     return 0;
        // }
        // int maxarea=0;
        // //fill left boundary
        // int[] left=new int[n];
        // //fill right boundary
        // int[] right=new int[n];
        // left[0]=-1;
        // right[n-1]=n;
        // //find previous smaller
        // for(int i=1;i<n;i++){
        //     int prev=i-1;
        //     while(prev>=0 && heights[prev]>=heights[i]){
        //         prev=left[prev];
        //     }
        //     left[i]=prev;
        // }
        // //find next smaller
        // for(int i=n-2;i>=0;i--){
        //     int next=i+1;
        //     while(next<n && heights[next]>=heights[i]){
        //         next=right[next];
        //     }
        //     right[i]=next;
        // }
        // //once we have these two arrays then find width and area
        // for(int i=0;i<n;i++){
        //     int width=right[i]-left[i]-1;
        //     maxarea=Math.max(maxarea,heights[i]*width);
        // }
        // return maxarea;

        //Approach2--using stack
        int n=heights.length;
        if(n==0){
            return 0;
        }
        int maxarea=0;
        int width;
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<=n;i++){
            while(!stack.isEmpty() && (i==n || heights[i]<heights[stack.peek()])){
                int height=heights[stack.pop()];
                if(stack.isEmpty()){
                    width=i;
                }
                else{
                    width=i-stack.peek()-1;
                }
                maxarea=Math.max(maxarea,height*width);
            }
            stack.push(i);
        }
        return maxarea;
    }
    public static void main(String[] args) {
        
    }
}
