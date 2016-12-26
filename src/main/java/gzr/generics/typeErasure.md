#### 泛型擦除
 参考[类型擦除以及类型擦除带来的问题](http://blog.csdn.net/lonelyroamer/article/details/7868820)

* 类型擦除
</br>
Java中的泛型基本上都是在编译器这个层次来实现的。在生成的Java字节码中是不包含泛型中的类型信息的。使用泛型的时候加上的类型参数，会在编译器在编译的时候去掉。这个过程就称为类型擦除。
如在代码中定义的List\<Long\>和List\<String\>等类型，在编译后都会编程List。JVM看到的只是List，而由泛型附加的类型信息对JVM来说是不可见的。