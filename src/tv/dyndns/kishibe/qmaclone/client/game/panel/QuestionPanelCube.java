//The MIT License
//
//Copyright (c) 2009 nodchip
//
//Permission is hereby granted, free of charge, to any person obtaining a copy
//of this software and associated documentation files (the "Software"), to deal
//in the Software without restriction, including without limitation the rights
//to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
//copies of the Software, and to permit persons to whom the Software is
//furnished to do so, subject to the following conditions:
//
//The above copyright notice and this permission notice shall be included in
//all copies or substantial portions of the Software.
//
//THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
//IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
//FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
//AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
//LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
//OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
//THE SOFTWARE.
package tv.dyndns.kishibe.qmaclone.client.game.panel;

import tv.dyndns.kishibe.qmaclone.client.game.AnswerView;
import tv.dyndns.kishibe.qmaclone.client.game.AnswerViewImpl;
import tv.dyndns.kishibe.qmaclone.client.game.SessionData;
import tv.dyndns.kishibe.qmaclone.client.game.input.InputWidget;
import tv.dyndns.kishibe.qmaclone.client.game.input.InputWidgetTyping;
import tv.dyndns.kishibe.qmaclone.client.game.sentence.WidgetProblemSentence;
import tv.dyndns.kishibe.qmaclone.client.game.sentence.WidgetProblemSentenceCube;
import tv.dyndns.kishibe.qmaclone.client.packet.PacketProblem;

/**
 * キューブクイズの問題パネル
 * 
 * @author nodchip
 */
public class QuestionPanelCube extends QuestionPanel {
	public QuestionPanelCube(PacketProblem problem, SessionData sessionData) {
		super(problem, sessionData);
	}

	@Override
	protected WidgetProblemSentence createWidgetProblemSentence() {
		return new WidgetProblemSentenceCube(problem);
	}

	@Override
	protected AnswerView createAnswerView() {
		// ローマ字入力のため一時的な表示文字数を10文字とする
		return new AnswerViewImpl(8, 10, true);
	}

	@Override
	protected InputWidget createWidgetInput() {
		return new InputWidgetTyping(problem, answerView, this, getSessionData());
	}
}
