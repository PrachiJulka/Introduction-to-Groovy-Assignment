package com.ttn
/*
Print this pattern using groovy:


*
**
****
********
*/

class Question3 {

            static void main(args){
                int num=1
                int n=1
                (1..4).each {
                     num=num*n
                    1.upto(num){
                        print "*"
                    }
                    n=2
                   println("")
                }

            }


}
