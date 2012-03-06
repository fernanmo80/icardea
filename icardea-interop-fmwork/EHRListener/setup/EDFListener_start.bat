@echo off

title EDFListener
:run
mvn exec:java -Dexec.mainClass="gr.forth.ics.icardea.listener.EDFReceiver" -Dexec.classpathScope=runtime -e
