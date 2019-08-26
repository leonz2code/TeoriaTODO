package generictype;


public class GenericType 
{
    public static <T extends Color> int countItemOccurences(T[] s, T itemToCount)
    {
        int count = 0;
        
        for (T item: s)
        {
            if (item.equals(itemToCount))
                count++;
        }
        
        return count;
    }
    
    public static void main(String[] args) 
    {
        String[] s = new String[3];
        
        s[0] = "aaa";
        s[1] = "test";
        s[2] = "aaa";
        
      //  int cstrings = countItemOccurences(s, "test");
        
        //System.out.println(cstrings);
        
        Color[] c = new Color[4];
        
        c[0] = new Color("red");
        c[1] = new Color("green");
        c[2] = new Color("red");
        c[3] = new Color("red");
        
        int ccolors = countItemOccurences(c, new Color("red"));
        
        System.out.println(ccolors);        
                
        Integer[] i = new Integer[4];
        
        i[0] = 5;
        i[1] = 256;
        i[2] = 5;
        i[3] = 5;

        
      
    }   
}


class Color
{
    String color;

    Color(String color) {
        this.color = color;
    }
    
    String getColor()
    {
        return this.color;
    }

    @Override
    public boolean equals(Object o) {
        return (((Color)o).color).equals(this.color);
    }
    
}