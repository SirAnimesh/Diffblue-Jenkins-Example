# Diffblue with Jenkins

## Installing Jenkins on macOS

```shell
# Install Jenkins
brew install jenkins

# Start Jenkins server
jenkins
```

Visit `localhost:8080` in the browser to complete setup.

## How Jenkins Works

Jenkins Pipeline is a suite of plugins used to implement continuous delivery pipelines in Jenkins.

The definition of a pipeline is written in a file called `Jenkinsfile`.

Pipelines are made of "steps" – can crudely think of them as a single command. Use `sh` to execute
a command in Linux/macOS containers and `bat` in Windows containers. All examples in this repo use
an Ubuntu container.
