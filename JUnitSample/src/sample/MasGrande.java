/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;

/**
 *
 * @author Usuario
 */
public class MasGrande
{

    public static int max(int[] a)
    {
        int i, m = 0;                
        
        if(a == null)
        {
            return 0;
        }
        
        for (i = 0; i < a.length; i++)
        {                       
            if (a[i] > m)
            {
                m = a[i];
            }
        }
        return m;
    }
}
