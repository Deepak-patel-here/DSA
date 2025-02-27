public class printKeyComboRecursion {
    public static String[] keys={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz" };
    public static void keyCombo(String str,int ind,String combination){
        if(ind== str.length()){
            System.out.println(combination);
            return;
        }

        char myChar=str.charAt(ind);
        String map=keys[myChar-'0'];

        for(int i=0;i<map.length();i++){
            keyCombo(str,ind+1,combination+map.charAt(i));
        }
    }
    public static void main(String[] args) {
        keyCombo("56",0,"");
    }
}
