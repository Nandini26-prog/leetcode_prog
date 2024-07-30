class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack=new Stack<>();
        String[] components= path.split("/");

        for(String parts:components){
            if(parts.equals("")||parts.equals("."))
                continue;
            else if(parts.equals("..")){
                if(!stack.isEmpty())
                    stack.pop();
            }
            else stack.push(parts);
        }
        StringBuilder finalpath=new StringBuilder();
        for(String dir:stack){
            finalpath.append("/").append(dir);
        }

        return finalpath.length()>0?finalpath.toString():"/";
    }
}