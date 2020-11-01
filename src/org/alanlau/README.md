# 23种设计模式示例程序

## 介绍
- proxy：代理模式
- cor(chain of responsibility): 责任链模式
- iterator: 迭代器模式
- singleton: 单例模式
- decorator: 装饰器模式
- builder: 建造者模式
- facade: 门面模式 外观模式
- mediator: 调停者模式 仲裁者模式 中介模式
```
对facade 和 mediator 的理解：
    facade 就像是一个公司的前台，客户只需要和他进行交流，前台负责和各个部分交流
    mediator 公司各个部分直接，不进行直接的交流，统一通过一个调停者来进行交流

    这两种模式很相似，facade 是对外的， mediator 是对内而言的

    应用：
        消息中间件，就是一种 mediator 的体现
```