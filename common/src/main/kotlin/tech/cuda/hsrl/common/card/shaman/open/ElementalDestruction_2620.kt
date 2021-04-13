package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ElementalDestruction_2620 : Card() {
    override val id = 2620
    override val name = "元素毁灭"
    override val description = "对所有随从造成 4到 5点伤害。<b>过载：</b>（5）"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.Tgt
    override val background = "我虽然不是什么萨满，但他们不是一直倡导要与元素和谐共存的吗？"
    override val artist = "Tyler Walpole"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/85b0f2d142ff1da936406ddc2f3f9e2b7f83b98d770bfc5fad8d8228c9c301ec.png"
}
