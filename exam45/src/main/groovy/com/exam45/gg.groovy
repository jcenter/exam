package com.exam45;

class Toy{
      def toyName                             //会在java代码中声明为私有的，并提供set和get
      def unitPrice
      def method(){                         //此方法在生成的java代码中返回object
          println 'Invoke method!'
      }
      String toString(){"${toyName}"}

      static main(args){

           println "No update and no replication."


   }

 }
