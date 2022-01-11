package gss.workshop.testing.pojo.card;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
  "id",
  "checkItemStates",
  "closed",
  "dateLastActivity",
  "desc",
  "descData",
  "dueReminder",
  "idBoard",
  "idList",
  "idMembersVoted",
  "idShort",
  "idAttachmentCover",
  "idLabels",
  "manualCoverAttachment",
  "name",
  "pos",
  "shortLink",
  "isTemplate",
  "cardRole",
  "dueComplete",
  "due",
  "email",
  "labels",
  "shortUrl",
  "start",
  "url",
  "cover",
  "idMembers",
  "attachments",
  "idChecklists",
  "badges",
  "subscribed",
  "stickers",
  "limits"
})
@Generated("jsonschema2pojo")
public class CardCreationRes {

  @JsonProperty("id")
  private String id;

  @JsonProperty("checkItemStates")
  private List<Object> checkItemStates = new ArrayList<Object>();

  @JsonProperty("closed")
  private Boolean closed;

  @JsonProperty("dateLastActivity")
  private String dateLastActivity;

  @JsonProperty("desc")
  private String desc;

  @JsonProperty("descData")
  private DescData descData;

  @JsonProperty("dueReminder")
  private Object dueReminder;

  @JsonProperty("idBoard")
  private String idBoard;

  @JsonProperty("idList")
  private String idList;

  @JsonProperty("idMembersVoted")
  private List<Object> idMembersVoted = new ArrayList<Object>();

  @JsonProperty("idShort")
  private Integer idShort;

  @JsonProperty("idAttachmentCover")
  private Object idAttachmentCover;

  @JsonProperty("idLabels")
  private List<Object> idLabels = new ArrayList<Object>();

  @JsonProperty("manualCoverAttachment")
  private Boolean manualCoverAttachment;

  @JsonProperty("name")
  private String name;

  @JsonProperty("pos")
  private Integer pos;

  @JsonProperty("shortLink")
  private String shortLink;

  @JsonProperty("isTemplate")
  private Boolean isTemplate;

  @JsonProperty("cardRole")
  private Object cardRole;

  @JsonProperty("dueComplete")
  private Boolean dueComplete;

  @JsonProperty("due")
  private Object due;

  @JsonProperty("email")
  private Object email;

  @JsonProperty("labels")
  private List<Object> labels = new ArrayList<Object>();

  @JsonProperty("shortUrl")
  private String shortUrl;

  @JsonProperty("start")
  private Object start;

  @JsonProperty("url")
  private String url;

  @JsonProperty("cover")
  private Cover cover;

  @JsonProperty("idMembers")
  private List<Object> idMembers = new ArrayList<Object>();

  @JsonProperty("attachments")
  private List<Object> attachments = new ArrayList<Object>();

  @JsonProperty("idChecklists")
  private List<Object> idChecklists = new ArrayList<Object>();

  @JsonProperty("badges")
  private Badges badges;

  @JsonProperty("votes")
  private Integer votes;

  @JsonProperty("subscribed")
  private Boolean subscribed;

  @JsonProperty("stickers")
  private List<Object> stickers = new ArrayList<Object>();

  @JsonProperty("limits")
  private Limits limits;

  @JsonIgnore private Map<String, Object> additionalProperties = new HashMap<String, Object>();

  @JsonProperty("id")
  public String getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(String id) {
    this.id = id;
  }

  public CardCreationRes withId(String id) {
    this.id = id;
    return this;
  }

  @JsonProperty("checkItemStates")
  public List<Object> getCheckItemStates() {
    return checkItemStates;
  }

  @JsonProperty("checkItemStates")
  public void setCheckItemStates(List<Object> checkItemStates) {
    this.checkItemStates = checkItemStates;
  }

  public CardCreationRes withCheckItemStates(List<Object> checkItemStates) {
    this.checkItemStates = checkItemStates;
    return this;
  }

  @JsonProperty("closed")
  public Boolean getClosed() {
    return closed;
  }

  @JsonProperty("closed")
  public void setClosed(Boolean closed) {
    this.closed = closed;
  }

  public CardCreationRes withClosed(Boolean closed) {
    this.closed = closed;
    return this;
  }

