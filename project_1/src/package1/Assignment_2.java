package package1;

public class Assignment_2 

{
    public int div(int a, int b) 
{
	int c;
	c=a/b;
	return c;	
}    
    public int sub (int d,int e)  
    {
      	int f;
      	f=d-e;
      	return f;
    }
      public int sum(int g, int h)
      {
      	int i;
      	i=g+h;
      	return i;
      	
      }
      public void mul(int j, int k)
      
      {
      	int l;
      	l=j*k;
      	
      	System.out.println("result "+l);
}
      public static void main(String[] args) 
      
      {
    	  Assignment_2 ob=new Assignment_2();
          
          int div_result=ob.div(10,2);
          int sub_result=ob.sub(div_result, 2);
          int sum_result=ob.sum(sub_result, 2);
          int sub_result1=ob.sub(sum_result, 2);
          int sum_result1=ob.sum(sub_result1, 2);
          ob.mul(sum_result1, 2);
	}
      
}
