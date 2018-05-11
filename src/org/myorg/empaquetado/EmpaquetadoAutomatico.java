/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.myorg.empaquetado;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import javax.swing.JOptionPane;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionRegistration;
import org.openide.util.NbBundle.Messages;

@ActionID(
        category = "File",
        id = "org.myorg.empaquetado.EmpaquetadoAutomatico"
)
@ActionRegistration(
        iconBase = "org/myorg/empaquetado/43A.png",
        displayName = "#CTL_EmpaquetadoAutomatico"
)
@ActionReference(path = "Toolbars/File", position = 0)
@Messages("CTL_EmpaquetadoAutomatico=Empaquetar")
public final class EmpaquetadoAutomatico implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO implement action body
       
        // Creamos un objeto para acceder a los datos
        Datos datos = new Datos();

        //Pedimos todos los datos necesarios para el comando
        datos.setvBcategory(JOptionPane.showInputDialog("Categoria (Bcategory)"));
        datos.setvOutdir(JOptionPane.showInputDialog("Direccion donde guardar el ejecutable (Outdir)"));
        datos.setvOutfiles(JOptionPane.showInputDialog("Nombre del archivo (Outfile)"));
        datos.setVsrcdir(JOptionPane.showInputDialog("Direccion de las src (srcdir)"));
        datos.setVappclass(JOptionPane.showInputDialog("Direccion de .jar (srcfiles)"));
        datos.setvName(JOptionPane.showInputDialog("Nombre de la aplicacion (Name)"));
        datos.setVtitle(datos.getvName());
    }
}
