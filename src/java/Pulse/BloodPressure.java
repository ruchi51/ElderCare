/*
 * sbp is Systolic blood pressure (upper number) 
 * dbp id Diastolic blood pressure (lower number)
 * we can check pulse rate by sensors.
 * if it is high a message can be send to guardian so action be taken.
 */
package Pulse;

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