  @JsonProperty("dateLastActivity")
  public String getDateLastActivity() {
    return dateLastActivity;
  }

  @JsonProperty("dateLastActivity")
  public void setDateLastActivity(String dateLastActivity) {
    this.dateLastActivity = dateLastActivity;
  }

  public CardCreationRes withDateLastActivity(String dateLastActivity) {
    this.dateLastActivity = dateLastActivity;
    return this;
  }

  @JsonProperty("desc")
  public String getDesc() {
    return desc;
  }

  @JsonProperty("desc")
  public void setDesc(String desc) {
    this.desc = desc;
  }

  public CardCreationRes withDesc(String desc) {
    this.desc = desc;
    return this;
  }

  @JsonProperty("descData")
  public DescData getDescData() {
    return descData;
  }

  @JsonProperty("descData")
  public void setDescData(DescData descData) {
    this.descData = descData;
  }

  public CardCreationRes withDescData(DescData descData) {
    this.descData = descData;
    return this;
  }

  @JsonProperty("dueReminder")
  public Object getDueReminder() {
    return dueReminder;
  }

  @JsonProperty("dueReminder")
  public void setDueReminder(Object dueReminder) {
    this.dueReminder = dueReminder;
  }

  public CardCreationRes withDueReminder(Object dueReminder) {
    this.dueReminder = dueReminder;
    return this;
  }

  @JsonProperty("idBoard")
  public String getIdBoard() {
    return idBoard;
  }

  @JsonProperty("idBoard")
  public void setIdBoard(String idBoard) {
    this.idBoard = idBoard;
  }

  public CardCreationRes withIdBoard(String idBoard) {
    this.idBoard = idBoard;
    return this;
  }

  @JsonProperty("idList")
  public String getIdList() {
    return idList;
  }

  @JsonProperty("idList")
  public void setIdList(String idList) {
    this.idList = idList;
  }

  public CardCreationRes withIdList(String idList) {
    this.idList = idList;
    return this;
  }

  @JsonProperty("idMembersVoted")
  public List<Object> getIdMembersVoted() {
    return idMembersVoted;
  }

  @JsonProperty("idMembersVoted")
  public void setIdMembersVoted(List<Object> idMembersVoted) {
    this.idMembersVoted = idMembersVoted;
  }

  public CardCreationRes withIdMembersVoted(List<Object> idMembersVoted) {
    this.idMembersVoted = idMembersVoted;
    return this;
  }

  @JsonProperty("idShort")
  public Integer getIdShort() {
    return idShort;
  }

  @JsonProperty("idShort")
  public void setIdShort(Integer idShort) {
    this.idShort = idShort;
  }

  public CardCreationRes withIdShort(Integer idShort) {
    this.idShort = idShort;
    return this;
  }

  @JsonProperty("idAttachmentCover")
  public Object getIdAttachmentCover() {
    return idAttachmentCover;
  }

  @JsonProperty("idAttachmentCover")
  public void setIdAttachmentCover(Object idAttachmentCover) {
    this.idAttachmentCover = idAttachmentCover;
  }

  public CardCreationRes withIdAttachmentCover(Object idAttachmentCover) {
    this.idAttachmentCover = idAttachmentCover;
    return this;
  }

  @JsonProperty("idLabels")
  public List<Object> getIdLabels() {
    return idLabels;
  }

  @JsonProperty("idLabels")
  public void setIdLabels(List<Object> idLabels) {
    this.idLabels = idLabels;
  }

  public CardCreationRes withIdLabels(List<Object> idLabels) {
    this.idLabels = idLabels;
    return this;
  }

  @JsonProperty("manualCoverAttachment")
  public Boolean getManualCoverAttachment() {
    return manualCoverAttachment;
  }

  @JsonProperty("manualCoverAttachment")
  public void setManualCoverAttachment(Boolean manualCoverAttachment) {
    this.manualCoverAttachment = manualCoverAttachment;
  }

  public CardCreationRes withManualCoverAttachment(Boolean manualCoverAttachment) {
    this.manualCoverAttachment = manualCoverAttachment;
    return this;
  }

  @JsonProperty("name")
  public String getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(String name) {
    this.name = name;
  }

