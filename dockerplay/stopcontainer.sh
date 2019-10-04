#!/bin/bash
if [ "$(uname)" == "Darwin" ]; then
    /usr/bin/ruby -e "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/master/install)"
    export PATH="/usr/local/bin:$PATH"
    brew install docker
    docker stop $1
    docker rm $1
elif [ "$(expr substr $(uname -s) 1 5)" == "Linux" ]; then
    echo linux# Do something under GNU/Linux platform
fi