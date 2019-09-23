##说明
- 测试Springboot+mybatis整合mysql;
- 由于本地工具库没有对应的web和mybatis模块，pom修改较多。
- 本例为Demo看待

##搭建
- 生成文件，检查pom文件引入全部依赖
- 测试helloController进行访问测试

#开发
- pom中引入数据库驱动、连接池等依赖
- 配置数据库连接池
- 引入mybatis的配置文件
- 创建DataSource及配置
- SQLSessionFactory的配置


##问题总结
- Intellij idea 下@autowired报红线解决(在service加注解@Repository就好)
- MyBatis 逆向工程生成的.xml文件中经常出现方法id重复，需检查处理