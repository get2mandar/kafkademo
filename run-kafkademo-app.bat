@ECHO OFF
:BEGIN
CLS

CALL %JAVA11_HOME%\bin\java -jar -Xss512k target\kafkademo-0.1.jar


:END
pause