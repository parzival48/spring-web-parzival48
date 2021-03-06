package tech.parzival48.home

import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.ApplicationContext
import org.springframework.context.annotation.Bean
import java.util.*

@SpringBootApplication
class HomeApplication {

	@Bean
	fun commandLineRunner(ctx: ApplicationContext): CommandLineRunner? {
		return CommandLineRunner { args: Array<String?>? ->
			println("Let's inspect the beans provided by Spring Boot:")
			val beanNames = ctx.beanDefinitionNames
			Arrays.sort(beanNames)
			for (beanName in beanNames) {
				println(beanName)
			}
		}
	}
}

fun main(args: Array<String>) {
	runApplication<HomeApplication>(*args)
}
