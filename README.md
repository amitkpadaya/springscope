# springscope


ADoa is signteltonbean and JDBCTemplate is protoTypebean
then ADao doesnot know its calling jdbctempalte as prototype bean hence its will return

o/p

com.my.scope.scopetesting.ADoa@669d2b1b
com.my.scope.scopetesting.JDBCTemplate@4163f1cd
com.my.scope.scopetesting.ADoa@669d2b1b
com.my.scope.scopetesting.JDBCTemplate@4163f1cd

but by adding below line at jdbctemplate class, tempalte class act as proxy and return new instance every time.

@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE,proxyMode = ScopedProxyMode.TARGET_CLASS)

o/p
com.my.scope.scopetesting.ADoa@669d2b1b
com.my.scope.scopetesting.JDBCTemplate@4163f1cd
com.my.scope.scopetesting.ADoa@669d2b1b
com.my.scope.scopetesting.JDBCTemplate@5fa05212