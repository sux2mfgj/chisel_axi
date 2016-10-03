
SRC	:= src/main/scala/axi4.scala

TARGET	:= 

all:
	sbt "run --backend v --targetDir ./output"

clean:
	rm -rf output project target
