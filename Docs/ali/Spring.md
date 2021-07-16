# 底层机制(DI/IOC)
https://blog.csdn.net/fuzhongmin05/article/details/55802816?ops_request_misc=%257B%2522request%255Fid%2522%253A%2522162642087716780269885008%2522%252C%2522scm%2522%253A%252220140713.130102334.pc%255Fall.%2522%257D&request_id=162642087716780269885008&biz_id=0&utm_medium=distribute.pc_search_result.none-task-blog-2~all~first_rank_v2~hot_rank-1-55802816.pc_search_result_cache&utm_term=%E5%BA%95%E5%B1%82%E6%9C%BA%E5%88%B6%28DI%2FIOC%29&spm=1018.2226.3001.4187

### 我对IoC(控制反转)和DI(依赖注入)的理解
　　在平时的java应用开发中，我们要实现某一个功能或者说是完成某个业务逻辑时至少需要两个或以上的对象来协作完成，在没有使用Spring的时候，每个对象在需要使用他的合作对象时，自己均要使用像new object() 这样的语法来将合作对象创建出来，这个合作对象是由自己主动创建出来的，创建合作对象的主动权在自己手上，自己需要哪个合作对象，就主动去创建，创建合作对象的主动权和创建时机是由自己把控的，而这样就会使得对象间的耦合度高了，A对象需要使用合作对象B来共同完成一件事，A要使用B，那么A就对B产生了依赖，也就是A和B之间存在一种耦合关系，并且是紧密耦合在一起，而使用了Spring之后就不一样了，创建合作对象B的工作是由Spring来做的，Spring创建好B对象，然后存储到一个容器里面，当A对象需要使用B对象时，Spring就从存放对象的那个容器里面取出A要使用的那个B对象，然后交给A对象使用，至于Spring是如何创建那个对象，以及什么时候创建好对象的，A对象不需要关心这些细节问题(你是什么时候生的，怎么生出来的我可不关心，能帮我干活就行)，A得到Spring给我们的对象之后，两个人一起协作完成要完成的工作即可。

　　所以控制反转IoC(Inversion of Control)是说创建对象的控制权进行转移，以前创建对象的主动权和创建时机是由自己把控的，而现在这种权力转移到第三方，比如转移交给了IoC容器，它就是一个专门用来创建对象的工厂，你要什么对象，它就给你什么对象，有了 IoC容器，依赖关系就变了，原先的依赖关系就没了，它们都依赖IoC容器了，通过IoC容器来建立它们之间的关系。

　　这是我对Spring的IoC(控制反转)的理解。DI(依赖注入)其实就是IOC的另外一种说法，DI是由Martin Fowler 在2004年初的一篇论文中首次提出的。他总结：控制的什么被反转了？就是：获得依赖对象的方式反转了。

# AOP应用
https://blog.csdn.net/qq_33369905/article/details/105828920?ops_request_misc=%257B%2522request%255Fid%2522%253A%2522162642473116780274135312%2522%252C%2522scm%2522%253A%252220140713.130102334.pc%255Fall.%2522%257D&request_id=162642473116780274135312&biz_id=0&utm_medium=distribute.pc_search_result.none-task-blog-2~all~first_rank_v2~hot_rank-2-105828920.pc_search_result_cache&utm_term=AOP&spm=1018.2226.3001.4187

# spring bean生命周期及注入方式
https://blog.csdn.net/fuzhongmin05/article/details/73389779?ops_request_misc=%257B%2522request%255Fid%2522%253A%2522162643043416780274184478%2522%252C%2522scm%2522%253A%252220140713.130102334.pc%255Fall.%2522%257D&request_id=162643043416780274184478&biz_id=0&utm_medium=distribute.pc_search_result.none-task-blog-2~all~first_rank_v2~hot_rank-5-73389779.pc_search_result_cache&utm_term=spring+bean%E7%94%9F%E5%91%BD%E5%91%A8%E6%9C%9F%E5%8F%8A%E6%B3%A8%E5%85%A5%E6%96%B9%E5%BC%8F&spm=1018.2226.3001.4187

# 工厂模式

# 事物
https://blog.csdn.net/weixin_48272905/article/details/108525283?ops_request_misc=%257B%2522request%255Fid%2522%253A%2522162643064916780366596306%2522%252C%2522scm%2522%253A%252220140713.130102334.pc%255Fall.%2522%257D&request_id=162643064916780366596306&biz_id=0&utm_medium=distribute.pc_search_result.none-task-blog-2~all~first_rank_v2~hot_rank-5-108525283.pc_search_result_cache&utm_term=Spring%E4%BA%8B%E5%8A%A1&spm=1018.2226.3001.4187

# 实战经验（接口多实现等）
