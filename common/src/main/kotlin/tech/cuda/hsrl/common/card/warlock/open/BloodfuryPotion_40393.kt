package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BloodfuryPotion_40393 : Card() {
    override val id = 40393
    override val name = "血怒药水"
    override val description = "使一个随从获得+3攻击力。如果该随从是恶魔，还会获得+3生命值。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.Msog
    override val background = "知道是什么让我的血液沸腾吗？是加基森飞涨的房价！"
    override val artist = "Raven Mimura"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b4199f2b05cd0aaecde6dc6ee133b00d799c851efebf2df9924152980d0c216e.png"
}
