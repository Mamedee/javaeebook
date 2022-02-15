package book.javaeebook.customval;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.component.html.HtmlInputText;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

import org.apache.commons.validator.routines.EmailValidator;

@FacesValidator(value="emailValidator")
public class EmailValid implements Validator {
	
	@Override
	public void validate(FacesContext facesContext, UIComponent uiComponent, Object value) {
		EmailValidator emailValidator = EmailValidator.getInstance();
		HtmlInputText htmlInputText = (HtmlInputText) uiComponent;
		String email = (String) value;
		
		if (!email.isEmpty()) {
			if (!emailValidator.isValid(email)) {
				FacesMessage facesMessage = new FacesMessage(htmlInputText.getLabel() +
						": email format is not valid.");
				throw new ValidatorException(facesMessage);			
			}			
		}
	}
}
