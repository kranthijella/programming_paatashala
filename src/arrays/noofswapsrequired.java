package arrays;

public class noofswapsrequired {
    public static void main(String args[]){
        int a[] = new  int[]{2,1,5,6,3};
        int x = 3;
        int lsthanx = 0;
        for(int i = 0;i<a.length;i++){
            if(a[i] <= x){
                lsthanx = lsthanx + 1;
            }
        }
        int max = Integer.MIN_VALUE;
        int current = 0;
        for(int i = 0;i<lsthanx;i++){
            if(a[i] <=x){
                current = current + 1;
            }
        }
        if(current > max){
            max = current;
        }
        for(int i = lsthanx;i<a.length;i++){
            if(a[i]<=x){
                current = current + 1;
            }
            if(a[i-lsthanx] <= x){
                current = current - 1;
            }
            max = Math.max(current,max);
        }
        System.out.println(lsthanx-max);
    }
}
