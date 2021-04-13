package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FlameGeyser_41151 : Card() {
    override val id = 41151
    override val name = "烈焰喷涌"
    override val description = "造成 2点伤害。 将一张1/2的元素牌置入你的手牌。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.Ungoro
    override val background = "火可以带来光明，也可以毁掉一切。"
    override val artist = "Chris Seaman"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/e299e796ca91f6bacb809811dab921c619b0210ce403811aea174522bfe5aa7b.png"
}
