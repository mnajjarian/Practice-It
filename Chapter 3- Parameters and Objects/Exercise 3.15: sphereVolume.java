/*Write a method called sphereVolume that accepts a radius (a real number) as a parameter and returns the volume of a sphere 
with that radius. For example, the call sphereVolume(2.0) should return 33.510321638291124. The formula for the volume of a 
sphere with radius r is the following:

volume = 4/3 π r3
*/

public static double sphereVolume(double r) {
    return 4 * Math.PI * r * r * r / 3;
}