  public CardCreationRes withName(String name) {
    this.name = name;
    return this;
  }

  @JsonProperty("pos")
  public Integer getPos() {
    return pos;
  }

  @JsonProperty("pos")
  public void setPos(Integer pos) {
    this.pos = pos;
  }

  public CardCreationRes withPos(Integer pos) {
    this.pos = pos;
    return this;
  }

  @JsonProperty("shortLink")
  public String getShortLink() {
    return shortLink;
  }

  @JsonProperty("shortLink")
  public void setShortLink(String shortLink) {
    this.shortLink = shortLink;
  }

  public CardCreationRes withShortLink(String shortLink) {
    this.shortLink = shortLink;
    return this;
  }

  @JsonProperty("isTemplate")
  public Boolean getIsTemplate() {
    return isTemplate;
  }

  @JsonProperty("isTemplate")
  public void setIsTemplate(Boolean isTemplate) {
    this.isTemplate = isTemplate;
  }

  public CardCreationRes withIsTemplate(Boolean isTemplate) {
    this.isTemplate = isTemplate;
    return this;
  }

  @JsonProperty("cardRole")
  public Object getCardRole() {
    return cardRole;
  }

  @JsonProperty("cardRole")
  public void setCardRole(Object cardRole) {
    this.cardRole = cardRole;
  }

  public CardCreationRes withCardRole(Object cardRole) {
    this.cardRole = cardRole;
    return this;
  }

  @JsonProperty("dueComplete")
  public Boolean getDueComplete() {
    return dueComplete;
  }

  @JsonProperty("dueComplete")
  public void setDueComplete(Boolean dueComplete) {
    this.dueComplete = dueComplete;
  }

  public CardCreationRes withDueComplete(Boolean dueComplete) {
    this.dueComplete = dueComplete;
    return this;
  }

  @JsonProperty("due")
  public Object getDue() {
    return due;
  }

  @JsonProperty("due")
  public void setDue(Object due) {
    this.due = due;
  }

  public CardCreationRes withDue(Object due) {
    this.due = due;
    return this;
  }

  @JsonProperty("email")
  public Object getEmail() {
    return email;
  }

  @JsonProperty("email")
  public void setEmail(Object email) {
    this.email = email;
  }

  public CardCreationRes withEmail(Object email) {
    this.email = email;
    return this;
  }

  @JsonProperty("labels")
  public List<Object> getLabels() {
    return labels;
  }

  @JsonProperty("labels")
  public void setLabels(List<Object> labels) {
    this.labels = labels;
  }

  public CardCreationRes withLabels(List<Object> labels) {
    this.labels = labels;
    return this;
  }

  @JsonProperty("shortUrl")
  public String getShortUrl() {
    return shortUrl;
  }

  @JsonProperty("shortUrl")
  public void setShortUrl(String shortUrl) {
    this.shortUrl = shortUrl;
  }

  public CardCreationRes withShortUrl(String shortUrl) {
    this.shortUrl = shortUrl;
    return this;
  }

  @JsonProperty("start")
  public Object getStart() {
    return start;
  }

  @JsonProperty("start")
  public void setStart(Object start) {
    this.start = start;
  }

  public CardCreationRes withStart(Object start) {
    this.start = start;
    return this;
  }

  @JsonProperty("url")
  public String getUrl() {
    return url;
  }

  @JsonProperty("url")
  public void setUrl(String url) {
    this.url = url;
  }

  public CardCreationRes withUrl(String url) {
    this.url = url;
    return this;
  }

  @JsonProperty("cover")
  public Cover getCover() {
    return cover;
  }

  @JsonProperty("cover")
  public void setCover(Cover cover) {
    this.cover = cover;
  }

  public CardCreationRes withCover(Cover cover) {
    this.cover = cover;
    return this;
  }

  @JsonProperty("idMembers")
  public List<Object> getIdMembers() {
    return idMembers;
  }

  @JsonProperty("idMembers")
  public void setIdMembers(List<Object> idMembers) {
    this.idMembers = idMembers;
  }

  public CardCreationRes withIdMembers(List<Object> idMembers) {
    this.idMembers = idMembers;
    return this;
  }

