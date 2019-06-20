package com.advantest.ate.util;

import java.io.File;
import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import testProgram.Root;
import testProgram.TestProgramPackage;

public class FlowResourceController {

	public static void main(String[] args) {
		createPrograms();
	}

	public static EObject createPrograms() {
		TestProgramPackage package1 = TestProgramPackage.eINSTANCE;
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("testprogram",
				new XMIResourceFactoryImpl());
		
		URI uri = URI.createURI("file:/F:/javaRepository/emf/com.advantest.tree.parent/com.advantest.ate.sampleView/resource/rootModel.testprogram");
//		URI uri = URI.createFileURI(new File("resource/rootModel.testprogram").getAbsolutePath());
		
		System.out.println(uri);
		Resource resource = resourceSet.createResource(uri);
		System.out.println(resource);
		Root rootModel = null;
		try {
			resource.load(null);
			rootModel = (Root) resource.getContents().get(0);
			System.out.println(rootModel);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return rootModel;
	}
}
