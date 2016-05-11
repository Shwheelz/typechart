package typechart;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.amazon.speech.slu.Intent;
import com.amazon.speech.slu.Slot;
import com.amazon.speech.speechlet.IntentRequest;
import com.amazon.speech.speechlet.LaunchRequest;
import com.amazon.speech.speechlet.Session;
import com.amazon.speech.speechlet.SessionEndedRequest;
import com.amazon.speech.speechlet.SessionStartedRequest;
import com.amazon.speech.speechlet.Speechlet;
import com.amazon.speech.speechlet.SpeechletException;
import com.amazon.speech.speechlet.SpeechletResponse;
import com.amazon.speech.ui.PlainTextOurputSpeech;
import com.amazon.speech.ui.Reprompt;
import com.amazon.speech.ui.SimpleCard;
import sun.net.www.content.text.PlainTextInputStream;

import java.lang.Override;

public class TypeChartSpeechlet implements Speechlet {
    private static final Logger log = LoggerFactory.getLogger(TypeChartSpeechlet.class);

    /**
     * The key to get teh item from the intent
     */
    private static final String TYPE = "Type";

    @Override
    public void onSessionStarted(final SessionStartedRequest request, final Session session) throws SpeechletException {
        log.info("onSessionStarted requestId={}, sessionId={}", request.getRequestId(), session.getSessionId());
    }

    @Override
    public SpeechletResponse onLaunch(final LaunchRequest request, final Session session) throws SpeechletException {
        log.info("onSessionStarted requestId={}, sessionId={}", request.getRequestId(), session.getSessionId());

        String speechOutput = "What type of Pokemon would you like to learn about? For example, you can say " +
                "tell me about the electric type ... Go ahead.";

        // Used if the user doesn't give an expected response to the welcome message
        String repromptText = "If you need help, please say help me.";

        // Prompt the user for input
        return newAskResponse(speechOutput, repromptText);
    }

    @Override
    public SpeechletResponse onIntent(final IntentRequest reqeust, final Session session) throws SpeechletException {
        log.info("onSessionStarted requestId={}, sessionId={}", request.getRequestId(), session.getSessionId());

        Intent intent = request.getIntent();
        String intentName = (intent != null) ? intent.getName() : null;

        if("TypeIntent".equals(intentName)) {
            return(getTypeInfo(intent));
        }
        else if (("AMAZON.HelpIntent").equals(intentName)) {
            return getHelp();
        }
        else if (("AMAZON.StopIntent").equals(intentName)) {
            PlainTextOutputSpeech outputSpeech = new PlainTextOutputSpeech();
            outputSpeech.setText("See ya!");
            return SpeechletResponse.newTellResponse(outputSpeech);
        }
        else if (("AMAZON.CancelIntent").equals(intentName)) {
            PlainTextOutputSpeech outputSpeech = new PlainTextOutputSpeech();
            outputSpeech.setText("See ya!");
            return SpeechletResponse.newTellResponse(outputSpeech);
        }
        else {
            throw new SpeechletException("Invalid Intent");
        }
    }

    @Override
    public void onSessionEnded(final SessionEndedRequest request, final Session session) throws SpeechletException {
        log.info("onSessionStarted requestId={}, sessionId={}", request.getRequestId(), session.getSessionId());
    }

    private SpeechletResponse getTypeInfo(Intent intent) {
        Slot typeSlot = intent.getSlot(TYPE);
        if (typeSlot != null && typeSlot.getValue() != null) {
            String typeName = typeSlot.getValue();

            // Get description of the type
            String typeInfo = Types.get(typeName);

            if (typeInfo != null) {
                PlainTextOutputSpeech outputSpeech = new PlainTextOutputSpeech();
                outputSpeech.setText(typeInfo);

                SimpleCard card = new SimpleCard();
                card.setTitle("Type: " + typeName);
                card.setContent(typeInfo);

                return SpeechletResponse.newTellResponse(outputSpeech, card);
            }
            else {
                // Keep the session open and ask again
                String speechOutput = "My apologies, I currently don't have info for " + typeName + " type. " +
                        "What else can I help you with?";
                String repromptSpeech = "What else can I help you with?";
                return newAskResponse(speechOutput, repromptSpeech);
            }
        }
        else {
            return getHelp();
        }
    }

    private SpeechletResponse newAskResponse(String stringOutput, String repromptText) {
        PlainTextOutputSpeech outputSpeech = new PlainTextOutputSpeech();
        outputSpeech.setText(stringOutput);

        PlainTextOutputSpeech repromptOutputSpeech = new PlainTextOutputSpeech();
        repromptOutputSpeech.setText(repromptText);
        Reprompt reprompt = new Reprompt();
        reprompt.setOutputSpeech(repromptOutputSpeech);

        return SpeechletResponse.newAskResponse(outputSpeech, reprompt);
    }
}