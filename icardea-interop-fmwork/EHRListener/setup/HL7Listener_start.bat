@echo off

title HL7Listener
:run
mvn exec:java -Dexec.mainClass="gr.forth.ics.icardea.listener.ListenerService" -Dexec.classpathScope=runtime -e
