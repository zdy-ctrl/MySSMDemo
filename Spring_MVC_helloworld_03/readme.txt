-Dfile.encoding=UTF-8
SpringMVC 获取请求参数
1.通过ServletAPI获取参数
 * 只需要在控制器方法的形参位置设置HttpServletRequest request类型的形参
 * 就可以在控制器方法中使用request对象获取请求参数

2.通过控制器方法的形参获取参数
    只需要在控制器方法的形参位置，设置一个形参，形参的名字和请求参数的名字一致即可

3.@RequestParam：将请求参数和控制器方法的形参绑定
 @RequestParam,注解的三个属性：value,required,defaultValue
 value:设置和形参绑定的请求参数的名字宇
 required:设置是否必须传输value所对应的请求参数
     默认值为true,表示value所对应的请求参数必须传输，否则页面报错：
     400---Required string parameter 'xxx' is not present
     若设置为False,则表示value所对应的请求参数不是必需传输，则形参值为null
 defaultValue：设置当没有传输Value所对应的请求参数时，为形参设置的默认值，此时和required属性值没有关系
 不管required属性值为true或false，当value所指定的请求参数没有传输或传输的值为""时，则使用默认值为形参赋值

 4.@RequestHeader:将请求头信息和控制器方法的形参绑定

 5.@CookieVelue：将cookie数据和控制器方法的形参绑定

 6.通过控制器的方法的实体类类型的形参获取请求参数
   需要在控制器方法的形参位置设置实体类类型的形参，要保证实体类中的属性名和请求参数的名字一致
   可以通过实体类类型的形参来获取请求参数