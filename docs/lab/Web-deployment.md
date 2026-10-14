# Parte 4 — Configuración de una página web personalizada

## Objetivo

Configurar una página web personalizada para mostrarla al consultar nuestro servidor, siendo este el primer paso para visualizar el funcionamiento de OpsCenter desde un navegador.

## Procedimiento

1. Utilizamos el comando `ls` para mostrar los archivos de un directorio.

2. Agregamos la opción `-l` para mostrar información detallada de los archivos, incluyendo sus permisos, propietarios y tamaños.

3. Consultamos el directorio predeterminado de Nginx mediante el comando:

   `ls -l /var/www/html`

   Identificamos el archivo `index.nginx-debian.html`, correspondiente a la página de bienvenida de Nginx.

4. Ejecutamos `ls -ld /var/www/html`, utilizando las opciones `-l` y `-d` para revisar los permisos del directorio como tal.

5. Confirmamos que el directorio pertenece al usuario `root`, por lo que necesitamos permisos administrativos para modificar su contenido.

6. Utilizamos Nano como editor de texto para crear un nuevo archivo llamado `index.html` mediante el comando:

   `sudo nano /var/www/html/index.html`

7. Dentro del archivo escribimos una estructura HTML básica para mostrar el nombre de OpsCenter y un mensaje de funcionamiento del servidor. Guardamos los cambios y salimos del editor.

8. Confirmamos la creación del archivo mostrando nuevamente el contenido del directorio mediante el comando:

   `ls -l /var/www/html`

9. Desde nuestra computadora con Windows, ingresamos a la dirección:

   `http://192.168.1.26`

   Confirmamos que Nginx mostraba nuestra página personalizada en lugar de la página de bienvenida predeterminada.

10. Finalmente, verificamos las respuestas HTTP utilizando los siguientes comandos:

    **Desde Ubuntu:**

    `curl -I http://localhost`

    **Desde Windows:**

    `curl.exe -I http://192.168.1.26`

    En ambas pruebas obtuvimos una respuesta `HTTP/1.1 200 OK`, confirmando que el servidor respondía correctamente a las solicitudes.

## Resultado

Se logró configurar y publicar nuestra primera página web personalizada mediante Nginx.

Comprobamos que el servidor entrega correctamente el archivo HTML tanto desde la propia máquina Linux como desde otra computadora conectada a la red local.

Esta práctica representa el primer paso para desarrollar y desplegar la interfaz web de OpsCenter.
