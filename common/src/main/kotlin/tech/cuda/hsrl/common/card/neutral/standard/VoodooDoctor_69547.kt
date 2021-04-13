package tech.cuda.hsrl.common.card.neutral.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class VoodooDoctor_69547 : Card() {
    override val id = 69547
    override val name = "巫医"
    override val description = "<b>战吼：</b> 恢复 2点生命值。"
    override var cost: Int? = 1
    override var health: Int? = 1
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Core
    override val background = "别以为带上大坏蛋面具，再把两根筷子插在嘴里，你就是巫医了，伙计。"
    override val artist = "Karl Richardson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/993de9bf044b56c60dedf863f77dac753e411dec1d6dea6dd212425ec79e45c1.png"
}
