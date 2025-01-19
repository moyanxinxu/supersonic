docker build -t supersonic .
docker run -d --name supersonic \
    -v /Users/moyanxinxu/Documents:/root/Documents \
    -v huggingface:/root/.cache/huggingface \
    -v vscode:/root/.vscode-server \
    -it supersonic /bin/bash