  @JsonProperty("attachments")
  public List<Object> getAttachments() {
    return attachments;
  }

  @JsonProperty("attachments")
  public void setAttachments(List<Object> attachments) {
    this.attachments = attachments;
  }

  public CardCreationRes withAttachments(List<Object> attachments) {
    this.attachments = attachments;
    return this;
  }

  @JsonProperty("idChecklists")
  public List<Object> getIdChecklists() {
    return idChecklists;
  }

  @JsonProperty("idChecklists")
  public void setIdChecklists(List<Object> idChecklists) {
    this.idChecklists = idChecklists;
  }

  public CardCreationRes withIdChecklists(List<Object> idChecklists) {
    this.idChecklists = idChecklists;
    return this;
  }

  @JsonProperty("badges")
  public Badges getBadges() {
    return badges;
  }

  @JsonProperty("badges")
  public void setBadges(Badges badges) {
    this.badges = badges;
  }

  public CardCreationRes withBadges(Badges badges) {
    this.badges = badges;
    return this;
  }

  @JsonProperty("votes")
  public Integer getVotes() {
    return votes;
  }

  @JsonProperty("subscribed")
  public Boolean getSubscribed() {
    return subscribed;
  }

  @JsonProperty("subscribed")
  public void setSubscribed(Boolean subscribed) {
    this.subscribed = subscribed;
  }

  public CardCreationRes withSubscribed(Boolean subscribed) {
    this.subscribed = subscribed;
    return this;
  }

  @JsonProperty("stickers")
  public List<Object> getStickers() {
    return stickers;
  }

  @JsonProperty("stickers")
  public void setStickers(List<Object> stickers) {
    this.stickers = stickers;
  }

  public CardCreationRes withStickers(List<Object> stickers) {
    this.stickers = stickers;
    return this;
  }

  @JsonProperty("limits")
  public Limits getLimits() {
    return limits;
  }

  @JsonProperty("limits")
  public void setLimits(Limits limits) {
    this.limits = limits;
  }

  public CardCreationRes withLimits(Limits limits) {
    this.limits = limits;
    return this;
  }

  @JsonAnyGetter
  public Map<String, Object> getAdditionalProperties() {
    return this.additionalProperties;
  }

  @JsonAnySetter
  public void setAdditionalProperty(String name, Object value) {
    this.additionalProperties.put(name, value);
  }

