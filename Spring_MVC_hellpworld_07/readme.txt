request.getReader()
    // 1.由于请求体数据有可能很大，所以Servlet标准在设计API的时候要求我们通过输入流来读取
    BufferedReader reader = request.getReader();
    // 2.创建StringBuilder对象来累加存储从请求体中读取到的每一行
    StringBuilder builder = new StringBuilder();
    // 3.声明临时变量
    String bufferStr = null;
    // 4.循环读取
    while((bufferStr = reader.readLine()) != null) {
        builder.append(bufferStr);
    }
    // 5.关闭流
    reader.close();
    // 6.累加的结果就是整个请求体
    String requestBody = builder.toString();

    // 7.创建Gson对象用于解析JSON字符串
    Gson gson = new Gson();
    // 8.将JSON字符串还原为Java对象
    Student student = gson.fromJson(requestBody, Student.class);
    System.out.println("student = " + student);
    System.out.println("requestBody = " + requestBody);
    response.setContentType("text/html;charset=UTF-8");
    response.getWriter().write("服务器端返回普通文本字符串作为响应");


    springmvc的方法
     *  1.@RequestBody :将请求体中的内容和控制器方法的形式参数进行绑定
     *  2.使用@RequestBody注解将json格式的请求参数转换为java对象
     *      a》导入jackson的依赖
     *      b》在springMVC的配置文件中设置<mvc:default-servlet-handler/>开启SpringMVC的注解驱动
     *      c》在处理请求的控制器方法的形参位置，直接设置json格式的请求参数要转换的java类型的形参,然后使用@RequestBody注解标识即可