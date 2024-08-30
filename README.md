1.clean and Install maven project
2.generate the jar in the target folder
3.docker build -t kafka-consumer .
4.Trusted package always just specify till package name
    ex : com.kafka.*  is correct
    ex : com.kafka.dto.* is wrong
    ex:  com.kafka.dto is correct 

For Commit the Changes into GIT
  open the application in terminal and execute git init.
  setup the manage Remote connection for new application.
then open the commit tab and do commit push