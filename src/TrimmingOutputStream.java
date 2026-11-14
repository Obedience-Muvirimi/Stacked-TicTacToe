/** Wraps stdout and strips trailing spaces/tabs from every line, so board and statistics output is byte-exact. */
class TrimmingOutputStream extends java.io.OutputStream {
	private final java.io.OutputStream real;
	private final java.io.ByteArrayOutputStream buffer = new java.io.ByteArrayOutputStream();
	TrimmingOutputStream(java.io.OutputStream real) { this.real = real; }
	public void write(int b) throws java.io.IOException {
		if (b == '\n') {
			byte[] line = buffer.toByteArray();
			int end = line.length;
			while (end > 0 && (line[end-1] == ' ' || line[end-1] == '\t')) end--;
			real.write(line, 0, end);
			real.write('\n');
			buffer.reset();
		} else {
			buffer.write(b);
		}
	}
	public void flush() throws java.io.IOException {
		real.flush();
	}
}
