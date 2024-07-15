# DemoBlaze Purchase Automation

Este proyecto automatiza el flujo de compra en la página web [Demoblaze](https://www.demoblaze.com/) utilizando Serenity BDD con Screenplay, Cucumber y Selenium WebDriver.

## Requisitos

- Java JDK 11 o superior
- Maven 3.6.3 o superior
- Google Chrome
- ChromeDriver compatible con la versión de Chrome instalada

## Configuración

1. Clonar este repositorio:

    ```bash
    git clone https://github.com/keviin427/DemoBlazeFlujo.git
    cd DemoBlazeProyecto
    ```

2. Configurar el archivo `serenity.properties` con los detalles necesarios para la ejecución de las pruebas.

3. Asegurarse de tener las dependencias de `ChromeDriver` y `WebDriver` correctas en el archivo `pom.xml`.

## Ejecución de Pruebas

Para ejecutar las pruebas, usa el siguiente comando en el directorio raíz del proyecto:

```bash
mvn clean verify

Después de ejecutar las pruebas, los reportes de Serenity estarán disponibles en el directorio target/site/serenity/.
