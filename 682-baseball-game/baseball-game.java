class Solution {
    public int calPoints(String[] operations) {
        int n=operations.length;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            if(operations[i].equals("+")){
                int a=st.pop();
                int b=st.pop();
                int c=a+b;
                st.push(b);
                st.push(a);
                st.push(c);
            }
            else if(operations[i].equals("D")){
                int a=st.pop();
                int c=2*a;
                st.push(a);
                st.push(c);
            }
             else if(operations[i].equals("C")){
                 st.pop();
             }
            else{
                st.push(Integer.parseInt(operations[i]));
            }
        }
        int sum=0;
        while(!st.isEmpty()){
            sum=sum+st.pop();
        }
        return sum;
    }
}