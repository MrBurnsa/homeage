package org.homeage.web.dto;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

public abstract class AbstractDTO {
	public boolean isValid() {
		final ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		final Validator validator = factory.getValidator();
		final Set<ConstraintViolation<AbstractDTO>> violations = validator.validate(this);
		return violations.size() == 0;
	}
}