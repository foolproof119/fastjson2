package com.alibaba.fastjson.issue_3600;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import junit.framework.TestCase;

import java.util.Base64;

public class Issue3631 extends TestCase {
    public void test_issue_1() throws Exception {
        try {
            JSON.parse("{[-");
        } catch (JSONException unused) {
            // skip
        }
    }

    public void test_issue_2() throws Exception {
        try {
            JSON.parse("TreeSet[[]");
        } catch (JSONException unused) {
            // skip
        }
    }

    public void test_issue_3() throws Exception {
        try {
            JSON.parse(btoa("WywsIiIMLCIAAAAMAAAgAAAAdWUgdAAAAA1ubHUlbDMyMjIABAAAADIyMjISMjNbW1ukHh4eHh4eHh4eHh4eHh4eHh4eHh4eHh4eHh4eHh4eHh4eHh4eHh4eHiBUZA17W3tbCTg0DQooIHRleHQuIEFuZCAgNDRUBDQ0LCwoLCwsLCwsKSwsLCwsLCwsLCwsLCwsnf8sLCwsLCwsMiwsLG51bA9sLCwqLCwsLCwsLCwsLCwsLCwsLCwoLCwsLCwsKSx077+9LCwsLBAsLCwsLCwoLCwsLCwsKSx077+9LCwsLCwyLCwsLCwsLCwsLFtbW1uhpJ3/GiwsLCwsLDIsLCwsLCwsQSw8LCwsLHtbW1sAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHtbAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHsnw4QAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAWw1dLAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAW10AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAANAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAABdAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAW6Gknf8sLCwsLCwsLCwsLCwsWywsLCwsLCwsLCwsLCwsLCwsKCwsLCwsLCksLCwsLCwsLCwsLCwsLJ3/LCwsLCwsLDIsLCxudWxsLCwqLCwsLCwsLCwsLCwsLCwsLCwoLCwsLCwsKSx077+9LCwsLCwsLCwsLCwoLCwsLCwsKSx07zV1bmRlZmluZW5kACwsLCwsLFtbW1uhpJ3/GiwsLCwsLDIsLCwsLCwsQSw8LCwsLHtbW1tboaSd/ywsLCwsLCwsLCwsLCxbLCwsLCwsLCwsLCwsLCwsLCwsLEEsPCwsLCx7W1tbW6Gknf8sLCwsLCwsLCwsLCwsLCwsLCgsLCwsLCwpLCwsLCwsLCwsLCwsLCyd/ywsLCwsLCwyLCwsbnVsbCwsKiwsLCwsLCwsLCwsLCwsLCwsKCwsLCwsLCksdO+/vSwsLCwsMSwsLCwsLCwsLCxbW1tboaSd/xosLCwsLCwyLCwsLCwsLCwsLCws"));
        } catch (JSONException unused) {
            // skip
        }
    }

    public static String btoa(String base64) {
        return new String(Base64.getDecoder().decode(base64));
    }
}
