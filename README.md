# RefCon

RefCon (short for *ReferenceConstructor*) is an algebraic analogue of Robert Lang's [ReferenceFinder](http://www.langorigami.com/science/computational/reffinder/reffinder.php). While ReferenceFinder can find a very useful sequence for practical folding, I've always been dissatisfied with the fact that only provides appproximate solutions.

RefCon attempts to provide an exact folding sequence for any given ([HJA](http://www.langorigami.com/science/math/hja/hja.php)) origami-constructible length.
At the moment, the goal is to provide *some* sequence, regardless of length. It might be very long, but it is guaranteed to be accurate

## Main Ideas

RefCon assumes we have an infinite piece of paper, with four (infinite) lines bounding the unit square (`x=0`, `x=1`, `y=0`, `y=1`).

Constructible values can be specified as nested expressions using:
- Given values
- Integers
- Addition, subtraction
- Multiplication, division
- Square roots
- polynomial roots (quadtratic, cubic, quartic)

## Dev Notes

- Naming conventions follow Mathematica where possible.

## Considerations

- Extracting specific roots canonically (à la Mathematica's [Root](http://reference.wolfram.com/mathematica/ref/Root.html))
- Imaginary numbers (e.g. from solutions of equations)
- Deduplication
  - e.g. two separate subconstructions that both need sqrt(2) should reuse the same lines. This is difficult to do perfectly without either resorting to approximations (unacceptable), or general algebraic methods that can tell whether an expression has been used, although an implementation of `equals` should help a lot.
- Visual instructions