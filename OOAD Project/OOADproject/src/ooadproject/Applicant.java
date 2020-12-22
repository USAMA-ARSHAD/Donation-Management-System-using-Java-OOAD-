/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooadproject;

/**
 *
 * @author Lenovo
 */
public class Applicant extends User{
    boolean pass;
    boolean fail;

    public boolean isPass() {
        return pass;
    }

    public boolean isFail() {
        return fail;
    }

    public void setPass(boolean pass) {
        this.pass = pass;
    }

    public void setFail(boolean fail) {
        this.fail = fail;
    }
    
}
