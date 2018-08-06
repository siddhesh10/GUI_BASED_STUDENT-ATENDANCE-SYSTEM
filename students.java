// ORM class for table 'students'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Wed Jun 27 18:22:09 PDT 2018
// For connector: org.apache.sqoop.manager.MySQLManager
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import com.cloudera.sqoop.lib.JdbcWritableBridge;
import com.cloudera.sqoop.lib.DelimiterSet;
import com.cloudera.sqoop.lib.FieldFormatter;
import com.cloudera.sqoop.lib.RecordParser;
import com.cloudera.sqoop.lib.BooleanParser;
import com.cloudera.sqoop.lib.BlobRef;
import com.cloudera.sqoop.lib.ClobRef;
import com.cloudera.sqoop.lib.LargeObjectLoader;
import com.cloudera.sqoop.lib.SqoopRecord;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class students extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("name", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        name = (String)value;
      }
    });
    setters.put("attendance", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        attendance = (Integer)value;
      }
    });
    setters.put("roll_no", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        roll_no = (Long)value;
      }
    });
    setters.put("class", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        _class = (String)value;
      }
    });
    setters.put("emaiL", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        emaiL = (String)value;
      }
    });
    setters.put("phone", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        phone = (Long)value;
      }
    });
  }
  public students() {
    init0();
  }
  private String name;
  public String get_name() {
    return name;
  }
  public void set_name(String name) {
    this.name = name;
  }
  public students with_name(String name) {
    this.name = name;
    return this;
  }
  private Integer attendance;
  public Integer get_attendance() {
    return attendance;
  }
  public void set_attendance(Integer attendance) {
    this.attendance = attendance;
  }
  public students with_attendance(Integer attendance) {
    this.attendance = attendance;
    return this;
  }
  private Long roll_no;
  public Long get_roll_no() {
    return roll_no;
  }
  public void set_roll_no(Long roll_no) {
    this.roll_no = roll_no;
  }
  public students with_roll_no(Long roll_no) {
    this.roll_no = roll_no;
    return this;
  }
  private String _class;
  public String get__class() {
    return _class;
  }
  public void set__class(String _class) {
    this._class = _class;
  }
  public students with__class(String _class) {
    this._class = _class;
    return this;
  }
  private String emaiL;
  public String get_emaiL() {
    return emaiL;
  }
  public void set_emaiL(String emaiL) {
    this.emaiL = emaiL;
  }
  public students with_emaiL(String emaiL) {
    this.emaiL = emaiL;
    return this;
  }
  private Long phone;
  public Long get_phone() {
    return phone;
  }
  public void set_phone(Long phone) {
    this.phone = phone;
  }
  public students with_phone(Long phone) {
    this.phone = phone;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof students)) {
      return false;
    }
    students that = (students) o;
    boolean equal = true;
    equal = equal && (this.name == null ? that.name == null : this.name.equals(that.name));
    equal = equal && (this.attendance == null ? that.attendance == null : this.attendance.equals(that.attendance));
    equal = equal && (this.roll_no == null ? that.roll_no == null : this.roll_no.equals(that.roll_no));
    equal = equal && (this._class == null ? that._class == null : this._class.equals(that._class));
    equal = equal && (this.emaiL == null ? that.emaiL == null : this.emaiL.equals(that.emaiL));
    equal = equal && (this.phone == null ? that.phone == null : this.phone.equals(that.phone));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof students)) {
      return false;
    }
    students that = (students) o;
    boolean equal = true;
    equal = equal && (this.name == null ? that.name == null : this.name.equals(that.name));
    equal = equal && (this.attendance == null ? that.attendance == null : this.attendance.equals(that.attendance));
    equal = equal && (this.roll_no == null ? that.roll_no == null : this.roll_no.equals(that.roll_no));
    equal = equal && (this._class == null ? that._class == null : this._class.equals(that._class));
    equal = equal && (this.emaiL == null ? that.emaiL == null : this.emaiL.equals(that.emaiL));
    equal = equal && (this.phone == null ? that.phone == null : this.phone.equals(that.phone));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.name = JdbcWritableBridge.readString(1, __dbResults);
    this.attendance = JdbcWritableBridge.readInteger(2, __dbResults);
    this.roll_no = JdbcWritableBridge.readLong(3, __dbResults);
    this._class = JdbcWritableBridge.readString(4, __dbResults);
    this.emaiL = JdbcWritableBridge.readString(5, __dbResults);
    this.phone = JdbcWritableBridge.readLong(6, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.name = JdbcWritableBridge.readString(1, __dbResults);
    this.attendance = JdbcWritableBridge.readInteger(2, __dbResults);
    this.roll_no = JdbcWritableBridge.readLong(3, __dbResults);
    this._class = JdbcWritableBridge.readString(4, __dbResults);
    this.emaiL = JdbcWritableBridge.readString(5, __dbResults);
    this.phone = JdbcWritableBridge.readLong(6, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void loadLargeObjects0(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(name, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(attendance, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeLong(roll_no, 3 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(_class, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(emaiL, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeLong(phone, 6 + __off, -5, __dbStmt);
    return 6;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(name, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(attendance, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeLong(roll_no, 3 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(_class, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(emaiL, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeLong(phone, 6 + __off, -5, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.name = null;
    } else {
    this.name = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.attendance = null;
    } else {
    this.attendance = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.roll_no = null;
    } else {
    this.roll_no = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this._class = null;
    } else {
    this._class = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.emaiL = null;
    } else {
    this.emaiL = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.phone = null;
    } else {
    this.phone = Long.valueOf(__dataIn.readLong());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, name);
    }
    if (null == this.attendance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.attendance);
    }
    if (null == this.roll_no) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.roll_no);
    }
    if (null == this._class) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, _class);
    }
    if (null == this.emaiL) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, emaiL);
    }
    if (null == this.phone) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.phone);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, name);
    }
    if (null == this.attendance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.attendance);
    }
    if (null == this.roll_no) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.roll_no);
    }
    if (null == this._class) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, _class);
    }
    if (null == this.emaiL) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, emaiL);
    }
    if (null == this.phone) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.phone);
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 1, (char) 10, (char) 0, (char) 0, false);
  public String toString() {
    return toString(__outputDelimiters, true);
  }
  public String toString(DelimiterSet delimiters) {
    return toString(delimiters, true);
  }
  public String toString(boolean useRecordDelim) {
    return toString(__outputDelimiters, useRecordDelim);
  }
  public String toString(DelimiterSet delimiters, boolean useRecordDelim) {
    StringBuilder __sb = new StringBuilder();
    char fieldDelim = delimiters.getFieldsTerminatedBy();
    __sb.append(FieldFormatter.escapeAndEnclose(name==null?"null":name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(attendance==null?"null":"" + attendance, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(roll_no==null?"null":"" + roll_no, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(_class==null?"null":_class, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(emaiL==null?"null":emaiL, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(phone==null?"null":"" + phone, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(name==null?"null":name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(attendance==null?"null":"" + attendance, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(roll_no==null?"null":"" + roll_no, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(_class==null?"null":_class, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(emaiL==null?"null":emaiL, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(phone==null?"null":"" + phone, delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 1, (char) 10, (char) 0, (char) 0, false);
  private RecordParser __parser;
  public void parse(Text __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharSequence __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(byte [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(char [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(ByteBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  private void __loadFromFields(List<String> fields) {
    Iterator<String> __it = fields.listIterator();
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.name = null; } else {
      this.name = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.attendance = null; } else {
      this.attendance = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.roll_no = null; } else {
      this.roll_no = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this._class = null; } else {
      this._class = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.emaiL = null; } else {
      this.emaiL = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.phone = null; } else {
      this.phone = Long.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.name = null; } else {
      this.name = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.attendance = null; } else {
      this.attendance = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.roll_no = null; } else {
      this.roll_no = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this._class = null; } else {
      this._class = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.emaiL = null; } else {
      this.emaiL = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.phone = null; } else {
      this.phone = Long.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    students o = (students) super.clone();
    return o;
  }

  public void clone0(students o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("name", this.name);
    __sqoop$field_map.put("attendance", this.attendance);
    __sqoop$field_map.put("roll_no", this.roll_no);
    __sqoop$field_map.put("class", this._class);
    __sqoop$field_map.put("emaiL", this.emaiL);
    __sqoop$field_map.put("phone", this.phone);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("name", this.name);
    __sqoop$field_map.put("attendance", this.attendance);
    __sqoop$field_map.put("roll_no", this.roll_no);
    __sqoop$field_map.put("class", this._class);
    __sqoop$field_map.put("emaiL", this.emaiL);
    __sqoop$field_map.put("phone", this.phone);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
