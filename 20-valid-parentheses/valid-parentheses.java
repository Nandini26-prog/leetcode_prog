class Solution {
    public boolean isValid(String s) {
        Stack <Character> op= new Stack<>();
       for(char c:s.toCharArray()){
        if(c=='(')
            op.push(')');
        else if(c=='{')  op.push('}');
        else if(c=='[')  op.push(']');
        else if(op.isEmpty()||op.pop()!=c)
            return false;
                    
        }
        return op.isEmpty();
    }
}