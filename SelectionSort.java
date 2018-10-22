public class SelectionSort{

     public static void main(String []args){
        double[] a = {1,2,2.4,0.2,-10,210,-0.22};
        double temp=0;
        int minIndex = 0;
        for(int i=0;i<a.length-1;i++){
            minIndex = i;
            for(int j=i+1;j<a.length;j++){
                if(a[j]<a[minIndex]){
                    minIndex = j;
                }
            }
            temp = a[minIndex];
            a[minIndex] = a[i];
            a[i] = temp;
        }
        for(double val:a){
            System.out.print(val+" ");
        }
     }
}
