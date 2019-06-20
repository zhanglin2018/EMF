package com.advantest.ate.sampleview;

import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.IWorkbench;

import testProgram.Suite;
import testProgram.TestFlow;
import testProgram.TestProgram;


public class ViewLabelProvider extends LabelProvider {
	private IWorkbench workbench;
	ViewLabelProvider(IWorkbench workbench){
		this.workbench = workbench;
	}
	

	public String getText(Object obj) {
		if (obj instanceof TestProgram) {
			return ((TestProgram)obj).getName();
		} else if (obj instanceof Suite) {
			return ((Suite)obj).getName();
		} 
		return "";
	}
	public Image getImage(Object obj) {
		String imageKey = ISharedImages.IMG_OBJ_ELEMENT;
		if (obj instanceof TestProgram) {
			imageKey = ISharedImages.IMG_OBJ_FOLDER;
		} else if (obj instanceof TestFlow) {
			imageKey = ISharedImages.IMG_OBJS_ERROR_TSK;
		} else if (obj instanceof Suite) {
			imageKey = ISharedImages.IMG_OBJS_INFO_TSK;
		}
		return workbench.getSharedImages().getImage(imageKey);
	}
}
