public class SecondLargest {
    public static void main(String[] args) {
        int a[]={5,86,44,75,36};
        int i,j;
        for(i=0;i<5;i++);
            {
                for(j=i+1;j<5;j++);
                {
                if(a[i]>a[j])
                {
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
                }
            
            } 
            System.out.println(a[i]);
    }
}
