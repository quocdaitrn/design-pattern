package vn.self.training.designpattern.behavioral.templatemethod;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class Result {
    List<String> result;

    public void Result() {
        result = new ArrayList<>();
    }

    public List<String> getResult() {
        return result;
    }

    public void setResult(List<String> result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return StringUtils.join(result, ",");
    }
}
