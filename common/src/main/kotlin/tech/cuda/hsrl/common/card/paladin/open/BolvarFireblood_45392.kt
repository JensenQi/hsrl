package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BolvarFireblood_45392 : Card() {
    override val id = 45392
    override val name = "浴火者伯瓦尔"
    override val description = "<b>圣盾</b> 在一个友方随从失去<b>圣盾</b>后，获得+2攻击力。"
    override var cost: Int? = 5
    override var health: Int? = 7
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.Kotf
    override val background = "作为联盟的楷模，身材也很火爆。"
    override val artist = "Tooth"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/81fdfb320c4152ffba0fe158e92326b96780299a029dcb4aaf4be2914741d402.png"
}
