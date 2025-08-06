Sistema de Gestión de Pedidos – Tacos López

Resumen Ejecutivo

#Descripción
Este sistema permite gestionar pedidos en un negocio de comida rápida de forma local. El objetivo es brindar una herramienta simple y funcional para registrar, visualizar, completar y eliminar pedidos desde consola.

#Problema Identificado
Muchos pequeños negocios no cuentan con un sistema eficiente de seguimiento de pedidos, lo cual puede ocasionar pérdida de información, retrasos o confusiones.

#Solución Propuesta
Se desarrolló una aplicación basada en Java que permite realizar operaciones CRUD básicas sobre una lista de pedidos, ejecutándose de forma local con persistencia en memoria. Se utilizó Git y Zube para la planeación, y JUnit para pruebas automáticas.

#Arquitectura
Aplicación Java de consola

Estructura basada en clases (Modelo-Vista-Controlador simplificado)

Pruebas automatizadas con JUnit

Integración continua local

Control de versiones con GitHub

#Tabla de Contenidos
Resumen Ejecutivo

Requerimientos

Instalación

Configuración

Uso

Contribución

Roadmap

#Requerimientos
Sistema operativo: Windows/Linux/macOS

Java: JDK 17

Compilador: javac

Herramientas de desarrollo: Visual Studio Code, Git Bash

Pruebas: JUnit 5

Control de versiones: Git + GitHub

Paquetes adicionales: JUnit (incluido en la carpeta lib)

Integración continua: Localmente, mediante JUnit

#Instalación
¿Cómo instalar el ambiente de desarrollo?
Instalar JDK 17

Instalar Visual Studio Code

Instalar Git y Git Bash

Clonar el repositorio:
git clone https://github.com/Shindrat05/Sistema-pedidos-Tacos-Lopez.git

Abrir el proyecto en Visual Studio Code

#¿Cómo ejecutar pruebas manualmente?
Desde Git Bash, en la raíz del proyecto:
javac -cp "lib/" -d out src/.java test/*.java
java -jar lib/junit-platform-console-standalone.jar -cp "out"

#¿Cómo implementar la solución en producción local?
La aplicación se ejecuta localmente desde consola. Para correrla:
javac -d out src/*.java
java -cp out Main

Nota: La versión actual es ejecutable como archivo .jar en entornos locales. No está desplegada en la nube.

#Configuración
Archivos de configuración
No se requieren archivos externos. La aplicación mantiene los datos en memoria.

#Configuración de requerimientos
Solo es necesario mantener las carpetas /src, /lib, /out y /test como están. Los archivos .java deben estar correctamente ubicados.

#Uso
Manual para usuario final
Ejecutar el archivo principal Main.java

Usar las opciones numeradas:

Crear pedido

Ver pedidos

Marcar como completado

Eliminar

Salir

Manual para administrador
Clonar y ejecutar el sistema localmente

Agregar nuevas funciones si es necesario desde PedidoManager.java

Contribución
#Para colaborar:

Clonar el repositorio:
git clone https://github.com/Shindrat05/Sistema-pedidos-Tacos-Lopez.git

Crear una nueva rama:
git checkout -b nombre-de-tu-rama

Realizar cambios y subir:
git add .
git commit -m "Tu mensaje"
git push origin nombre-de-tu-rama

Crear un Pull Request hacia develop

Esperar revisión y merge por parte del administrador

#Roadmap
Estos son los requerimientos o mejoras a considerar en versiones futuras:

Persistencia con base de datos

Interfaz gráfica (GUI)

Implementación en la nube (Heroku)

Autenticación de usuarios

Reportes automáticos de ventas

Video de Demostración
El video demostrativo será entregado como parte de la entrega final.

#Acceso al Producto
Repositorio en GitHub: https://github.com/Shindrat05/Sistema-pedidos-Tacos-Lopez
Actualmente no está desplegado en la nube.
El archivo .jar puede ejecutarse en cualquier máquina local con Java 17 instalado.

