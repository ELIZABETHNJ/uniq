# uniq
import java.io.*;
import java.util.*;
public class Unique
{
  public static void main(String args[]) throws IOException
  {
    

    String b="";
  int s;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the size of  first array");
    int x=Integer.parseInt(br.readLine());
    List<String>l1=new ArrayList<String>();
    Set<String>l2=new HashSet<String>();    
    System.out.println("Enter the element of first string");
    for(int i=0;i<x;i++)
    {
      
        b=br.readLine();
        l1.add(b);
      }
      if(x>1)
      {
        for(String s1:l1)
        {
          
          s=Collections.frequency(l1,s1);
          if(s<2)
          {
            l2.add(s1);
          }
        }  
        System.out.println("The unique number is");
        for(String s2:l2)
        {
          System.out.println(s2);
        }
      }
      else
      {      
        System.out.println(b);
      }
    }
    }
