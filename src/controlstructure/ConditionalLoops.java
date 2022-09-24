package controlstructure;

public class ConditionalLoops {

	    enum myChar {
	        A,
	        B
	    }

	    public static void main (String[] args){
	    	ConditionalLoops cl = new ConditionalLoops();
	    	cl.switchCheck();
	    }

	    public void ifElseCheck(){
	        boolean flag = false;
	        String str = "myStr";

	        if(str.equalsIgnoreCase("myStr") || flag){
	            System.out.println("I'm in if");
	        } else {
	            System.out.println("I'm in else");
	        }
	    }

	    public void forLoopCheck(){

	        for(int i = 0; i < 5; i++){
	            System.out.println("i is " + i);
	            if(i == 3){
	                break;
	            }
	        }
	    }

	    public void forEachLoopCheck(){
	        String[] myArray = {"a", "b", "c"};

	        for(String str : myArray){
	            System.out.println(str);
	            if(str.equalsIgnoreCase("b")){
	                break;
	            }
	        }
	    }

	    public void whileLoopCheck(){
	        int i = 5;

	        while(i > 0){
	            System.out.println("i is " + i);
	            i--;
	            if(i == 3){
	                break;
	            }
	        }

	    }

	    public void switchCheck(){
	        String str = "c";
	        myChar nowChar = myChar.B;

	        switch(nowChar){
	            case A:
	                System.out.println(nowChar);
	                break;
	            case B:
	                System.out.println(nowChar);
	                break;
	        }

	    }

	}

