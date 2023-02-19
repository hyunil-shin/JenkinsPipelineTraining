#!/usr/bin/groovy
package ci;

def abc(param1, param2) {
  node('master') {
    sh "echo parameters: ${param1}, ${param2}"
    sh "echo jenkins parameters: ${params.env}"
        
    def util = new Util()
    util.printOptions([param1, param2])   
  }
}
