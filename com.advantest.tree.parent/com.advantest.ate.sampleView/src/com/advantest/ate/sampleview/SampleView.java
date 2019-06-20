package com.advantest.ate.sampleview;

import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ViewPart;

import com.advantest.ate.util.FlowResourceController;

public class SampleView extends ViewPart {
	private TreeViewer treeViewer;
	
	public SampleView() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createPartControl(Composite parent) {
		treeViewer = new TreeViewer(parent);
		
		treeViewer.getTree().setHeaderVisible(true);
		treeViewer.getTree().setLinesVisible(true);
		
		treeViewer.setContentProvider(new TreeContentProvider());
		treeViewer.setLabelProvider(new ViewLabelProvider(PlatformUI.getWorkbench()));
		
		treeViewer.setInput(FlowResourceController.createPrograms());
		
		getSite().setSelectionProvider(treeViewer);
	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub

	}

}
