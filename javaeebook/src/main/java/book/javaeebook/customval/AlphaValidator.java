package book.javaeebook.customval;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.component.html.HtmlInputText;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;
import javax.inject.Named;
import javax.validation.ValidationException;

import org.apache.commons.lang3.StringUtils;

@Named
@RequestScoped
public class AlphaValidator {
	public void validateAlpha(FacesContext facesContext, UIComponent uiComponent, Object value) throws ValidationException {
		if (!StringUtils.isAlphaSpace((String) value)) {
			HtmlInputText htmlInputText = (HtmlInputText) uiComponent;
			FacesMessage facesMessage = new FacesMessage(htmlInputText.getLabel() +
					": only alphabetic character are allowed.");
			throw new ValidatorException(facesMessage);
		}
	}
}
