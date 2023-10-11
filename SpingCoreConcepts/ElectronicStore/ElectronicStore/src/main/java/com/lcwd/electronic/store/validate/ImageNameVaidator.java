package com.lcwd.electronic.store.validate;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ImageNameVaidator implements ConstraintValidator<ImageNameValid,String> {


    private Logger logger = LoggerFactory.getLogger(ImageNameVaidator.class);
    @Override
    public boolean isValid(String value, ConstraintValidatorContext constraintValidatorContext) {

        logger.info("Message from isvalid :  {} ", value);
        //logic
        if (value.isBlank()) {
            return false;

        } else {
            return true;
        }
    }
}