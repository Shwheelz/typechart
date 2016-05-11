package typechart;

import java.util.HashSet;
import java.util.Set;

import com.amazon.speech.speechlet.lambda.SpeechletRequestStreamHandler;

public final class TypeChartHelperSpeechletRequestStreamHandler extends
        SpeechletRequestStreamHandler {
    private static final Set<String> supportedApplicationIds;

    static {
        supportedApplicationIds = new HashSet<String>();
        supportedApplicationIds.add("amzn1.echo-sdk-ams.app.bb081e01-e68f-4d84-b25b-439816864a52")
    }

    public TypeChartHelperSpeechletRequestStreamHandler() { super(new TypeChartSpeechlet(), supportedApplicationIds); }
}