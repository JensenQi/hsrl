package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ParagonOfLight_47614 : Card() {
    override val id = 47614
    override val name = "圣光楷模"
    override val description = "如果该随从的攻击力大于或等于3，便具有<b>嘲讽</b>和<b>吸血</b>。"
    override var cost: Int? = 3
    override var health: Int? = 5
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.TheWitchwood
    override val background = "“你信圣光吗？！”"
    override val artist = "James Ryman"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/798275c9293b23c724d8f670d34af63489d4aa2e37883b553e09feff190398f6.png"
}
