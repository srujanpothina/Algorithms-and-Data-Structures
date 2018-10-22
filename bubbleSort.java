public class HelloWorld{

     public static void main(String []args){
        double[] a = {1,2,2.4,0.2,-10,210,-0.22};
        double temp=0;
        for(int i=0;i<a.length-1;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]>a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j]= temp;
                }
            }
        }
        for(double val:a){
            System.out.print(val+" ");
        }
     }
}
