package jp.vmware.tanzu.openai.vllm.controller;

import jp.vmware.tanzu.openai.vllm.config.MyOpenAiClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleAiController {

    private final MyOpenAiClient aiClient;

    public SimpleAiController(MyOpenAiClient aiClient) {
        this.aiClient = aiClient;
    }

    @GetMapping("/ai/simple")
    public Completion completion(@RequestParam(value = "message", defaultValue = "Tell me a joke") String message,
								 @RequestParam(value = "tokens", defaultValue = "4000") Integer maxTokens) {
        return new Completion(aiClient.generate(message, maxTokens));
    }
}
