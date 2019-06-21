package com.advantest.ate.sampleview;

import java.util.List;

import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.emf.edit.ui.celleditor.AdapterFactoryTreeEditor;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.edit.ui.view.ExtendedPropertySheetPage;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;
import org.eclipse.ui.views.properties.IPropertySheetPage;
import org.eclipse.ui.views.properties.PropertySheetPage;

import com.advantest.ate.util.FlowResourceController;

import testProgram.provider.TestProgramItemProviderAdapterFactory;

public class SampleView extends ViewPart {
	private TreeViewer treeViewer;
	private ComposedAdapterFactory adapterFactory;

	public SampleView() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createPartControl(Composite parent) {

//		selectionViewer = (TreeViewer)viewerPane.getViewer();
//		selectionViewer.setContentProvider(new AdapterFactoryContentProvider(adapterFactory));
//		selectionViewer.setUseHashlookup(true);
//
//		selectionViewer.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
//		selectionViewer.setInput(editingDomain.getResourceSet());
//		selectionViewer.setSelection(new StructuredSelection(editingDomain.getResourceSet().getResources().get(0)), true);
//		viewerPane.setTitle(editingDomain.getResourceSet());
//
//		new AdapterFactoryTreeEditor(selectionViewer.getTree(), adapterFactory);
//
//		createContextMenuFor(selectionViewer);
//		int pageIndex = addPage(viewerPane.getControl());
//		setPageText(pageIndex, getString("_UI_SelectionPage_label"));

		treeViewer = new TreeViewer(parent);

		treeViewer.getTree().setHeaderVisible(true);
		treeViewer.getTree().setLinesVisible(true);

		adapterFactory = new ComposedAdapterFactory(
				ComposedAdapterFactory.Descriptor.Registry.INSTANCE);

		adapterFactory.addAdapterFactory(new ResourceItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new TestProgramItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new ReflectiveItemProviderAdapterFactory());
		treeViewer.setContentProvider(new AdapterFactoryContentProvider(adapterFactory));
		treeViewer.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		treeViewer.setInput(FlowResourceController.createPrograms());
		treeViewer.setSelection(new StructuredSelection(FlowResourceController.createPrograms()), true);

		getSite().setSelectionProvider(treeViewer);

		treeViewer.addSelectionChangedListener(new ISelectionChangedListener() {

			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				ISelection selection = event.getSelection();
				if (selection != null && selection instanceof IStructuredSelection) {
					Object element = ((IStructuredSelection) selection).getFirstElement();
					System.out.println(element);
				}
			}
		});
	}

	@Override
	public <T> T getAdapter(Class<T> key) {
		if (key.equals(IPropertySheetPage.class)) {
			return key.cast(getPropertySheetPage());
		}
		return super.getAdapter(key);
	}

	public IPropertySheetPage getPropertySheetPage() {
		PropertySheetPage propertySheetPage = new PropertySheetPage();
		propertySheetPage.setPropertySourceProvider(new AdapterFactoryContentProvider(adapterFactory));
		return propertySheetPage;
	}

//	@Override
//	public void createPartControl(Composite parent) {
//		
//		treeViewer = new TreeViewer(parent);
//		
//		treeViewer.getTree().setHeaderVisible(true);
//		treeViewer.getTree().setLinesVisible(true);
//		
//		treeViewer.setContentProvider(new TreeContentProvider());
//		treeViewer.setLabelProvider(new ViewLabelProvider(PlatformUI.getWorkbench()));
//		
//		treeViewer.setInput(FlowResourceController.createPrograms());
//		
//		getSite().setSelectionProvider(treeViewer);
//		
//		treeViewer.addSelectionChangedListener(new ISelectionChangedListener() {
//			
//			@Override
//			public void selectionChanged(SelectionChangedEvent event) {
//				ISelection selection = event.getSelection();
//				if (selection != null && selection instanceof IStructuredSelection) {
//					Object element = ((IStructuredSelection)selection).getFirstElement();
//					System.out.println(element);
//				}
//			}
//		});
//	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub

	}

}
