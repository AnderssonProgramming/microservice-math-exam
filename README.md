# Parcial Segundo Corte - AREP (Arquitecturas Empresariales)

## Problema
 
- Diseñar, construir y desplegar una aplicación web para investigar el problema matemático asignado. 
- El programa debe estar desplegado en AWS. 
- Las tecnologías usadas en la solución deben ser Maven, Git, GitHub, Spring, HTML5 y js.
- No usar librerías adicionales.

## Contexto
- Diseñar un prototipo de sistema de microservicios que tenga un servicio como el de la figura para computar las funciones numéricas.
- El servicio de las funciones numéricas debe estar desplegado en al menos dos instancias virtuales de EC2.
- Implementar un service proxy que reciba las solicitudes de llamado desde los clientes  y se las delegue a las dos instancias del servicio numérico usando un algoritmo de round-robin. 
- El proxy deberá estar desplegado en otra máquina EC2. 
- Configurar las direcciones y puertos de las instancias del servicio en el proxy usando variables de entorno del sistema operativo.  
- Construir un cliente Web mínimo con un formulario que reciba el valor y de manera asíncrona invoke el servicio en el PROXY. 
- Hacer un formulario para cada una de las funciones.
- El cliente debe ser escrito en HTML y JS.

![General Diagram](images/architecture-diagram.png)

## Detalles adicionales de la arquitectura y del API

- Construir una aplicación web para investigar este problema.
- Cliente asíncrono que corra en el browser escrito en HTML5 y JS (No usar librerías, solo html JS básico). 
- El cliente NO COMPUTA LA SECUENCIA DIRECTAMENTE, sino que la delega a un servicio REST corriendo en AWS.
- El servicio REST puede ser GET o POST.
- Se debe construir la aplicación usando Spring Boot y desplegarla en un contenedor corriendo en AWS.
- Usar los mejores estándares de diseño, arquitectura y programación.

## Referencias

- https://docs.oracle.com/javase/8/docs/api/
- https://spring.io/guides/gs/rest-service
- https://docs.aws.amazon.com/corretto/latest/corretto-17-ug/amazon-linux-install.html
- AWS Academy
- AWS