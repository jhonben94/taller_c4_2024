# Temario para Servicios REST con Quarkus

## 1. Conceptos Fundamentales
- **¿Qué es un servicio REST?**
  - Un estilo arquitectónico que utiliza HTTP para interactuar con recursos de manera uniforme.

- **¿Cuáles son los principios del diseño RESTful?**
  - Statelessness, Client-Server, Uniform Interface, Layered System, Code on Demand (opcional), Cacheability.

- **¿Qué es HTTP y cuáles son los métodos HTTP más comunes? (GET, POST, PUT, DELETE)**
  - Protocolo de transferencia de hipertexto utilizado para la comunicación en la web. Los métodos definen la acción a realizar sobre un recurso.

- **¿Qué es un recurso en el contexto de un servicio REST?**
  - Cualquier entidad que puede ser accedida o manipulada mediante un servicio REST.

- **¿Qué es un endpoint?**
  - Una URL que representa un recurso y a través de la cual se accede a dicho recurso.

## 2. Estructura de un Servicio REST
- **¿Qué es un URI y cómo se define?**
  - Identificador uniforme de recursos, que define la localización de un recurso en la web.

- **¿Qué es una API RESTful?**
  - Interfaz de programación que sigue los principios REST para permitir la interacción con recursos.

- **¿Qué son los códigos de estado HTTP y cómo se usan en REST?**
  - Respuestas estándar de HTTP que indican el resultado de la solicitud realizada por el cliente.

- **¿Qué es JSON y por qué se usa comúnmente en APIs REST?**
  - Formato de intercambio de datos ligero y legible por humanos, ampliamente utilizado para la comunicación entre clientes y servidores.


## 7. Códigos HTTP de Respuesta
| **Código** | **Nombre**                    | **Descripción**                                                                 |
|------------|--------------------------------|---------------------------------------------------------------------------------|
| **100**    | Continue                       | El servidor ha recibido los encabezados de la solicitud y el cliente debe continuar enviando el cuerpo de la solicitud. |
| **101**    | Switching Protocols            | El servidor acepta cambiar el protocolo conforme lo solicita el cliente.        |
| **200**    | OK                             | La solicitud fue exitosa.                                                       |
| **201**    | Created                        | La solicitud fue exitosa y se creó un nuevo recurso.                            |
| **202**    | Accepted                       | La solicitud ha sido aceptada para procesamiento, pero no se ha completado.     |
| **204**    | No Content                     | La solicitud fue exitosa, pero no hay contenido para enviar en la respuesta.    |
| **301**    | Moved Permanently              | El recurso solicitado se ha movido permanentemente a una nueva URL.             |
| **302**    | Found                          | El recurso solicitado se ha movido temporalmente a una nueva URL.               |
| **304**    | Not Modified                   | El recurso no ha sido modificado desde la última solicitud.                     |
| **400**    | Bad Request                    | La solicitud no se puede procesar debido a un error del cliente.                |
| **401**    | Unauthorized                   | El cliente debe autenticarse para obtener la respuesta solicitada.              |
| **403**    | Forbidden                      | El cliente no tiene permisos para acceder al recurso.                           |
| **404**    | Not Found                      | El servidor no pudo encontrar el recurso solicitado.                            |
| **405**    | Method Not Allowed             | El método HTTP utilizado no está permitido para el recurso solicitado.          |
| **409**    | Conflict                       | La solicitud no se puede completar debido a un conflicto con el estado actual del recurso. |
| **429**    | Too Many Requests              | El cliente ha enviado demasiadas solicitudes en un corto período de tiempo.     |
| **500**    | Internal Server Error          | El servidor encontró una situación que no sabe cómo manejar.                    |
| **502**    | Bad Gateway                    | El servidor estaba actuando como gateway o proxy y recibió una respuesta inválida. |
| **503**    | Service Unavailable            | El servidor no está disponible actualmente (por sobrecarga o mantenimiento).    |
| **504**    | Gateway Timeout                | El servidor estaba actuando como gateway o proxy y no recibió una respuesta a tiempo. |

