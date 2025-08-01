# Sistema de Control de Pedidos - Tacos López 

Este proyecto es un sistema sencillo de control de pedidos desarrollado para el puesto de tacos **Tacos López**, ubicado en Monterrey, Nuevo León. El sistema está diseñado para ejecutarse de forma local y facilitar el registro, consulta y seguimiento de pedidos diarios.

Objetivo

Modernizar el proceso de toma de pedidos y ventas, el cual actualmente se realiza en papel, mediante una herramienta digital simple y funcional que:

- Permita **registrar pedidos** con número único, descripción y precio.
- Permita **consultar, editar o eliminar** un pedido por su número.
- Permita **marcar pedidos como completados** para llevar un historial.
- No requiere usuarios ni contraseñas (uso local directo).
- Funciona sin conexión a internet.

Características

- Registro de pedidos con campos: número, descripción y precio.
- Consulta rápida por número de pedido.
- Opción de editar, cancelar o completar un pedido.
- Interfaz en consola o básica (fase inicial beta).
- Desarrollo en Java con estructura clara y pruebas unitarias.
- Integración continua configurada (Travis CI, GitHub Actions, etc.).

Tecnologías

- Java 17
- Git + GitHub
- Pruebas con JUnit 5
- Sistema de gestión de tareas con Zube
- Integración continua (CI) con Travis CI

Estructura del proyecto

tacos-lopez-pedidos/
├── src/
│ └── main/
│ └── java/
│ └── com/
│ └── tacoslopez/
│ └── Pedido.java
├── test/
│ └── java/
│ └── com/
│ └── tacoslopez/
│ └── PedidoTest.java
├── .travis.yml
├── README.md
└── ...

Cómo usarlo (fase inicial)

1. Clona este repositorio
2. Abre el proyecto en Visual Studio Code o tu IDE de preferencia
3. Ejecuta el archivo principal o pruebas para validar funcionalidad

Contribución

Este proyecto forma parte del **proyecto integrador académico** del Certificado en Computación Avanzada en Java (Universidad Tecmilenio). Aprobado por el dueño del negocio para fines educativos y de mejora real del proceso operativo.