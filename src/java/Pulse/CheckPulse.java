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
public class CheckPulse {
    
    private int sbp,dbp;
    
    public int getSbp()
    {
        return sbp;
    }
    public void setSbp(int sbp)
    {
        this.sbp = sbp;
    }
    public int getDbp()
    {
        return dbp;
    }
    public void setDbp(int dbp)
    {
        this.dbp = dbp;
    }

    void setDbp(String dbp) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    void setSbp(String sbp) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}
