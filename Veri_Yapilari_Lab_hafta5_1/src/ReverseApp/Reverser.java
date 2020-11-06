package ReverseApp;

public class Reverser {

   private String input;
   private String output;

    public Reverser(String input) {
        this.input = input;
        this.output="";
    }
    
    public String doReverse(){
        int size=this.input.length();
        Stack stack=new Stack(size);
        for (int i = 0; i < size; i++) {
            char ch=this.input.charAt(i);
            stack.push(ch);
        }
        for(;!stack.isEmpty();){
            this.output+=stack.pop();
        }
        return this.output;
    }
   
}
