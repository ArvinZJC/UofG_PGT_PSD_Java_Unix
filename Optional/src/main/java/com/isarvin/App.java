/*
 * @Description: an optional part of Lab 8
 * @Version: 1.0.0.20210207
 * @Author: Arvin Zhao
 * @Date: 2021-02-07 16:09:12
 * @Last Editors: Arvin Zhao
 * @LastEditTime: 2021-02-07 16:29:21
 */

package com.isarvin;

/**
 * Hello world!
 */
class HelloWorld
{
    private final String owner;

    /**
     * Get the owner's name for generating a message.
     * @param owner the owner's name
     */
    HelloWorld(String owner)
    {
        this.owner = owner;
    } // end constructor

    String generateMessage()
    {
        return this.owner + ": Maven - Hello World! :-)";
    } // end method generateMessage
} // end class HelloWorld

class App
{
    public static void main(String[] args)
    {
        System.out.println(new HelloWorld("Arvin Zhao").generateMessage());
    } // end main
} // end class App