# Instalación y verificación de Nginx

## Objetivo

Levantar un servidor web mediante Nginx y confirmar su correcto funcionamiento.

## Procedimiento

1. **Instalación de Nginx.**

2. Nos conectamos remotamente al servidor Linux mediante una sesión SSH, confirmando que tenemos conectividad.

3. Confirmamos que tenemos permisos de administrador (`sudo`) en Linux mediante el comando:

   `sudo whoami`

4. Ejecutamos la instalación del servicio Nginx mediante el comando:

   `sudo apt install nginx`

5. Verificamos que Nginx estuviera instalado y en ejecución mediante el comando:

   `systemctl status nginx`

   Confirmamos que el estado del servicio era `active (running)`.

6. Desde nuestra computadora con Windows, ingresamos la dirección IP del servidor en el navegador:

   `http://192.168.1.26`

7. Confirmamos que la conexión se estableció correctamente al recibir la página de bienvenida de Nginx.

## Resultado

Se logró instalar y ejecutar Nginx en nuestro servidor Linux. También se comprobó que el servicio responde correctamente a peticiones HTTP desde otra computadora conectada a la misma red local.
