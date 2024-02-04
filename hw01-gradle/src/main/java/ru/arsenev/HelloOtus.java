package ru.arsenev;

import com.google.common.base.MoreObjects;

@SuppressWarnings({"java:S106", "java:S1124"})
public class HelloOtus {

    public static final String COMPANY_NAME = "OTUS";
    public static final String STUDENT_NAME = "Арсеньев В.О.";

    public static void main(String... args) {
        System.out.println(new HelloOtus());
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .omitNullValues()
                .addValue("Привет, " + COMPANY_NAME + "!!!")
                .addValue("Я - твой ученик: " + STUDENT_NAME)
                .toString();
    }
}
