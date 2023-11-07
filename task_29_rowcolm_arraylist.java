package TASK;

import java.util.*;

public class task_29_rowcolm_arraylist {

    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        
        ArrayList<ArrayList<Integer>> arrNum = new ArrayList<>();
        int n,q;
        
        n = sc.nextInt();
        sc.nextLine();
        
        for(int i = 1; i <= n; i++){
            ArrayList<Integer> arrRow = new ArrayList<>();
            String[] ints = sc.nextLine().split(" ");
            
            for(int j = 1; j < ints.length; j++){
                arrRow.add(Integer.parseInt(ints[j]));
            }  
            
            arrNum.add(arrRow);
        }
        
        q = sc.nextInt();
        sc.nextLine();
        
        
        for(int i = 0; i < q; i++){
            String[] pos = sc.nextLine().split(" ");
            ArrayList<Integer> tempRow = new ArrayList<>();
            tempRow = arrNum.get(Integer.parseInt(pos[0]) - 1);
            try{
                System.out.println(tempRow.get(Integer.parseInt(pos[1]) - 1));
            }
            catch(Exception e){
                System.out.println("ERROR!");
            }
        }
    }
}