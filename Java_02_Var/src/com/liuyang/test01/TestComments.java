package com.liuyang.test01;

/**
 *
 *
 * 1.我是一个文档注释
 * 2.这是一个测试文档注释的类
 * 3.在类上加了文档注释,javadoc这个工具可以根据文档注释生成对应的文档说明
 *
 *
 *
 */

public class TestComments {

    /**
     * 1. 这是一个主方法,是程序执行的入口
     * 2. 在主方法上增加了文档注释,也可以生成到文档中
     *
     */
    public static void main(String[] args) {

        /**
         * 1. 这是一个输出语句
         * 2. 作用是将内容输出到控制台上
         * 3. 在语句上加的文档注释,不会被生成到说明文档中
         */
        System.out.println("hellowrold");
    }
}
