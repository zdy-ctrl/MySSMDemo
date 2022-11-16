RESTful

HiddenHttpMethodFilter

注意：浏览器目前只能发送get和post清求
若要发送put和delete请求，需要在web.xmL中配置一个过滤HiddenHttpMethodFilter
配置了过滤器之后，发送的请求要满足两个条件，才能将请求方式转挽为put或delete
    1,当前请求必须为post
    2,当前请求必须传输请求参数_method，_method的值value才是最终的请求方式


    <!--
        配置默认的servlet处理静态资源
            当前工程的web.xml配置的前端控制器DispathcherServlet的url-pattern是tomcat的web.xml配置的DefaultServlet的url-pattern
            此时，浏览器发送的请求会优先别DispathcherServlet进行处理，但是DispathcherServlet无法处理静态资源
            若配置了<mvc:default-servlet-handler/>,此时浏览器发送的请求都会被DefaultServlrt处理
            若配置了<mvc:default-servlet-handler/>和<mvc:annotation-driven/>此时浏览器发送的请求会先被DispathcherServlet处理，无法处理在交给DefaultServlet处理
    -->