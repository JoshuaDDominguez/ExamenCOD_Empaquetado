/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.myorg.empaquetado;

/**
 * Clase Objeto para guardar los datos del programa a empaquetar.
 * @author Joshua
 */
public class Datos {

    String extension, vOutdir, vOutfiles, Vsrcfiles, Vappclass, vName, Vtitle;

    public Datos() {
    }

    public Datos(String extension, String vOutdir, String vOutfiles, String Vsrcfiles, String Vappclass, String vName, String Vtitle) {
        this.extension = extension;
        this.vOutdir = vOutdir;
        this.vOutfiles = vOutfiles;
        this.Vsrcfiles = Vsrcfiles;
        this.Vappclass = Vappclass;
        this.vName = vName;
        this.Vtitle = Vtitle;
    }

    @Override
    public String toString() {
        return "Datos{" + "extension=" + extension + ", vOutdir=" + vOutdir + ", vOutfiles=" + vOutfiles + ", Vsrcfiles=" + Vsrcfiles + ", Vappclass=" + Vappclass + ", vName=" + vName + ", Vtitle=" + Vtitle + '}';
    }

}
