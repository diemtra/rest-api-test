package gss.workshop.testing.requests;

import static gss.workshop.testing.utils.RestUtils.addParams;

import gss.workshop.testing.tests.TestBase;
import io.restassured.response.Response;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class RequestFactory extends TestBase {

  private static final Logger logger = Logger.getLogger(String.valueOf(RequestFactory.class));
  private static HashMap<String, String> params = addParams(Map.of("key", key, "token", token));

  // -------------------Board-------------------

  /**
   * Send request to create a new board
   *
   * @param boardName expected board name
   * @return Response of the request
   */
  public static Response createBoard(String boardName) {
    logger.info("Creating a new board.");
    HashMap<String, String> queryParams = addParams(Map.of("name", boardName));
    queryParams.putAll(params);
    String requestPath = String.format(prop.getProperty("boardCreationPath"), version);
    //Call a method of RestClient "doPostRequestWithParamsAndNoPayload"  to perform the Post request with specific info was prepared.
    Response res = RestClient.doPostRequestWithParamsAndNoPayload(requestPath, queryParams);
    logger.info("Finish board creation.");
    return res;
  }

  /**
   * Send request to create a new board with/without defaultList
   *
   * @param boardName expected board name
   * @param defaultList a board without/with default list
   * @return Response of the request
   */
  public static Response createBoard(String boardName, boolean defaultList) {
    logger.info("Creating a new board.");
    HashMap<String, String> queryParams = addParams(Map.of("name", boardName, "defaultLists", defaultList));
    queryParams.putAll(params);
    String requestPath = String.format(prop.getProperty("boardCreationPath"), version);
    Response res = RestClient.doPostRequestWithParamsAndNoPayload(requestPath, queryParams);
    logger.info("Finish board creation.");
    return res;
  }

  /**
   * Get info of an existing board by its Id
   *
   * @param boardId the Id of an existing board
   * @return Response of the request
   */
  public static Response getBoardById(String boardId) {
    logger.info("Getting an existing board.");
    String requestPath = String.format(prop.getProperty("boardGettingPath"), version, boardId);
    Response res = RestClient.doPostRequestWithParamsAndNoPayload(requestPath, params);
    logger.info("Finish getting a board");
    return res;
  }

  /**
   * Delete an existing board by Id
   *
   * @param boardId the Id of an existing board
   * @return Response of the request
   */
  public static Response deleteBoard(String boardId) {
    logger.info("Delete an existing board");
    String requestPath = String.format(prop.getProperty("boardDeletionPath"), version, boardId);
    Response res = RestClient.doDeleteRequestWithParams(requestPath, params);
    logger.info("Finish board deletion");
    return res;
  }

  // -------------------List-------------------

  /**
   * Create a new list in an existing board
   *
   * @param boardId the board id which to be added more list
   * @param listName name of the new list created
   * @param pos position of the list created
   * @return Response of the request
   */
  public static Response createList(String boardId, String listName, String pos) {
    logger.info("Creating a new list.");
    HashMap<String, String> queryParams = addParams(Map.of("name", listName, "pos", pos));
    queryParams.putAll(params);
    String requestPath = String.format(prop.getProperty("listCreationPath"), version, boardId);
    Response res = RestClient.doPostRequestWithParamsAndNoPayload(requestPath, queryParams);
    logger.info("Finish list creation.");
    return res;
  }

  // -------------------Card-------------------

  /**
   * Create a new card in a list
   *
   * @param cardName name of the new card created
   * @param cardDesc description of the new card created
   * @param pos position of the card created
   * @param listId id of the list which the card is added to
   * @return Response of the request
   */
  public static Response createCard(String cardName, String cardDesc, String pos, String listId) {
    logger.info("Creating a new card.");
    HashMap<String, String> queryParams = addParams(Map.of("name", cardName, "desc", cardDesc, "pos", pos, "idList", listId));
    queryParams.putAll(params);
    String requestPath = String.format(prop.getProperty("cardCreationPath"), version);
    Response res = RestClient.doPostRequestWithParamsAndNoPayload(requestPath, queryParams);
    logger.info("Finish card creation.");
    return res;
  }

  /**
   * Update an existing card to another list
   *
   * @param cardId id of the existing card
   * @param listId id of the list which the card is updated to
   * @return Response of the request
   */
  public static Response updateCard(String cardId, String listId) {
    logger.info("update an existing card.");
    HashMap<String, String> queryParams = addParams(Map.of("idList", listId));
    queryParams.putAll(params);
    String requestPath = String.format(prop.getProperty("cardUpdatePath"), version, cardId);
    Response res = RestClient.doPutRequestWithParamsAndNoPayload(requestPath, queryParams);
    logger.info("Finish updating card.");
    return res;
  }
}

