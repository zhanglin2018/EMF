package com.advantest.ate.sampleview;

import org.eclipse.jface.viewers.ITreeContentProvider;

import testProgram.Root;
import testProgram.TestFlow;
import testProgram.TestProgram;
import testProgram.TestSuite;

public class TreeContentProvider implements ITreeContentProvider {

	@Override
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
	}

	@Override
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof Root) {
			return ((Root)parentElement).getPrograms().toArray();
		}else if (parentElement instanceof TestProgram) {
			return ((TestProgram)parentElement).getFlows().toArray();
		} else if (parentElement instanceof TestFlow) {
			return ((TestFlow)parentElement).getSuites().toArray();
		} else {
			return new Object[0];
		}
	}

	@Override
	public Object getParent(Object element) {
		if (element instanceof TestFlow) {
			return ((TestFlow)element).eContainer();
		} else if (element instanceof TestSuite){
			return ((TestSuite)element).eContainer();
		} else {
			return null;
		}
	}

	@Override
	public boolean hasChildren(Object element) {
		return getChildren(element).length > 0;
	}

}
