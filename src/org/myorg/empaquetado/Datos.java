/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.myorg.empaquetado;

/**
 * Clase Objeto para guardar los datos del programa a empaquetar.
 *
 * @author Joshua
 */
public class Datos {

    String vBcategory, vOutdir, vOutfiles, Vsrcdir, Vappclass, vName, Vtitle;

    public Datos() {
    }

    public Datos(String vBcategory, String vOutdir, String vOutfiles, String Vsrcdir, String Vappclass, String vName, String Vtitle) {
        this.vBcategory = vBcategory;
        this.vOutdir = vOutdir;
        this.vOutfiles = vOutfiles;
        this.Vsrcdir = Vsrcdir;
        this.Vappclass = Vappclass;
        this.vName = vName;
        this.Vtitle = Vtitle;
    }

    public String getvBcategory() {
        return vBcategory;
    }

    public String getvOutdir() {
        return vOutdir;
    }

    public String getvOutfiles() {
        return vOutfiles;
    }

    public String getVsrcdir() {
        return Vsrcdir;
    }

    public String getVappclass() {
        return Vappclass;
    }

    public String getvName() {
        return vName;
    }

    public String getVtitle() {
        return Vtitle;
    }

    public void setvBcategory(String vBcategory) {
        this.vBcategory = vBcategory;
    }

    public void setvOutdir(String vOutdir) {
        this.vOutdir = vOutdir;
    }

    public void setvOutfiles(String vOutfiles) {
        this.vOutfiles = vOutfiles;
    }

    public void setVsrcdir(String Vsrcdir) {
        this.Vsrcdir = Vsrcdir;
    }

    public void setVappclass(String Vappclass) {
        this.Vappclass = Vappclass;
    }

    public void setvName(String vName) {
        this.vName = vName;
    }

    public void setVtitle(String Vtitle) {
        this.Vtitle = Vtitle;
    }

    @Override
    public String toString() {
        return "Datos{" + "vBcategory=" + vBcategory + ", vOutdir=" + vOutdir + ", vOutfiles=" + vOutfiles + ", Vsrcdir=" + Vsrcdir + ", Vappclass=" + Vappclass + ", vName=" + vName + ", Vtitle=" + Vtitle + '}';
    }

}
