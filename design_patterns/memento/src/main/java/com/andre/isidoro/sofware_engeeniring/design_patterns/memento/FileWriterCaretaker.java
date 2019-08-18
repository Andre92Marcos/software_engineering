package com.andre.isidoro.sofware_engeeniring.design_patterns.memento;

public class FileWriterCaretaker {
	private Object obj;

	public void save(FileWriteUtil fileWriter) {
		this.obj = fileWriter.save();
	}

	public void undo(FileWriteUtil fileWriter) {
		fileWriter.undoToLastSave(obj);
	}
}
