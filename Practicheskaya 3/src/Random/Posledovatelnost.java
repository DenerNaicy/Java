package Random;

import java.util.*;
public class Posledovatelnost {
    public static void main(String[] args)
    {
        Integer[] mas=new Integer[4];
        for (int i=0; i<4; i++)
        {
            mas[i]=(int)(Math.random()*90+10);
            System.out.println(mas[i]+ " ");
        }
        for(int i=0; i<4; i++)
        {
            if(i>0)
            {
                if(mas[i-1]>=mas[i]) {
                    System.out.println("Последовательность не строго возврастающая");
                    break;
                }
            }
            if(i==3)
            {
                System.out.println("Последовательность строго возврастающая");
            }
        }
    }

}
