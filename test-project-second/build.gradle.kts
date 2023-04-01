plugins {
    id("java")
    id("application")
    id("info.solidsoft.pitest") version "1.9.11"

}

group = "com.gitlab.mikesafonov"

repositories {
    mavenCentral()
}

dependencies {
    pitest("com.github.mikesafonov:pitest-git-changes-plugin:0.0.3")
    pitest("com.github.mikesafonov:pitest-git-changes-report-github-plugin:0.0.3")

    val junitVersion = "5.8.1"

    testImplementation("org.junit.jupiter:junit-jupiter-api:$junitVersion")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:$junitVersion")
    testImplementation("ch.qos.logback:logback-classic:1.3.3")
}

tasks.test {
    useJUnitPlatform()
}

pitest {
    pitestVersion.set("1.11.7")
    features.set(listOf("+git-changes(target[HEAD^])"))
    targetClasses.set(listOf("com.gitlab.mikesafonov.second.*"))
    targetTests.set(listOf("com.gitlab.mikesafonov.second.*"))
    outputFormats.set(listOf("GITHUB"))
    junit5PluginVersion.set("1.1.2")
    timestampedReports.set(false)
    if(System.getenv("CI").toBoolean()) {
        pluginConfiguration.set(
                mapOf(
                        "PROJECT_NAME" to "test-project-second",
                        "GITHUB_TOKEN" to System.getenv("GITHUB_TOKEN"),
                        "GITHUB_REPOSITORY_ID" to System.getenv("GITHUB_REPOSITORY_ID"),
                        "GITHUB_EVENT_PATH" to System.getenv("GITHUB_EVENT_PATH"),
                        "GITHUB_MUTANT_LEVEL" to "WARNING",
                        "GITHUB_FAIL_IF_MUTANTS_PRESENT" to "false"
                )
        )
    }
}
