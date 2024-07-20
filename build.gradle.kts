import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar
import org.gradle.api.tasks.Copy
import org.ajoberstar.grgit.Grgit


plugins {
    id("java")
    id("com.github.johnrengelman.shadow") version "7.1.2"
    id("net.minecrell.plugin-yml.bukkit") version "0.3.0"
    id("org.ajoberstar.grgit") version "5.0.0-rc.3"
}

group = "br.com.unidade"
version = "1.0.0"



repositories {
    mavenCentral()
    maven {
        url = uri("https://jitpack.io")
    }
}

dependencies {
    implementation("org.projectlombok:lombok:1.18.32")
    annotationProcessor("org.projectlombok:lombok:1.18.32")
    implementation("com.github.skipdevelopment:command-framework:1.0.0")

    compileOnly("com.github.skipdevelopment:pluto-spigot:1.0")
}

tasks {
    shadowJar {
        dependencies {
            exclude("mysql:mysql-connector-java:8.0.33")
            exclude("org.projectlombok:lombok:1.18.32")
            exclude("com.github.skipdevelopment:pluto-spigot:1.0")
        }
    }
}

tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
}

bukkit {
    main = "br.com.unidade.bukkit.example.BukkitMain"
    name = "Example"
    version = "1.0.0-" + grgit.head().abbreviatedId
    description = "Example plugin to showcase the functionality of the command framework."
    website = "https://github.com/skipdevelopment"
    author = "unidade"
}
