package marauroa.server.game;

import marauroa.common.game.RPObject;

/**
 * This class represent the result of creating an account.
 * It will also contains the generated username and the generated RPObject, so
 * we can inform client about changes on username and/or RPObject.
 * @author miguel
 *
 */
public class CharacterResult {
	/** The result of creating the account */
	private Result result;
	/**
	 *  The username generated by the create account process.
	 *  It will usually be the same that the username requested.
	 */
	private String character;
	private RPObject template;

	/**
	 * Constructor
	 * @param result the result of creating the account.
	 * @param username the username generated.
	 */
	public CharacterResult(Result result, String character, RPObject template) {
		this.result=result;
		this.character=character;
		this.template=template;
	}

	/**
	 * Returns the result of creating the account
	 * @return the result of creating the account
	 */
	public Result getResult() {
		return result;
	}

	/**
	 * Returns the username generated by create account.
	 * @return the username generated by create account.
	 */
	public String getCharacter() {
		return character;
	}
	
	/**
	 * Returns the template object used.
	 * @return the template object used.
	 */
	public RPObject getTemplate() {
		return template;
	}
}
