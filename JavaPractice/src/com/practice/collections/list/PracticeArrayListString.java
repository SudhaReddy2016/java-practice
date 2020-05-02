package com.practice.collections.list;

import java.util.ArrayList;
import java.util.List;

     public class PracticeArrayListString {
	
     public static void main(String str[]){
    	 
    	 List<Bottle> bt = new ArrayList<Bottle>();
    	 
    	 Bottle b1 = new Bottle();
    	 b1.setStr("A");
    	 bt.add(b1);
    	 
    	 Bottle b2 = new Bottle();
    	 b2.setStr("B");
    	 bt.add(b2);
    	 
    	 Bottle b3 = new Bottle();
    	 b3.setStr("C");
    	 bt.add(b3);
    	 
    	 Bottle b4 = new Bottle();
    	 b4.setStr("B");
    	 bt.add(b4);
    	 
    	 Bottle b5 = new Bottle();
    	 b5.setStr("D");
    	 bt.add(b5);
    	 
    	 Bottle b6 = new Bottle();
    	 b6.setStr("E");
    	 bt.add(b6);
    	 
    	 Bottle b7 = new Bottle();
    	 b7.setStr("C");
    	 bt.add(b7);
    	 
    	 Bottle b8 = new Bottle();
    	 b8.setStr("E");
    	 bt.add(b8);
    	 
    	 for(int i=0;i<bt.size();i++){
    		 for(int j = i+1;j<bt.size();j++){
    			 if(bt.get(i).equals(bt.get(j))){
    				 bt.remove(j);
    				 j--;
    			 }
    		 }
    	 }
    	 System.out.println(bt);
    	 
     }
	

}
