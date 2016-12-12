package hw;

import java.util.Scanner;

/*
 * Date: 2016/12/12
 * Author: 105021***  ???
 */
public class hw03 {   
	private static Bintree bintree;
	public static void main(String[] args) {
   Scanner scn= new Scanner(System.in); 
   char contChar='y';
   float vc=0;
   boolean flag=true;
   while(contChar=='Y'||contChar=='y'){
	   flag=true;
	   System.out.print("nuber:");
	   vc=scn.nextFloat();
	   
   }
    if(bintree==null){
    	bintree=new Bintree(vc);
    	
    }else{
    	bintree.addNode(vc);
    }
        bintree.inOrder(bintree.root);
        scn.nextLine().charAt(0);



	}
}