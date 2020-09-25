#!groovy

def call(Closure body) {
  Map config = [:]
  body.resolveStrategy = Closure.DELEGATE_FIRST
  body.delegate = config
  body()
  call(config)
}

def call(Map config = [:]) {
    def buildCmd = "http_proxy=${getProxy()}"
}

return this