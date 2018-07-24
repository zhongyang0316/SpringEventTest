## Spring Event
	无配置异步执行线程池时，默认为同步执行
Spring为我们提供的一个事件监听、订阅的实现，内部实现原理是观察者设计模式，设计初衷也是为了系统业务逻辑之间的解耦，提高可扩展性以及可维护性。事件发布者并不需要考虑谁去监听，监听具体的实现内容是什么，发布者的工作只是为了发布事件而已。  
[参考文档](https://segmentfault.com/a/1190000011433514)
[关于Spring Event异步同步区别](https://blog.csdn.net/zhu_tianwei/article/details/72720287)