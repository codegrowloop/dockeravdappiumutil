#!/bin/bash
if [ "$(uname)" == "Darwin" ]; then
    /usr/bin/ruby -e "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/master/install)"
    export PATH="/usr/local/bin:$PATH"
    
    brew install docker
    
    docker run -e HTTP_PROXY=lum-customer-octi-zone-houston_datacenter-ip-216.158.195.243:xglkj2lklhub@zproxy.lum-superproxy.io:22225 \
    -e HTTPS_PROXY=lum-customer-octi-zone-houston_datacenter-ip-216.158.195.243:xglkj2lklhub@zproxy.lum-superproxy.io:22225 \
     -p $2:4723 --name $1 appium/appium-emulator
     
    docker images
    docker ps
elif [ "$(expr substr $(uname -s) 1 5)" == "Linux" ]; then
    echo linux# Do something under GNU/Linux platform
fi