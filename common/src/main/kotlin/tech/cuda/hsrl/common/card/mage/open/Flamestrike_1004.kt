package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Flamestrike_1004 : Card() {
    override val id = 1004
    override val name = "烈焰风暴"
    override val description = "对所有敌方随从造成 5点伤害。"
    override var cost: Int? = 7
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.Legacy1635
    override val background = "当地板着火的时候，无论你在地上怎么打滚，都是没用的。"
    override val artist = "Romain De Santi"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/74e9b7fe467561a0c0b8a849383be8442858f47aab61a9d38e899db8a4071dd2.png"
}
