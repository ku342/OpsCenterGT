# Configuración del firewall UFW en Ubuntu

## Objetivo

Mejorar la seguridad de nuestro servidor Linux mediante la configuración del firewall UFW, permitiendo únicamente las conexiones necesarias para nuestros servicios.

## Procedimiento

1. Primero confirmamos el estado actual del firewall mediante el comando:

   `sudo ufw status verbose`

   Obtuvimos como respuesta `Status: inactive`, indicando que el firewall estaba desactivado.

2. Antes de habilitar el firewall, permitimos las conexiones SSH y HTTP para evitar bloquear el acceso remoto y el servidor web.

3. Ejecutamos los siguientes comandos para agregar las reglas necesarias:

   **Permitir conexiones SSH (puerto 22):**

   `sudo ufw allow OpenSSH`

   **Permitir conexiones HTTP de Nginx (puerto 80):**

   `sudo ufw allow 'Nginx HTTP'`

   UFW confirmó la creación de las reglas mediante el mensaje `Rules updated`.

4. Activamos nuestro firewall UFW mediante el comando:

   `sudo ufw enable`

   Obtuvimos el mensaje `Firewall is active and enabled on system startup`, confirmando que el firewall estaba activo y que se iniciaría automáticamente con el sistema.

5. Confirmamos la configuración del firewall mediante el comando:

   `sudo ufw status verbose`

   Verificamos los siguientes resultados:

   - **Status: active:** el firewall está habilitado.
   - **Default: deny (incoming):** las conexiones entrantes no autorizadas se bloquean por defecto.
   - **Default: allow (outgoing):** las conexiones salientes se permiten por defecto.
   - **22/tcp (OpenSSH): ALLOW IN:** conexiones SSH permitidas.
   - **80/tcp (Nginx HTTP): ALLOW IN:** conexiones HTTP permitidas.

6. Finalmente, desde nuestra computadora con Windows, accedimos nuevamente a la dirección:

   `http://192.168.1.26`

   Confirmamos que Nginx seguía mostrando su página de bienvenida después de activar el firewall.

## Resultado

Se logró habilitar y configurar el firewall UFW correctamente en nuestro servidor Ubuntu.

Se establecieron reglas para permitir las conexiones SSH y HTTP, manteniendo bloqueadas por defecto las demás conexiones entrantes que no hayan sido autorizadas.

También se comprobó que el servidor web Nginx continuaba funcionando después de habilitar el firewall.
