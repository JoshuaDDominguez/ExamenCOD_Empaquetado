/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.myorg.empaquetado;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
    }
}
