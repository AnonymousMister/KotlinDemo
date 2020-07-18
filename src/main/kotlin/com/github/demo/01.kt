package com.github.demo

/**
 * 基本类型说明
 */
var age: Int=18
var name:String="h"
//类型后面的问好代表 可以是空的
var name2:String?=null

fun main(ages:Array<String>){

    name= name2!!//俩个感叹号代表强转

    name2= name


    prin(name)

}



fun prin(v:Any):String?{

    println(v)

    return  null
}