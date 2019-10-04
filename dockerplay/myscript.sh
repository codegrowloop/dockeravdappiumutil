#!/bin/bash
if [ "$(uname)" == "Darwin" ]; then
    /usr/bin/ruby -e "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/master/install)"
    export PATH="/usr/local/bin:$PATH"
    brew install docker
    docker run -p $2:4723 --name $1 85bd49af84a1
    docker images
    docker ps
elif [ "$(expr substr $(uname -s) 1 5)" == "Linux" ]; then
    echo linux# Do something under GNU/Linux platform
fi