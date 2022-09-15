plugins {
    kotlin("jvm") version "1.5.21"
    idea
    java
    id("org.springframework.boot") version "2.7.3"
    id("io.spring.dependency-management") version "1.0.11.RELEASE"
    kotlin("plugin.spring") version "1.4.30"
    kotlin("plugin.jpa") version "1.5.21"
}

repositories {
    mavenCentral()
}

dependencies {

    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.5.21")
    implementation("org.jetbrains.kotlin:kotlin-reflect:1.5.21")

    developmentOnly("org.springframework.boot:spring-boot-devtools")
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-actuator")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")

    implementation("com.vladmihalcea:hibernate-types-52:2.10.2")
    implementation("org.hibernate:hibernate-core:5.6.1.Final")
    api("org.postgresql:postgresql")
    implementation("org.liquibase:liquibase-core")

}

tasks.withType<Test> {
    useJUnitPlatform()
}