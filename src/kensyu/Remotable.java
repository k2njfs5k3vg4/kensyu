package kensyu;

interface Remotable {
	String upload(String name);

	String download(String name);
}
