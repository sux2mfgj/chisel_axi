
SRC	:= src/main/scala/axi4.scala

ifndef
	TARGET	:= lite_slave_test
endif


all:
	sbt "run $(TARGET) --backend v --targetDir ./output"

clean:
	rm -rf output project target
