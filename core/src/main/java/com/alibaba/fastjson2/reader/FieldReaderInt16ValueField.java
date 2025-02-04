package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.TypeUtils;

import java.lang.reflect.Field;

final class FieldReaderInt16ValueField<T> extends FieldReaderObjectField<T> {
    FieldReaderInt16ValueField(String fieldName, Class fieldType, int ordinal, Field field) {
        super(fieldName, fieldType, fieldType, ordinal, 0, null, field);
    }

    public void readFieldValue(JSONReader jsonReader, T object) {
        int fieldInt = jsonReader.readInt32Value();
        try {
            field.setShort(object, (short) fieldInt);
        } catch (Exception e) {
            throw new JSONException("set " + fieldName + " error", e);
        }
    }

    public void accept(T object, Object value) {
        try {
            field.setShort(object, TypeUtils.toShortValue(value));
        } catch (Exception e) {
            throw new JSONException("set " + fieldName + " error", e);
        }
    }

    public void accept(T object, int value) {
        try {
            field.setShort(object, (short) value);
        } catch (Exception e) {
            throw new JSONException("set " + fieldName + " error", e);
        }
    }

    public void accept(T object, long value) {
        try {
            field.setShort(object, (short) value);
        } catch (Exception e) {
            throw new JSONException("set " + fieldName + " error", e);
        }
    }

    public Object readFieldValue(JSONReader jsonReader) {
        return (short) jsonReader.readInt32Value();
    }
}
