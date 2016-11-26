buildscript {
	val springBootVersion = "1.4.2.RELEASE"
	val kotlinVersion = "1.0.5-2"
	extra["kotlinVersion"] = kotlinVersion

	repositories {
		mavenCentral()
	}

	dependencies {
		classpath("org.springframework.boot:spring-boot-gradle-plugin:${springBootVersion}")
		classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:${kotlinVersion}")
	}
}

apply {
	plugin("kotlin")
	plugin("org.springframework.boot")
}

version = "0.0.1-SNAPSHOT"

configure<JavaPluginConvention> {
	setSourceCompatibility(1.8)
	setTargetCompatibility(1.8)
}

repositories {
	mavenCentral()
}

val kotlinVersion = extra["kotlinVersion"] as String

dependencies {
	compile("org.springframework.boot:spring-boot-starter-web")
	compile("org.springframework.boot:spring-boot-starter-data-jpa")
	compile("com.h2database:h2")
	compile("org.jetbrains.kotlin:kotlin-stdlib:${kotlinVersion}")
	compile("com.fasterxml.jackson.module:jackson-module-kotlin:2.8.4")
	testCompile("org.springframework.boot:spring-boot-starter-test")
}

