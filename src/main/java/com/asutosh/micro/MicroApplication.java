package com.asutosh.micro;

import java.time.Duration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import lombok.Data;
import reactor.core.publisher.Flux;

@SpringBootApplication
public class MicroApplication {
	public static void main(String[] args) {
		SpringApplication.run(MicroApplication.class, args);
	}
}

@RestController
@RequestMapping("/abinash")
class AbinashRestController {
	@GetMapping(produces = MediaType.APPLICATION_STREAM_JSON_VALUE)
	Flux<MessageEvent> createStream() {
		return Flux.<MessageEvent>generate(
				sink -> sink.next(new MessageEvent("Bai go !!! Kana Karuchu.....")))
				.delayElements(Duration.ofSeconds(1));
	}
}

@RestController
@RequestMapping("/smita")
class SmitaRestController {
	@GetMapping(produces = MediaType.APPLICATION_STREAM_JSON_VALUE)
	Flux<MessageEvent> createStream() {
		return Flux.<MessageEvent>generate(
				sink -> sink.next(new MessageEvent("Mallu Baby ke khaiba, Bhalu Khaiba, Bhalu Khaiba......")))
				.delayElements(Duration.ofSeconds(1));
	}
}

@RestController
@RequestMapping("/biswa")
class BiswaRestController {
	@GetMapping(produces = MediaType.APPLICATION_STREAM_JSON_VALUE)
	Flux<MessageEvent> createStream() {
		return Flux.<MessageEvent>generate(
				sink -> sink.next(new MessageEvent("Bisuaaaaaaaaaaaaaaaaiiiiiiiiiiiiiiiiiii, Mutton Khaiba?...............")))
				.delayElements(Duration.ofSeconds(1));
	}
}

@RestController
@RequestMapping("/lucy")
class LucyRestController {
	@GetMapping(produces = MediaType.APPLICATION_STREAM_JSON_VALUE)
	Flux<MessageEvent> createStream() {
		return Flux.<MessageEvent>generate(
				sink -> sink.next(new MessageEvent("Lucy, Chicken khaogi?..................")))
				.delayElements(Duration.ofSeconds(1));
	}
}

@RestController
@RequestMapping("/sabya")
class SabyaRestController {
	@GetMapping(produces = MediaType.APPLICATION_STREAM_JSON_VALUE)
	Flux<MessageEvent> createStream() {
		return Flux.<MessageEvent>generate(
				sink -> sink.next(new MessageEvent("Hello Sabya..................")))
				.delayElements(Duration.ofSeconds(1));
	}
}

@Data
@AllArgsConstructor
class MessageEvent {
	private String msg;
}