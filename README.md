[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)
![springwolf-core](https://github.com/stavshamir/springwolf/workflows/springwolf-core/badge.svg)
![springwolf-kafka](https://github.com/stavshamir/springwolf/workflows/springwolf-kafka/badge.svg)
![springwolf-amqp](https://github.com/stavshamir/springwolf/workflows/springwolf-amqp/badge.svg)

# Springwolf Core
##### Automated documentation for async APIs built with Spring Boot

### Table Of Contents
- [About](#about)
- [Demo](#demo)
- [Documentation](#documentation)
- [Supported protocols](#supported-protocols)
- [Why you should use it](#why-you-should-use-it)
- [Usage](#usage)
- [Example Projects](#example-projects)
- [Development](#development)

![](screenshot.png)

### About
This project is inspired by [Springfox](https://github.com/springfox/springfox), but instead of documenting REST APIs,
it documents async APIs. 

The resulting document is compliant with the [asyncapi specification](https://www.asyncapi.com/) and is provided as a 
web UI, much like that of Springfox, and allows easy publishing of autogenerated payload examples.

### Demo
You can take a look at a [live demo of springwolf](https://springwolf.github.io/springwolf-ui/).

### Documentation
Sprinwolf documentation is available at [here](https://springwolf.github.io/docs/quickstart).

### Supported protocols
- Kafka
- AMQP (RabbitMQ)

### Why you should use it
In projects using async APIs, you may often find yourself needing to manually send a message to some topic, whether if you
are manually testing a new feature, debugging or trying to understand some flow. This requires:
1. Instantiating a payload object
2. Serializing your payload object 
3. Publishing it by the CLI or some other interface. 

Springwolf exploits the fact you already fully described your consumer endpoint (with listener annotations, such as 
`@KafkaListner`, `@RabbitListener` etc.) and automatically generates an example payload object for the appropriate payload and allows you 
to publish it to the correct channel with a single click.

### Usage
See:
- [Kafka](https://github.com/springwolf/springwolf-core/tree/master/springwolf-plugins/springwolf-kafka-plugin)
- [AMQP](https://github.com/springwolf/springwolf-core/tree/master/springwolf-plugins/springwolf-amqp-plugin)


### Example Projects
- [Kafka](https://github.com/springwolf/springwolf-core/tree/master/springwolf-examples/springwolf-kafka-example)
- [AMQP](https://github.com/springwolf/springwolf-core/tree/master/springwolf-examples/springwolf-amqp-example)


### Development
#### Local Snapshots
To work with local snapshots, run the `publishToMavenLocal` task with `-Dsnapshot=true`.