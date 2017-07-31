buildscript {
	val springBootVersion = "1.5.4.RELEASE"
	val kotlinVersion = "1.1.3"

	repositories {
		mavenCentral()
	}

	dependencies {
		classpath("org.springframework.boot:spring-boot-gradle-plugin:$springBootVersion")
		classpath("org.jetbrains.kotlin:kotlin-noarg:$kotlinVersion")
		classpath("org.jetbrains.kotlin:kotlin-allopen:$kotlinVersion")
		classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion")
	}
}

apply {
	plugin("java")
	plugin("eclipse")
	plugin("idea")
	plugin("org.springframework.boot")
	plugin("kotlin")
	plugin("kotlin-jpa")
	plugin("kotlin-spring")
}

version = "0.0.1-SNAPSHOT"

configure<JavaPluginConvention> {
	setSourceCompatibility(1.8)
	setTargetCompatibility(1.8)
}

repositories {
	mavenCentral()
}

dependencies {
	compile("org.springframework.boot:spring-boot-starter-web")
	compile("org.springframework.boot:spring-boot-starter-data-jpa")
	compile("com.h2database:h2")
	compile("org.jetbrains.kotlin:kotlin-stdlib")
	compile("org.jetbrains.kotlin:kotlin-reflect")
	compile("com.fasterxml.jackson.module:jackson-module-kotlin")
	//compile("com.fasterxml.jackson.module:jackson-module")
	compile("org.springframework.boot:spring-boot-starter-actuator")
	testCompile("org.springframework.boot:spring-boot-starter-test")
}

