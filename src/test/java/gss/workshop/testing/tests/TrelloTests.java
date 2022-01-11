package gss.workshop.testing.tests;

import gss.workshop.testing.pojo.board.BoardCreationRes;
import gss.workshop.testing.pojo.card.CardUpdateRes;
import gss.workshop.testing.pojo.list.ListCreationRes;
import gss.workshop.testing.pojo.card.CardCreationRes;
import gss.workshop.testing.requests.RequestFactory;
import gss.workshop.testing.utils.ConvertUtils;
import gss.workshop.testing.utils.OtherUtils;
import gss.workshop.testing.utils.ValidationUtils;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.Collections;

public class TrelloTests extends TestBase {

  @Test
  public void trelloWorkflowTest() {
    // 1. Create new board without default list
    String boardName = OtherUtils.randomName();
    Response resBoardCreation = RequestFactory.createBoard(boardName, false);

    // VP. Validate status code
    ValidationUtils.validateStatusCode(resBoardCreation, 200);

    // VP. Validate a board is created: Board name and permission level
    BoardCreationRes board = ConvertUtils.convertRestResponseToPojo(resBoardCreation, BoardCreationRes.class);
    ValidationUtils.validateStringEqual(boardName, board.getName());
    ValidationUtils.validateStringEqual("private", board.getPrefs().getPermissionLevel());

    // -> Store board Id
    String boardId = board.getId();
    System.out.println(String.format("Board Id of the new Board: %s", boardId));

    // 2. Create a TODO list
    String listName = "TODO";
    Response resToDoListCreation = RequestFactory.createList(boardId, listName, "top");

    // VP. Validate status code
    ValidationUtils.validateStatusCode(resToDoListCreation, 200);

    // VP. Validate a list is created: name of list, closed attribute
    ListCreationRes list = ConvertUtils.convertRestResponseToPojo(resToDoListCreation, ListCreationRes.class);
    ValidationUtils.validateStringEqual(listName, list.getName());
    ValidationUtils.validateStringEqual(false, list.getClosed());

    // VP. Validate the list was created inside the board: board Id
    ValidationUtils.validateStringEqual(boardId, list.getIdBoard());

    // -> Store todoList Id
    String todoListId = list.getId();
    System.out.println(String.format("List Id of the new TODO list: %s", todoListId));

    // 3. Create a DONE list
    listName = "DONE";
    Response resDoneListCreation = RequestFactory.createList(boardId, listName, "top");

    // VP. Validate status code
    ValidationUtils.validateStatusCode(resDoneListCreation, 200);

    // VP. Validate a list is created: name of list, "closed" property
    list = ConvertUtils.convertRestResponseToPojo(resDoneListCreation, ListCreationRes.class);
    ValidationUtils.validateStringEqual(listName, list.getName());
    ValidationUtils.validateStringEqual(false, list.getClosed());

    // VP. Validate the list was created inside the board: board Id
    ValidationUtils.validateStringEqual(boardId, list.getIdBoard());

    // -> Store doneList Id
    String doneListId = list.getId();
    System.out.println(String.format("List Id of the new DONE list: %s", doneListId));

    // 4. Create a new Card in TODO list
    String cardName = "Testing card " + (int) (Math.random() * 10000);
    String cardDesc = cardName + "'s description";
    Response resCardCreation = RequestFactory.createCard(cardName, cardDesc, "top", todoListId);

    // VP. Validate status code
    ValidationUtils.validateStatusCode(resCardCreation, 200);

    // VP. Validate a card is created: task name, list id, board id
    CardCreationRes card = ConvertUtils.convertRestResponseToPojo(resCardCreation, CardCreationRes.class);
    ValidationUtils.validateStringEqual(cardName, card.getName());
    ValidationUtils.validateStringEqual(cardDesc, card.getDesc());
    ValidationUtils.validateStringEqual(todoListId, card.getIdList());
    ValidationUtils.validateStringEqual(boardId, card.getIdBoard());

    // VP. Validate the card should have no votes or attachments
    ValidationUtils.validateStringEqual(null, card.getVotes());
    ValidationUtils.validateStringEqual(Collections.emptyList(), card.getAttachments());

    // -> Store card Id
    String cardId = card.getId();
    System.out.println(String.format("Card Id of the new card: %s", cardId));

    // 5. Move the card to DONE list
    Response resCardUpdate = RequestFactory.updateCard(cardId, doneListId);

    // VP. Validate status code
    ValidationUtils.validateStatusCode(resCardCreation, 200);

    // VP. Validate the card should have new list: list id
    card = ConvertUtils.convertRestResponseToPojo(resCardUpdate, CardUpdateRes.class);
    ValidationUtils.validateStringEqual(doneListId, card.getIdList());

    // VP. Validate the card should preserve properties: name task, board Id, "closed" property
    ValidationUtils.validateStringEqual(cardName, card.getName());
    ValidationUtils.validateStringEqual(cardDesc, card.getDesc());
    ValidationUtils.validateStringEqual(boardId, card.getIdBoard());
    ValidationUtils.validateStringEqual(false, card.getClosed());

    // 6. Delete board
    Response resBoardDeletion = RequestFactory.deleteBoard(boardId);

    // VP. Validate status code
    ValidationUtils.validateStatusCode(resBoardDeletion, 200);

    //7. Get a deleted board
    Response resBoardGetting = RequestFactory.getBoardById(boardId);

    // VP. Validate status code
    ValidationUtils.validateStatusCode(resBoardGetting, 404);
  }
}
