package geekster;

import java.util.Stack;

public class Valid_paanthisis {
	
	boolean paranthisis(String str) {
		Stack<Character> s=new Stack<>();
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(isopening(ch)) {
				s.push(ch);
			}
			else {
				if(s.isEmpty()) {
					return false;
				}
				else if(ismatching(ch, s.peek())){
					return false;
				}
				else {
					s.pop();
					}
			}
		}
		return s.isEmpty();
	}
	boolean isopening(char c) {
		return (c=='('||
			   c=='['||
			   c=='{');
	}
	boolean ismatching(char a,char b) {
		return (a=='(' && b==')' ||
				a=='{' && b=='}' || 
				a=='[' && b==']');
	}
	public static void main(String []args) {
		String str="({[]})";
		Valid_paanthisis ob=new Valid_paanthisis();
		System.out.println(ob.paranthisis(str));
	}

}
