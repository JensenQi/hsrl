package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class VoodooDoctor_132 : Card() {
    override val id = 132
    override val name = "巫医"
    override val description = "<b>战吼：</b> 恢复 2点生命值。"
    override var cost: Int? = 1
    override var health: Int? = 1
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy1635
    override val background = "别以为带上大坏蛋面具，再把两根筷子插在嘴里，你就是巫医了，伙计。"
    override val artist = "Karl Richardson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/76192f50ef5b88e7ac49b94e9974a77d917bb9a19922cccdf7aeeaeb715f8279.png"
}
