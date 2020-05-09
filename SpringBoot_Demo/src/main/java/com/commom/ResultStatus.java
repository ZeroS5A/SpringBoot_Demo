package com.commom;

public enum ResultStatus {
    SUCCESS(200, "success"),     //成功
    SERVERERR(4500,"internal error"),//内部错误
    UNKNOWERR(4501,"unknown mistake"),//未知错误
    SERVICE_EXCEPTION(5000, "service exception");

    private final int value;

    private final String reasonPhrase;

    public int value() {
        return this.value;
    }

    public String getReasonPhrase() {
        return this.reasonPhrase;
    }

    ResultStatus(int value, String reasonPhrase) {
        this.value = value;
        this.reasonPhrase = reasonPhrase;
    }

    @Override
    public String toString() {
        return Integer.toString(value);
    }
}
