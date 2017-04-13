// This file is part of MicropolisJ.
// Copyright (C) 2013 Jason Long
// Portions Copyright (C) 1989-2007 Electronic Arts Inc.
//
// MicropolisJ is free software; you can redistribute it and/or modify
// it under the terms of the GNU GPLv3, with additional terms.
// See the README file, included in this distribution, for details.

package micropolisj.gui;

import java.util.*;
import javax.swing.*;
import javax.swing.text.*;

import micropolisj.engine.*;

public class MessagesPane extends JTextPane
{
	static ResourceBundle cityMessageStrings = ResourceBundle.getBundle("micropolisj.CityMessages");
	
	
	
	public MessagesPane()
	{
		setEditable(false);
	}
	
	/*public void countMessages(MicropolisMessage m){
		if (cityMessageStrings.getString(m.toString()) == "NEED_RES"){
			NEED_REScount ++;
		}
		if (cityMessageStrings.getString(m.toString()) == "NEED_COM"){
			NEED_COMcount ++;
		}
		if (cityMessageStrings.getString(m.toString()) == "NEED_IND"){
			NEED_INDcount ++;
		}
		if (cityMessageStrings.getString(m.toString()) == "NEED_ROADS"){
			NEED_ROADScount ++;
		}
		if (cityMessageStrings.getString(m.toString()) == "NEED_RAILS"){
			NEED_RAILScount ++;
		}
		if (cityMessageStrings.getString(m.toString()) == "NEED_POWER"){
			NEED_POWERcount ++;
		}
		if (cityMessageStrings.getString(m.toString()) == "NEED_STADIUMcount"){
			NEED_STADIUMcount ++;
		}
	}*/

	public void appendCityMessage(MicropolisMessage message)
	{
		appendMessageText(cityMessageStrings.getString(message.name()));
		//countMessages(message);
	}
	
	/*ArrayList<String> carl = new ArrayList<String>();
	void addToCarl(String txt){
		carl.add(txt);
	}
	ArrayList<String> debbie = new ArrayList<String>();
	void addToDebbie(String txt){
		carl.add(txt);
	}
	ArrayList<String> john = new ArrayList<String>();
	void addToJohn(String txt){
		carl.add(txt);
	}
	ArrayList<String> Betsy = new ArrayList<String>();
	void addToBetsy(String txt){
		carl.add(txt);
	}
	*/

	void appendMessageText(String messageText)
	{
		try {
			StyledDocument doc = getStyledDocument();
			if (doc.getLength() != 0) {
				doc.insertString(doc.getLength(), "\n", null);
			}
			doc.insertString(doc.getLength(), messageText, null);
		}
		catch (BadLocationException e) {
			throw new Error("unexpected", e);
		}
		/*if (messageText.contains("Fire") || messageText.contains("Explosion") || messageText.contains("earthquake")|| messageText.contains("Meltdown") || messageText.contains("Flooding")){
			addToCarl(messageText);
		}
		if (messageText.contains("Police")|| messageText.contains("Crime") || messageText.contains("crashed") || messageText.contains("Tornado") || messageText.contains("Shipwreck") || messageText.contains("Monster") || messageText.contains("riot")){
			addToDebbie(messageText);
		}
		if (messageText.contains("zones") || messageText.contains("roads") || messageText.contains("Traffic") || messageText.contains("traffic") || messageText.contains("Power") || messageText.contains("power") || messageText.contains("rail")){
			addToJohn(messageText);
		}
		if (messageText.contains("Stadium")|| messageText.contains("Sea")|| messageText.contains("Airport")|| messageText.contains("Pollution")|| messageText.contains("tax rate")|| messageText.contains("Unemployment")|| messageText.contains("BROKE"), || messageText.contains("parks")){
			addToBetsy(messageText);
		}*/
	}
}
