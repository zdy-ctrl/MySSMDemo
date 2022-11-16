SpringMVC的视图(四种方式)默认为转发视图和重定向视图

    ThymeleafView方式(之前的方式)
    控制器方法直接返回设置的视图名称，然后在由springmvc-servlet.xml的配置文件中设置的thymeleaf视图解析器解析，视图名称拼接视图前缀和后缀
    mv = ha.handle(processedRequest, response, mappedHandler.getHandler());

    转发视图InternalResourceView
    forward:/testHello

    重定向视图RedirectView
    redirect:/
