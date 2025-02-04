package com.alibaba.fastjson2.v1issues.issue_1700;

import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONReader;
import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Issue1723 {
    @Test
    public void test_for_issue() throws Exception {
        User user = JSON.parseObject("{\"age\":\"0.9390308260917664\"}", User.class);
        assertEquals(0.9390308260917664F, user.age);
    }

    @Test
    public void test_for_issue_1() throws Exception {
        User user = JSON.parseObject("{\"age\":\"8.200000000000001\"}", User.class);
        assertEquals(8.200000000000001F, user.age);
    }

    @Test
    public void test_for_issue_2() throws Exception {
        User user = JSON.parseObject("[\"8.200000000000001\"]", User.class, JSONReader.Feature.SupportArrayToBean);
        assertEquals(8.200000000000001F, user.age);
    }

    public static class User {
        private float age;
        public float getAge() {
            return age;
        }
        public void setAge(float age) {
            this.age = age;
        }
        @Override
        public String toString() {
            return "User{" +
                    "age=" + age +
                    '}';
        }
    }
}
