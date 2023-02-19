#!/usr/bin/groovy
package ci;

def printOptions(options = []) {
  // do not use echo: MissingMethodException
  echo "this is module"
  for(int i = 0; i < options.size(); i++) {
    echo options[i]
    sh "echo ${options[i]}"
  }
}
