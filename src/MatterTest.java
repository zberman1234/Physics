import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MatterTest {
  @Test
  void testNoArgConstructor() {
    Matter m = new Matter();
    assertTrue(m.IamFine);
    assertEquals(0, m.position);
    assertEquals(0, m.velocity);
    assertEquals(1, m.acceleration);
    assertEquals(1, m.force);
    assertEquals(2, m.mass);
    assertEquals("", m.name);
  }

  @Test
  void testConstructorWithPosition() {
    Matter m = new Matter(5);
    assertTrue(m.IamFine);
    assertEquals(5, m.position);
    assertEquals(0, m.velocity);
    assertEquals(1, m.acceleration);
    assertEquals(1, m.force);
    assertEquals(2, m.mass);
    assertEquals("", m.name);
  }

  @Test
  void testConstructorWithPositionAndVelocity() {
    Matter m = new Matter(5, 10);
    assertTrue(m.IamFine);
    assertEquals(5, m.position);
    assertEquals(10, m.velocity);
    assertEquals(1, m.acceleration);
    assertEquals(1, m.force);
    assertEquals(2, m.mass);
    assertEquals("", m.name);
  }

  @Test
  void testSetName() {
    Matter m = new Matter();
    m.setName("Alice");
    assertEquals("Alice", m.name);
  }

  @Test
  void testUpdatePosition() {
    Matter m = new Matter();
    m.velocity = 5;
    m.updatePosition(1);
    assertEquals(5, m.position);
    m.updatePosition(1);
    assertEquals(10, m.position);
  }

  @Test
  void testUpdateVelocity() {
    Matter m = new Matter();
    m.acceleration = 2;
    m.updateVelocity(1);
    assertEquals(2, m.velocity);
    m.updateVelocity(1);
    assertEquals(4, m.velocity);
  }

  @Test
  void testUpdateAcceleration() {
    Matter m = new Matter();
    m.force = 3;
    m.mass = 1;
    m.updateAcceleration();
    assertEquals(3, m.acceleration);
  }

  @Test
  void testUpdateEmotionalStatus() {
    Matter m = new Matter();
    m.updateEmotionalStatus();
    assertTrue(m.IamFine);
    m.position = 1000;
    m.updateEmotionalStatus();
    assertFalse(m.IamFine);
  }

  @Test
  void testUpdate() {
    Matter m = new Matter();
    m.force = 3;
    m.mass = 1;
    m.update(1);
    assertEquals(3, m.acceleration);
    assertEquals(3, m.velocity);
    assertEquals(3, m.position);
    assertTrue(m.IamFine);

    m.force = 4;
    m.mass = 2;
    m.update(1);
    assertEquals(2, m.acceleration);
    assertEquals(5, m.velocity);
    assertEquals(8, m.position);
    assertTrue(m.IamFine);
  }

  @Test
  void testNewUpdate() {
    Matter m = new Matter();
    m.force = 3;
    m.mass = 1;
    m.newupdate(1);
    assertEquals(3, m.acceleration);
    assertEquals(3, m.velocity);
    assertEquals(3, m.position);
    assertTrue(m.IamFine);

    m.force = 4;
    m.mass = 2;
    m.newupdate(1);
    assertEquals(2, m.acceleration);
    assertEquals(5, m.velocity);
    assertEquals(8, m.position);
    assertTrue(m.IamFine);
  }
}
