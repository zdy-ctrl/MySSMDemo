域对象共享数据
    1.使用ServletAPI向Request域对象中共享数据
    2.使用ModelAndView向Request域对象中共享数据
        使用ModelAndView时，可以使用其Model功能向请求域共享数据
        使用View功能设计逻辑视图，但是控制器方法一定要将ModelAndView作为方法的返回值
    3.使用Model向Request域对象中共享数据

    4.使用ModeMap向Request域对象中共享数据

    5.使用map向Request域对象中共享数据

向session域对象共享数据
    使用Session域对象共享数据时thymeleaf ：<h1><p th:text="${session.testSession}"></p></h1>
向application域对象中共享数据
    使用Application域对象共享数据时thymeleaf ：<h1><p th:text="${application.testApplication}"></p></h1>
