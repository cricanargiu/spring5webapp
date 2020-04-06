package guru.springframework.spring5webapp.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
public class Publisher
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	private Long id;
	private String name;
	private String city;
	private String line;
	private String state;
	private String zip;
	@OneToMany
	@JoinColumn(name = "publisher_id")
	private Set<Book> books = new HashSet();

	public Publisher(String name, String city, String line, String state, String zip)
	{
		this.name = name;
		this.city = city;
		this.line = line;
		this.state = state;
		this.zip = zip;
	}

	public Publisher()
	{
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getCity()
	{
		return city;
	}

	public void setCity(String city)
	{
		this.city = city;
	}

	public String getLine()
	{
		return line;
	}

	public void setLine(String line)
	{
		this.line = line;
	}

	public String getState()
	{
		return state;
	}

	public void setState(String state)
	{
		this.state = state;
	}

	public String getZip()
	{
		return zip;
	}

	public void setZip(String zip)
	{
		this.zip = zip;
	}

	public Set<Book> getBooks()
	{
		return books;
	}

	public void setBooks(Set<Book> books)
	{
		this.books = books;
	}

	@Override
	public boolean equals(Object o)
	{
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Publisher publisher = (Publisher) o;
		return Objects.equals(id, publisher.id);
	}

	@Override
	public String toString()
	{
		return "Publisher{" +
						"id=" + id +
						", name='" + name + '\'' +
						", city='" + city + '\'' +
						", line='" + line + '\'' +
						", state='" + state + '\'' +
						", zip='" + zip + '\'' +
						", books=" + books +
						'}';
	}

	@Override
	public int hashCode()
	{
		return Objects.hash(id);
	}
}
