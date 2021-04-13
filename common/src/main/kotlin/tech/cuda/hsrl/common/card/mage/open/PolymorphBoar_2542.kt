package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class PolymorphBoar_2542 : Card() {
    override val id = 2542
    override val name = "变形术：野猪"
    override val description = "使一个随从变形成为一个4/2并具有<b>冲锋</b>的野猪。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.Tgt
    override val background = "霍弗终于能稳定出场了。"
    override val artist = "Mike Sass"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/fbd65c4ffbb5c3e3ffadb65210b76aad442036a9f4437de54d26e388db4fbb47.png"
}
