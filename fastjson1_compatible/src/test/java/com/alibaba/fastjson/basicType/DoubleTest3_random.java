package com.alibaba.fastjson.basicType;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.serializer.SerializerFeature;
import junit.framework.TestCase;

import java.util.Collections;
import java.util.HashMap;
import java.util.Random;

public class DoubleTest3_random extends TestCase {
    public void test_extract() throws Exception {
        double val = 7.754693899073573E-4;
        String str = JSON.toJSONString(new Model(val));
        System.out.println(str);
        Model m = JSON.parseObject(str, Model.class);

        assertEquals(val, m.value);
    }

    public void test_ran() throws Exception {
        Random rand = new Random();

        for (int i = 0; i < 1000 * 1000 * 1; ++i) {
            double val = rand.nextDouble();

            String str = JSON.toJSONString(new Model(val));
            Model m = JSON.parseObject(str, Model.class);

            assertEquals(val, m.value);
        }
    }

    public void test_ran_2() throws Exception {
        Random rand = new Random();

        for (int i = 0; i < 1000 * 1000 * 1; ++i) {
            double val = rand.nextDouble();

            String str = JSON.toJSONString(new Model(val), SerializerFeature.BeanToArray);
            Model m = JSON.parseObject(str, Model.class, Feature.SupportArrayToBean);

            assertEquals(val, m.value);
        }
    }

    public void test_ran_3() throws Exception {
        Random rand = new Random();

        for (int i = 0; i < 1000 * 1000 * 1; ++i) {
            double val = rand.nextDouble();

            String str = JSON.toJSONString(Collections.singletonMap("val", val));
            double val2 = JSON.parseObject(str).getDoubleValue("val");

            assertEquals(val, val2);
        }
    }

    public void test_ran_4() throws Exception {
        Random rand = new Random();

        for (int i = 0; i < 1000 * 1000 * 1; ++i) {
            double val = rand.nextDouble();

            HashMap map = new HashMap();
            map.put("val", val);
            String str = JSON.toJSONString(map);
            double val2 = JSON.parseObject(str).getDoubleValue("val");

            assertEquals(val, val2);
        }
    }

    public static class Model {
        public double value;

        public Model() {

        }

        public Model(double value) {
            this.value = value;
        }
    }
}
