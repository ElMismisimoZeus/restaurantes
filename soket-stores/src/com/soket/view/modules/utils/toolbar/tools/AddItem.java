package com.soket.view.modules.utils.toolbar.tools;

import java.awt.Image;
import java.awt.event.ActionEvent;

import javax.print.DocFlavor.URL;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ImageIcon;

public  class AddItem extends AbstractAction{

	public AddItem() {
		putValue(Action.NAME, "Agregar");
		
		java.net.URL resource = AddItem.class.getResource("/com/soket/view/images/plus.png");
		//ImageIcon aux = new ImageIcon(resource);
		//Image img = aux.getImage();
		//Image newimg = img.getScaledInstance(230, 310,  java.awt.Image.SCALE_SMOOTH);
		
		putValue(Action.SMALL_ICON, new ImageIcon(resource));
		putValue(Action.SHORT_DESCRIPTION, "Agregar nuevo elemento");
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
