class Solution {
    public int romanToInt(String s) {
Map<Character,Integer> map=new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        Stack<Integer> stack=new Stack<>();
        char lastChar=' ';
        for(char c:s.toCharArray()){
            if(lastChar!=' '){
                if(map.get(lastChar)<map.get(c)){
                    if(!stack.isEmpty()){
                        stack.push(map.get(c)-stack.pop());
                        lastChar=c;
                    }
                }else{
                    stack.push(map.get(c));
                    lastChar=c;
                }
            }else{
                stack.push(map.get(c));
                lastChar=c;
            }
        }
        int ans=0;
        while(!stack.isEmpty()){
            ans+=stack.pop();
        }
        return ans;
    }
}