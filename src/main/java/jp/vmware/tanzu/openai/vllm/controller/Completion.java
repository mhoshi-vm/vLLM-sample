package jp.vmware.tanzu.openai.vllm.controller;

public class Completion {

    private final String completion;

    public Completion(String completion) {
        this.completion = completion;
    }

    public String getCompletion() {
        return completion;
    }
}
