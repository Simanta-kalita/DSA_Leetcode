class Solution {
    public boolean isValid(String s) {

        if(s.length() % 2 != 0){
            return false;
        }

        HashMap<Character, Character> map = new HashMap<>();
        map.put('}', '{');
        map.put(')', '(');
        map.put(']', '[');

        Stack<Character> stack = new Stack<>();

        for(char ch : s.toCharArray()){
            if(ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
            } else if(!stack.empty() && map.get(ch) == stack.peek()){
                stack.pop();
            } else{
                return false;
            }
        }

        return stack.empty();
    }
}
