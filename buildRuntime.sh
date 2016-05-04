#!/bin/bash

rm -rf skyruntime
jlink --modulepath /usr/lib/jvm/java-9-openjdk-amd64/jmods/:mods --addmods com.sky.eligibility,com.sky.rewards --output skyruntime
