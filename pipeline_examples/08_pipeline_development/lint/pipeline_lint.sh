 #!/bin/bash

 curl -XPOST --user id:pw -F "jenkinsfile=<mvn_build"  $JENKINS_URL/pipeline-model-converter/validate