package classroom;

import java.util.ArrayList;
import java.util.List;

public  class MyStack<AnyType>{
	
	public  MyStack<AnyType> adh;
	public static int MAX=100;
	 int top=0;
	 private List<AnyType> elements = new ArrayList<AnyType> ();
	 
       public void push(AnyType symbol) 
        {
            if (top > MAX) 
            {
            	List<AnyType> tempList=new ArrayList<>(MAX*2);
	        	for(int i=0; i<elements.size() ; i++) {
	        		tempList.add(elements.get(i));
	        	}
	        	//System.arraycopy(myArrayList, 0, tempList, 0, myArrayList.size());
	        	elements =tempList;
	        	elements.add(symbol);
	        	top++;
            } 
            else
            {
            	elements.add(symbol);
            	top++;
            }
        }
 
      public AnyType pop() 
        {
            if (top == 0) 
            {
                System.out.println("Stack is empty");
              
            } 
            else
            {
            	top--;
               AnyType element = elements.remove(top);
               
                return element;
            }
			return null;
        }
 
        boolean isEmpty() 
        {
            return elements.isEmpty();
        }
	   
}

class TestStack 
{ 
    public static void main(String args[]) 
    { 
    	MyStack<Character> stack = new MyStack<Character>(); 
    	char symbols[] = {'[','(','{','}','{','}',')',']'};
        if (isBalanced(symbols, stack)) {
        	System.out.println("Balanced symbols ");
        }
        else {
        	 System.out.println("Not Balanced "); 
        }
         
    }

	private static boolean isBalanced(char[] symbols, MyStack<Character> stack) {
		
	      
	       for(int i=0;i<symbols.length;i++)
	       {
	           
	          if (isOpeningSymbol(symbols, i)) {
	        	  stack.push(symbols[i]);
	          }
	          
	      
	          if (isClosingSymbol(symbols, i))
	          {
	             if (stack.isEmpty())
	               {
	                   return false;
	               } 
	      
	             else if ( !matches(stack.pop(), symbols[i]) )
	               {
	                   return false;
	               }
	          }
	           
	       }
	       if (stack.isEmpty()) {
	    	   return true; 
	       }else
	           {  
	               return false;
	           } 
	      }

	private static boolean isClosingSymbol(char[] symbols, int i) {
		return symbols[i] == '}' || symbols[i] == ')' || symbols[i] == ']';
	}

	private static boolean isOpeningSymbol(char[] symbols, int i) {
		return symbols[i] == '{' || symbols[i] == '(' || symbols[i] == '[';
	}

	private static boolean matches(char symbolLeft, char symbolRight) {
	       if (symbolLeft == '(' && symbolRight == ')')
	       {
	    	   return true;
	       }else if (symbolLeft == '{' && symbolRight == '}') {
	    	   return true;
	       } else if (symbolLeft == '[' && symbolRight == ']') {
	    	   return true;
	       } else {
	    	   return false;
	       }
	  	        
   }
}
