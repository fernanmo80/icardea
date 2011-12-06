package tr.com.srdc.icardea.careplanengine.entities.patientDataEntities;

//~--- non-JDK imports --------------------------------------------------------

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import tr.com.srdc.icardea.careplanengine.glmodel.Time_Literal;

public class TimeLiteralEntity {
    protected String       day;
    protected String       displayName;
    protected String       hour;
    protected String       millisecond;
    protected String       minute;
    protected String       month;
    protected String       plusHour;
    protected String       second;
    protected SymbolEntity timeZone;
    protected String       year;

    public TimeLiteralEntity() {

        // TODO Auto-generated constructor stub
    }

    public TimeLiteralEntity(Time_Literal timeLiteral) {
        try {
            if (timeLiteral.hasDay()) {
                this.day = new String(timeLiteral.getDay());
            }

            if (timeLiteral.hasDisplay_name()) {
                this.displayName = new String(timeLiteral.getDisplay_name());
            }

            if (timeLiteral.hasHour()) {
                this.hour = new String(timeLiteral.getHour());
            }

            if (timeLiteral.hasMillisecond()) {
                this.millisecond = new String(timeLiteral.getMillisecond());
            }

            if (timeLiteral.hasMinute()) {
                this.minute = new String(timeLiteral.getMinute());
            }

            if (timeLiteral.hasMonth()) {
                this.month = new String(timeLiteral.getMonth());
            }

            if (timeLiteral.hasPlus_hour()) {
                this.plusHour = new String(timeLiteral.getPlus_hour());
            }

            if (timeLiteral.hasSecond()) {
                this.second = new String(timeLiteral.getSecond());
            }

            if (timeLiteral.hasYear()) {
                this.year = new String(timeLiteral.getYear());
            }

            if (timeLiteral.getTime_zone() != null) {
                this.timeZone = new SymbolEntity(timeLiteral.getTime_zone());
            }
        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }

    /**
     * @return Returns the day.
     */
    public String getDay() {
        return day;
    }

    /**
     * @param day The day to set.
     */
    public void setDay(String day) {
        this.day = day;
    }

    /**
     * @return Returns the displayName.
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * @param displayName The displayName to set.
     */
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * @return Returns the hour.
     */
    public String getHour() {
        return hour;
    }

    /**
     * @param hour The hour to set.
     */
    public void setHour(String hour) {
        this.hour = hour;
    }

    /**
     * @return Returns the millisecond.
     */
    public String getMillisecond() {
        return millisecond;
    }

    /**
     * @param millisecond The millisecond to set.
     */
    public void setMillisecond(String millisecond) {
        this.millisecond = millisecond;
    }

    /**
     * @return Returns the minute.
     */
    public String getMinute() {
        return minute;
    }

    /**
     * @param minute The minute to set.
     */
    public void setMinute(String minute) {
        this.minute = minute;
    }

    /**
     * @return Returns the month.
     */
    public String getMonth() {
        return month;
    }

    /**
     * @param month The month to set.
     */
    public void setMonth(String month) {
        this.month = month;
    }

    /**
     * @return Returns the plusHour.
     */
    public String getPlusHour() {
        return plusHour;
    }

    /**
     * @param plusHour The plusHour to set.
     */
    public void setPlusHour(String plusHour) {
        this.plusHour = plusHour;
    }

    /**
     * @return Returns the second.
     */
    public String getSecond() {
        return second;
    }

    /**
     * @param second The second to set.
     */
    public void setSecond(String second) {
        this.second = second;
    }

    /**
     * @return Returns the timeZone.
     */
    public SymbolEntity getTimeZone() {
        return timeZone;
    }

    /**
     * @param timeZone The timeZone to set.
     */
    public void setTimeZone(SymbolEntity timeZone) {
        this.timeZone = timeZone;
    }

    /**
     * @return Returns the year.
     */
    public String getYear() {
        return year;
    }

    /**
     * @param year The year to set.
     */
    public void setYear(String year) {
        this.year = year;
    }

    public Element toXmlElement(String string, Document doc) {
        try {
            Element element = doc.createElement(string);

            if (displayName != null) {
                Element displayNameNode = doc.createElement("Display_Name_TL");

                displayNameNode.setTextContent(displayName);
                element.appendChild(displayNameNode);
            }

            if (year != null) {
                Element yearNode = doc.createElement("Year_TL");

                yearNode.setTextContent(year);
                element.appendChild(yearNode);
            }

            if (month != null) {
                Element monthNode = doc.createElement("Month_TL");

                monthNode.setTextContent(month);
                element.appendChild(monthNode);
            }

            if (day != null) {
                Element dayNode = doc.createElement("Day_TL");

                dayNode.setTextContent(day);
                element.appendChild(dayNode);
            }

            if (hour != null) {
                Element hourNode = doc.createElement("Hour_TL");

                hourNode.setTextContent(hour);
                element.appendChild(hourNode);
            }

            if (minute != null) {
                Element minuteNode = doc.createElement("Minute_TL");

                minuteNode.setTextContent(minute);
                element.appendChild(minuteNode);
            }

            if (second != null) {
                Element secondNode = doc.createElement("Second_TL");

                secondNode.setTextContent(second);
                element.appendChild(secondNode);
            }

            if (millisecond != null) {
                Element millisecondNode = doc.createElement("Millisecond_TL");

                millisecondNode.setTextContent(millisecond);
                element.appendChild(millisecondNode);
            }

            if (plusHour != null) {
                Element plusHourNode = doc.createElement("Plus_Hour_TL");

                plusHourNode.setTextContent(plusHour);
                element.appendChild(plusHourNode);
            }

            if (timeZone != null) {
                element.appendChild(timeZone.toXmlElement("Time_Zone_TL", doc));
            }

            return element;
        } catch (Exception exc) {
            exc.printStackTrace();

            return null;
        }
    }

    public void fromXmlElement(Element element) {
        try {
            NodeList nodeList   = element.getChildNodes();
            int      listLength = nodeList.getLength();

            for (int i = 0; i < listLength; ++i) {
                Node current = nodeList.item(i);

                if (current.getNodeType() == Node.ELEMENT_NODE) {
                    String tagName = current.getNodeName();

                    if (tagName.equals("Display_Name_TL")) {
                        displayName = current.getTextContent();
                    } else if (tagName.equals("Year_TL")) {
                        year = current.getTextContent();
                    } else if (tagName.equals("Month_TL")) {
                        month = current.getTextContent();
                    }

                    if (tagName.equals("Day_TL")) {
                        day = current.getTextContent();
                    } else if (tagName.equals("Hour_TL")) {
                        hour = current.getTextContent();
                    } else if (tagName.equals("Minute_TL")) {
                        minute = current.getTextContent();
                    }

                    if (tagName.equals("Second_TL")) {
                        second = current.getTextContent();
                    } else if (tagName.equals("Millisecond_TL")) {
                        millisecond = current.getTextContent();
                    } else if (tagName.equals("Plus_Hour_TL")) {
                        plusHour = current.getTextContent();
                    } else if (tagName.equals("Time_Zone_TL")) {
                        timeZone = new SymbolEntity();
                        timeZone.fromXmlElement((Element) current);
                    }
                }
            }
        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
