#!/bin/bash

# This script builds the Maven project and puts only the necessary files
# into this directory (where this script is located) in order to reduce
# the files sent to the Docker daemon when building the image.
#
# Run this script first before running the "docker build" command.

build_dir=`dirname $0`
jar_dir=${build_dir}/target
proj_dir=${build_dir}/..
mvn -f ${proj_dir}/pom.xml clean package

mkdir -p ${jar_dir}
rm -f ${jar_dir}/*
mv ${proj_dir}/target/*-exec.jar ${jar_dir}/

mvn -f ${proj_dir}/pom.xml clean

