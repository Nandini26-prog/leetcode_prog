class Solution {
    public boolean isNumber(String s) {
        if(s==null||s.isEmpty())
            return false;
    
    s=s.trim();
    String regex="^[+-]?((\\d+\\.?\\d*)|(\\.\\d+))([eE][+-]?(\\d+))?$";

    return s.matches(regex);
}
}