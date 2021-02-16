/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pulse;

/**
 *
 * @author ruchi
 */
public class BloodPressure {
    
    int sbp,dbp;
		if(sbp>120)
		{
			if((sbp>=120 && dbp<=129) || dbp<=80)
			{
				System.out.println("Elevated");
			}
			if((sbp>=130 && sbp<=139) || (dbp>80 && dbp<=89))
			{
				System.out.println("Stage-I Hypertension");
			}
			if(sbp>=140 || dbp>=90)
			{
				System.out.println("Stage-II Hypertension");
			}
			if(sbp>180 || dbp>120)
			{
				System.out.println("Consult doctor immediately");
			}
		}
		else
		{
			if(sbp<=90 && dbp<=60)
			{
				System.out.println("Low Blood Pressure");
			}
		}
    
}
