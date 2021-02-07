/*
 * @Description: an optional part of Lab 8
 * @Version: 1.0.0.20210207
 * @Author: Arvin Zhao
 * @Date: 2021-02-07 16:09:12
 * @Last Editors: Arvin Zhao
 * @LastEditTime: 2021-02-07 16:30:31
 */

package com.isarvin;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloWorldTest
{
    /**
     * Test if the method {@code generateMessage()} of the class {@code HelloWorld} works as expected.
     */
    @Test
    void generateMessageTest()
    {
        assertEquals("Arvin Zhao: Maven - Hello World! :-)", new HelloWorld("Arvin Zhao").generateMessage(), "HelloWorld.generateMessage() should return a proper message with the owner's name.");
    } // end method generateMessageTest
} // end class HelloWorldTest