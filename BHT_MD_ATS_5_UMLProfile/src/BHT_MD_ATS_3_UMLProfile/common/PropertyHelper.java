package BHT_MD_ATS_3_UMLProfile.common;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.impl.DynamicEObjectImpl;
import org.eclipse.uml2.uml.Element;

import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.ProfileApplication;
import org.eclipse.uml2.uml.Stereotype;

public class PropertyHelper {

	public List<Object> getTaggedValue(Element element, String stereotypeName,
			String property) {
		Stereotype stereotype = getStereotype(element, stereotypeName);
		System.out.println("class : " + ((NamedElement) element).getName());
		System.out.println("stereotype : " + stereotype.getName());
		System.out.println("stereotype attribute : " + property);

		List<Object> result = new ArrayList<Object>();
		Object value = element.getValue(stereotype, property);
		if (value instanceof Collection) {
			System.out.println("value is instance of Collection");

			// result.addAll((Collection<List>) value);
			for (Object o : (Collection<List>) value) {
				if (o instanceof DynamicEObjectImpl) {
					final DynamicEObjectImpl dynObj = (DynamicEObjectImpl) o;
					final EClass c = dynObj.eClass();
					final EStructuralFeature structuralFeature = c
							.getEStructuralFeature("base_Class");
					if (structuralFeature != null) {
						final Object obj = dynObj.eDynamicGet(structuralFeature, true);
						System.out.println("dynObj:" + obj.toString() + " / " + obj.getClass().getName());
						result.add(obj);
					}
				}
			}
		} else
			result.add(value);
		return result;
	}

	private Stereotype getStereotype(Element element, String stereotypeName) {
		for (Stereotype s : element.getAppliedStereotypes()) {
			if (s.getName().equalsIgnoreCase(stereotypeName)) {
				return s;
			}
		}
		return null;
	}

	public String getSTProperty(Model m) {
		StringBuffer sb = new StringBuffer();
		EList<Profile> appliedProfiles = m.getAllAppliedProfiles();
		for (Profile profile : appliedProfiles) {
			sb.append("\n<profile.getName: ")
					.append(profile.getName())
					.append(" / ")
					.append(profile.getValue(m.getAppliedStereotypes().get(0),
							"value").toString()).append("> \n");
		}
		EList<ProfileApplication> profileApplications = m
				.getAllProfileApplications();
		for (ProfileApplication profile : profileApplications) {
			sb.append("<pa.isEmpty: ")
					.append(profile.getStereotypeApplications().isEmpty())
					.append("> \n");
		}
		sb.append("<getSTProperty: \n1 ").append(appliedProfiles.isEmpty())
				.append("\n2 ").append(profileApplications.isEmpty());
		return sb.toString();

	}



// --- Old methods

	public List<Object> getTaggedValueOld(Element element, String stereotypeName,
			String property) {
		Stereotype s = getStereotype(element, stereotypeName);
		List<Object> res = new ArrayList<Object>();
		Object v = element.getValue(s, property);
		if (v instanceof Collection) {
			for (Object o : (Collection<List>) v) {
				if (o instanceof DynamicEObjectImpl) {
					final DynamicEObjectImpl dynObj = (DynamicEObjectImpl) o;
					final EClass c = dynObj.eClass();
					final EStructuralFeature sf = c.getEStructuralFeature("base_Class");
					if (sf != null) {
						res.add(dynObj.eDynamicGet(sf, true));
					}
				}
			}
		} else
			res.add(v);
		return res;
	}

	private Stereotype getStereotypeOld(Element element, String stereotypeName) {
		for (Stereotype s : element.getAppliedStereotypes()) {
			if (s.getName().equalsIgnoreCase(stereotypeName)) {
				return s;
			}
		}
		return null;
	}

}
