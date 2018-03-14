package com.devopsbuddy.web.i18n;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Service;

import java.util.Locale;

/**
 * Created by moyzesgh10 on 13/03/2018.
 */
@Service
public class I18NService {

    @Autowired
    private MessageSource messageSource;

    /**
     * Returns a message for the given message id and the default locale in the session context
     *
     * @param messageId The key to the message resource file
     * @return
     */
    public String getMessage(String messageId) {
        Locale locale = LocaleContextHolder.getLocale();
        return getMessage(messageId, locale);
    }

    /**
     * Returns a message for thr given message id and locale
     *
     * @param messageId The key to the messages resource file
     * @param locale    The locale
     * @return
     */
    public String getMessage(String messageId, Locale locale) {
        return messageSource.getMessage(messageId, null, locale);
    }
}
