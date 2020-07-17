package org.goodiemania.melinoe.framework.session.logging;

import java.io.File;
import java.time.LocalDateTime;

public class LogMessage {
    private final LocalDateTime dateTime;
    private String message = "";
    private String secondMessage = "";
    private String hiddenInfo = "";
    private Throwable throwable = null;
    private Boolean fail = false;
    private File image;
    private boolean imageCopied = false;

    public LogMessage(final LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public LogMessage(final LocalDateTime dateTime, final String rawMessage, final String secondMessage, final String hiddenInfo) {
        this.dateTime = dateTime;
        this.message = rawMessage;
        this.secondMessage = secondMessage;
        this.hiddenInfo = hiddenInfo;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public String getMessage() {
        return message;
    }

    public String getSecondMessage() {
        return secondMessage;
    }

    public String getHiddenInfo() {
        return hiddenInfo;
    }

    public Boolean getFail() {
        return fail;
    }

    public File getImage() {
        return image;
    }

    public Throwable getThrowable() {
        return throwable;
    }

    public LogMessage withMessage(final String message) {
        this.message = message;
        return this;
    }

    public LogMessage withSecondMessage(final String secondMessage) {
        this.secondMessage = secondMessage;
        return this;
    }

    public LogMessage withHiddenInfo(final String hiddenInfo) {
        this.hiddenInfo = hiddenInfo;
        return this;
    }

    public LogMessage fail() {
        this.fail = true;
        return this;
    }

    public LogMessage withThrowable(final Throwable throwable) {
        this.throwable = throwable;
        return this;
    }

    public LogMessage withImage(final File image) {
        this.image = image;
        return this;
    }

    public boolean isImageCopied() {
        return imageCopied;
    }

    public LogMessage withImageCopied(final boolean imageCopied) {
        this.imageCopied = imageCopied;
        return this;
    }
}
