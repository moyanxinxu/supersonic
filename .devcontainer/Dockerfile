FROM moyanxinxu/self-ubuntu-myxx

RUN apt-get install -y default-jdk maven && \
    rm -rf /var/lib/apt/lists/*
RUN curl -o- https://raw.githubusercontent.com/nvm-sh/nvm/v0.39.1/install.sh | bash
RUN git config --global user.name "moyanxinxu" && \
    git config --global user.email wwxy.mail@gmail.com

CMD ["/bin/bash"]