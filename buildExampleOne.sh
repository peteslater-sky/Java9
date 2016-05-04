#!/bin/bash

mkdir -p mods/com.sky.helloworld
javac -d mods/com.sky.helloworld src/com.sky.helloworld/module-info.java src/com.sky.helloworld/com/sky/helloworld/Main.java
