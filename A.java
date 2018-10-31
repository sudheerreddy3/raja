public class A{

    
    public void callMe(String a)
 
   {
  
      System.out.println(a);

    }
        
          public void add(int a,int b)
    
      {
 
             int c = a + b;
              System.out.println("sum of two numbers :"+c);
    
      }
  
        public void sub(double c,double d)
   
         {
     
         System.out.println("subtraction of two numbers :"+(c-d));
  
        }
       
          public void div( float m,float n)
        
           {
           
          System.out.println("division of two numbers :"+(m/n));
       
           }
 
            public void multi(int x,int y)

             {
   
          
     System.out.println("multiplication of two number is : "+(x*y));
     
              }
   
               public static void main(String []args)
               {
     

    
       A obj =new A();
  
   
     obj.callMe("call me through object");
   
     obj.multi(5,4);
    
    obj.add(73,74);
        
    obj.sub(4.50,2.30);
       
    obj.div(50.4f,25.1f);
 
              
                   }

  }