  public CardCreationRes withAdditionalProperty(String name, Object value) {
    this.additionalProperties.put(name, value);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(CardCreationRes.class.getName())
        .append('@')
        .append(Integer.toHexString(System.identityHashCode(this)))
        .append('[');
    sb.append("id");
    sb.append('=');
    sb.append(((this.id == null) ? "<null>" : this.id));
    sb.append(',');
    sb.append("checkItemStates");
    sb.append('=');
    sb.append(((this.checkItemStates == null) ? "<null>" : this.checkItemStates));
    sb.append(',');
    sb.append("closed");
    sb.append('=');
    sb.append(((this.closed == null) ? "<null>" : this.closed));
    sb.append(',');
    sb.append("dateLastActivity");
    sb.append('=');
    sb.append(((this.dateLastActivity == null) ? "<null>" : this.dateLastActivity));
    sb.append(',');
    sb.append("desc");
    sb.append('=');
    sb.append(((this.desc == null) ? "<null>" : this.desc));
    sb.append(',');
    sb.append("descData");
    sb.append('=');
    sb.append(((this.descData == null) ? "<null>" : this.descData));
    sb.append(',');
    sb.append("dueReminder");
    sb.append('=');
    sb.append(((this.dueReminder == null) ? "<null>" : this.dueReminder));
    sb.append(',');
    sb.append("idBoard");
    sb.append('=');
    sb.append(((this.idBoard == null) ? "<null>" : this.idBoard));
    sb.append(',');
    sb.append("idList");
    sb.append('=');
    sb.append(((this.idList == null) ? "<null>" : this.idList));
    sb.append(',');
    sb.append("idMembersVoted");
    sb.append('=');
    sb.append(((this.idMembersVoted == null) ? "<null>" : this.idMembersVoted));
    sb.append(',');
    sb.append("idShort");
    sb.append('=');
    sb.append(((this.idShort == null) ? "<null>" : this.idShort));
    sb.append(',');
    sb.append("idAttachmentCover");
    sb.append('=');
    sb.append(((this.idAttachmentCover == null) ? "<null>" : this.idAttachmentCover));
    sb.append(',');
    sb.append("idLabels");
    sb.append('=');
    sb.append(((this.idLabels == null) ? "<null>" : this.idLabels));
    sb.append(',');
    sb.append("manualCoverAttachment");
    sb.append('=');
    sb.append(((this.manualCoverAttachment == null) ? "<null>" : this.manualCoverAttachment));
    sb.append(',');
    sb.append("name");
    sb.append('=');
    sb.append(((this.name == null) ? "<null>" : this.name));
    sb.append(',');
    sb.append("pos");
    sb.append('=');
    sb.append(((this.pos == null) ? "<null>" : this.pos));
    sb.append(',');
    sb.append("shortLink");
    sb.append('=');
    sb.append(((this.shortLink == null) ? "<null>" : this.shortLink));
    sb.append(',');
    sb.append("isTemplate");
    sb.append('=');
    sb.append(((this.isTemplate == null) ? "<null>" : this.isTemplate));
    sb.append(',');
    sb.append("cardRole");
    sb.append('=');
    sb.append(((this.cardRole == null) ? "<null>" : this.cardRole));
    sb.append(',');
    sb.append("dueComplete");
    sb.append('=');
    sb.append(((this.dueComplete == null) ? "<null>" : this.dueComplete));
    sb.append(',');
    sb.append("due");
    sb.append('=');
    sb.append(((this.due == null) ? "<null>" : this.due));
    sb.append(',');
    sb.append("email");
    sb.append('=');
    sb.append(((this.email == null) ? "<null>" : this.email));
    sb.append(',');
    sb.append("labels");
    sb.append('=');
    sb.append(((this.labels == null) ? "<null>" : this.labels));
    sb.append(',');
    sb.append("shortUrl");
    sb.append('=');
    sb.append(((this.shortUrl == null) ? "<null>" : this.shortUrl));
    sb.append(',');
    sb.append("start");
    sb.append('=');
    sb.append(((this.start == null) ? "<null>" : this.start));
    sb.append(',');
    sb.append("url");
    sb.append('=');
    sb.append(((this.url == null) ? "<null>" : this.url));
    sb.append(',');
    sb.append("cover");
    sb.append('=');
    sb.append(((this.cover == null) ? "<null>" : this.cover));
    sb.append(',');
    sb.append("idMembers");
    sb.append('=');
    sb.append(((this.idMembers == null) ? "<null>" : this.idMembers));
    sb.append(',');
    sb.append("attachments");
    sb.append('=');
    sb.append(((this.attachments == null) ? "<null>" : this.attachments));
    sb.append(',');
    sb.append("idChecklists");
    sb.append('=');
    sb.append(((this.idChecklists == null) ? "<null>" : this.idChecklists));
    sb.append(',');
    sb.append("badges");
    sb.append('=');
    sb.append(((this.badges == null) ? "<null>" : this.badges));
    sb.append(',');
    sb.append("subscribed");
    sb.append('=');
    sb.append(((this.subscribed == null) ? "<null>" : this.subscribed));
    sb.append(',');
    sb.append("stickers");
    sb.append('=');
    sb.append(((this.stickers == null) ? "<null>" : this.stickers));
    sb.append(',');
    sb.append("limits");
    sb.append('=');
    sb.append(((this.limits == null) ? "<null>" : this.limits));
    sb.append(',');
    sb.append("additionalProperties");
    sb.append('=');
    sb.append(((this.additionalProperties == null) ? "<null>" : this.additionalProperties));
    sb.append(',');
    if (sb.charAt((sb.length() - 1)) == ',') {
      sb.setCharAt((sb.length() - 1), ']');
    } else {
      sb.append(']');
    }
    return sb.toString();
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = ((result * 31) + ((this.descData == null) ? 0 : this.descData.hashCode()));
    result = ((result * 31) + ((this.attachments == null) ? 0 : this.attachments.hashCode()));
    result = ((result * 31) + ((this.idLabels == null) ? 0 : this.idLabels.hashCode()));
    result = ((result * 31) + ((this.shortUrl == null) ? 0 : this.shortUrl.hashCode()));
    result = ((result * 31) + ((this.dueComplete == null) ? 0 : this.dueComplete.hashCode()));
    result =
        ((result * 31) + ((this.dateLastActivity == null) ? 0 : this.dateLastActivity.hashCode()));
    result = ((result * 31) + ((this.idList == null) ? 0 : this.idList.hashCode()));
    result = ((result * 31) + ((this.idMembersVoted == null) ? 0 : this.idMembersVoted.hashCode()));
    result = ((result * 31) + ((this.shortLink == null) ? 0 : this.shortLink.hashCode()));
    result = ((result * 31) + ((this.cover == null) ? 0 : this.cover.hashCode()));
    result = ((result * 31) + ((this.dueReminder == null) ? 0 : this.dueReminder.hashCode()));
    result = ((result * 31) + ((this.subscribed == null) ? 0 : this.subscribed.hashCode()));
    result = ((result * 31) + ((this.pos == null) ? 0 : this.pos.hashCode()));
    result = ((result * 31) + ((this.idChecklists == null) ? 0 : this.idChecklists.hashCode()));
    result = ((result * 31) + ((this.stickers == null) ? 0 : this.stickers.hashCode()));
    result = ((result * 31) + ((this.id == null) ? 0 : this.id.hashCode()));
    result = ((result * 31) + ((this.email == null) ? 0 : this.email.hashCode()));
    result = ((result * 31) + ((this.limits == null) ? 0 : this.limits.hashCode()));
    result = ((result * 31) + ((this.idBoard == null) ? 0 : this.idBoard.hashCode()));
    result = ((result * 31) + ((this.cardRole == null) ? 0 : this.cardRole.hashCode()));
    result = ((result * 31) + ((this.start == null) ? 0 : this.start.hashCode()));
    result =
        ((result * 31) + ((this.checkItemStates == null) ? 0 : this.checkItemStates.hashCode()));
    result = ((result * 31) + ((this.url == null) ? 0 : this.url.hashCode()));
    result = ((result * 31) + ((this.labels == null) ? 0 : this.labels.hashCode()));
    result = ((result * 31) + ((this.idMembers == null) ? 0 : this.idMembers.hashCode()));
    result = ((result * 31) + ((this.badges == null) ? 0 : this.badges.hashCode()));
    result = ((result * 31) + ((this.idShort == null) ? 0 : this.idShort.hashCode()));
    result = ((result * 31) + ((this.due == null) ? 0 : this.due.hashCode()));
    result =
        ((result * 31)
            + ((this.idAttachmentCover == null) ? 0 : this.idAttachmentCover.hashCode()));
    result = ((result * 31) + ((this.isTemplate == null) ? 0 : this.isTemplate.hashCode()));
    result = ((result * 31) + ((this.name == null) ? 0 : this.name.hashCode()));
    result = ((result * 31) + ((this.closed == null) ? 0 : this.closed.hashCode()));
    result =
        ((result * 31)
            + ((this.manualCoverAttachment == null) ? 0 : this.manualCoverAttachment.hashCode()));
    result =
        ((result * 31)
            + ((this.additionalProperties == null) ? 0 : this.additionalProperties.hashCode()));
    result = ((result * 31) + ((this.desc == null) ? 0 : this.desc.hashCode()));
    return result;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) {
      return true;
    }
    if ((other instanceof CardCreationRes) == false) {
      return false;
    }
    CardCreationRes rhs = ((CardCreationRes) other);
    return ((((((((((((((((((((((((((((((((((((this.descData == rhs.descData)
                                                                                                                                                || ((this
                                                                                                                                                            .descData
                                                                                                                                                        != null)
                                                                                                                                                    && this
                                                                                                                                                        .descData
                                                                                                                                                        .equals(
                                                                                                                                                            rhs.descData)))
                                                                                                                                            && ((this
                                                                                                                                                        .attachments
                                                                                                                                                    == rhs.attachments)
                                                                                                                                                || ((this
                                                                                                                                                            .attachments
                                                                                                                                                        != null)
                                                                                                                                                    && this
                                                                                                                                                        .attachments
                                                                                                                                                        .equals(
                                                                                                                                                            rhs.attachments))))
                                                                                                                                        && ((this
                                                                                                                                                    .idLabels
                                                                                                                                                == rhs.idLabels)
                                                                                                                                            || ((this
                                                                                                                                                        .idLabels
                                                                                                                                                    != null)
                                                                                                                                                && this
                                                                                                                                                    .idLabels
                                                                                                                                                    .equals(
                                                                                                                                                        rhs.idLabels))))
                                                                                                                                    && ((this
                                                                                                                                                .shortUrl
                                                                                                                                            == rhs.shortUrl)
                                                                                                                                        || ((this
                                                                                                                                                    .shortUrl
                                                                                                                                                != null)
                                                                                                                                            && this
                                                                                                                                                .shortUrl
                                                                                                                                                .equals(
                                                                                                                                                    rhs.shortUrl))))
                                                                                                                                && ((this
                                                                                                                                            .dueComplete
                                                                                                                                        == rhs.dueComplete)
                                                                                                                                    || ((this
                                                                                                                                                .dueComplete
                                                                                                                                            != null)
                                                                                                                                        && this
                                                                                                                                            .dueComplete
                                                                                                                                            .equals(
                                                                                                                                                rhs.dueComplete))))
                                                                                                                            && ((this
                                                                                                                                        .dateLastActivity
                                                                                                                                    == rhs.dateLastActivity)
                                                                                                                                || ((this
                                                                                                                                            .dateLastActivity
                                                                                                                                        != null)
                                                                                                                                    && this
                                                                                                                                        .dateLastActivity
                                                                                                                                        .equals(
                                                                                                                                            rhs.dateLastActivity))))
                                                                                                                        && ((this
                                                                                                                                    .idList
                                                                                                                                == rhs.idList)
                                                                                                                            || ((this
                                                                                                                                        .idList
                                                                                                                                    != null)
                                                                                                                                && this
                                                                                                                                    .idList
                                                                                                                                    .equals(
                                                                                                                                        rhs.idList))))
                                                                                                                    && ((this
                                                                                                                                .idMembersVoted
                                                                                                                            == rhs.idMembersVoted)
                                                                                                                        || ((this
                                                                                                                                    .idMembersVoted
                                                                                                                                != null)
                                                                                                                            && this
                                                                                                                                .idMembersVoted
                                                                                                                                .equals(
                                                                                                                                    rhs.idMembersVoted))))
                                                                                                                && ((this
                                                                                                                            .shortLink
                                                                                                                        == rhs.shortLink)
                                                                                                                    || ((this
                                                                                                                                .shortLink
                                                                                                                            != null)
                                                                                                                        && this
                                                                                                                            .shortLink
                                                                                                                            .equals(
                                                                                                                                rhs.shortLink))))
                                                                                                            && ((this
                                                                                                                        .cover
                                                                                                                    == rhs.cover)
                                                                                                                || ((this
                                                                                                                            .cover
                                                                                                                        != null)
                                                                                                                    && this
                                                                                                                        .cover
                                                                                                                        .equals(
                                                                                                                            rhs.cover))))
                                                                                                        && ((this
                                                                                                                    .dueReminder
                                                                                                                == rhs.dueReminder)
                                                                                                            || ((this
                                                                                                                        .dueReminder
                                                                                                                    != null)
                                                                                                                && this
                                                                                                                    .dueReminder
                                                                                                                    .equals(
                                                                                                                        rhs.dueReminder))))
                                                                                                    && ((this
                                                                                                                .subscribed
                                                                                                            == rhs.subscribed)
                                                                                                        || ((this
                                                                                                                    .subscribed
                                                                                                                != null)
                                                                                                            && this
                                                                                                                .subscribed
                                                                                                                .equals(
                                                                                                                    rhs.subscribed))))
                                                                                                && ((this
                                                                                                            .pos
                                                                                                        == rhs.pos)
                                                                                                    || ((this
                                                                                                                .pos
                                                                                                            != null)
                                                                                                        && this
                                                                                                            .pos
                                                                                                            .equals(
                                                                                                                rhs.pos))))
                                                                                            && ((this
                                                                                                        .idChecklists
                                                                                                    == rhs.idChecklists)
                                                                                                || ((this
                                                                                                            .idChecklists
                                                                                                        != null)
                                                                                                    && this
                                                                                                        .idChecklists
                                                                                                        .equals(
                                                                                                            rhs.idChecklists))))
                                                                                        && ((this
                                                                                                    .stickers
                                                                                                == rhs.stickers)
                                                                                            || ((this
                                                                                                        .stickers
                                                                                                    != null)
                                                                                                && this
                                                                                                    .stickers
                                                                                                    .equals(
                                                                                                        rhs.stickers))))
                                                                                    && ((this.id
                                                                                            == rhs.id)
                                                                                        || ((this.id
                                                                                                != null)
                                                                                            && this
                                                                                                .id
                                                                                                .equals(
                                                                                                    rhs.id))))
                                                                                && ((this.email
                                                                                        == rhs.email)
                                                                                    || ((this.email
                                                                                            != null)
                                                                                        && this
                                                                                            .email
                                                                                            .equals(
                                                                                                rhs.email))))
                                                                            && ((this.limits
                                                                                    == rhs.limits)
                                                                                || ((this.limits
                                                                                        != null)
                                                                                    && this.limits
                                                                                        .equals(
                                                                                            rhs.limits))))
                                                                        && ((this.idBoard
                                                                                == rhs.idBoard)
                                                                            || ((this.idBoard
                                                                                    != null)
                                                                                && this.idBoard
                                                                                    .equals(
                                                                                        rhs.idBoard))))
                                                                    && ((this.cardRole
                                                                            == rhs.cardRole)
                                                                        || ((this.cardRole != null)
                                                                            && this.cardRole.equals(
                                                                                rhs.cardRole))))
                                                                && ((this.start == rhs.start)
                                                                    || ((this.start != null)
                                                                        && this.start.equals(
                                                                            rhs.start))))
                                                            && ((this.checkItemStates
                                                                    == rhs.checkItemStates)
                                                                || ((this.checkItemStates != null)
                                                                    && this.checkItemStates.equals(
                                                                        rhs.checkItemStates))))
                                                        && ((this.url == rhs.url)
                                                            || ((this.url != null)
                                                                && this.url.equals(rhs.url))))
                                                    && ((this.labels == rhs.labels)
                                                        || ((this.labels != null)
                                                            && this.labels.equals(rhs.labels))))
                                                && ((this.idMembers == rhs.idMembers)
                                                    || ((this.idMembers != null)
                                                        && this.idMembers.equals(rhs.idMembers))))
                                            && ((this.badges == rhs.badges)
                                                || ((this.badges != null)
                                                    && this.badges.equals(rhs.badges))))
                                        && ((this.idShort == rhs.idShort)
                                            || ((this.idShort != null)
                                                && this.idShort.equals(rhs.idShort))))
                                    && ((this.due == rhs.due)
                                        || ((this.due != null) && this.due.equals(rhs.due))))
                                && ((this.idAttachmentCover == rhs.idAttachmentCover)
                                    || ((this.idAttachmentCover != null)
                                        && this.idAttachmentCover.equals(rhs.idAttachmentCover))))
                            && ((this.isTemplate == rhs.isTemplate)
                                || ((this.isTemplate != null)
                                    && this.isTemplate.equals(rhs.isTemplate))))
                        && ((this.name == rhs.name)
                            || ((this.name != null) && this.name.equals(rhs.name))))
                    && ((this.closed == rhs.closed)
                        || ((this.closed != null) && this.closed.equals(rhs.closed))))
                && ((this.manualCoverAttachment == rhs.manualCoverAttachment)
                    || ((this.manualCoverAttachment != null)
                        && this.manualCoverAttachment.equals(rhs.manualCoverAttachment))))
            && ((this.additionalProperties == rhs.additionalProperties)
                || ((this.additionalProperties != null)
                    && this.additionalProperties.equals(rhs.additionalProperties))))
        && ((this.desc == rhs.desc) || ((this.desc != null) && this.desc.equals(rhs.desc))));
  }
}
