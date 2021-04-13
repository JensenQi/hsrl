package tech.cuda.hsrl.common.card.mage.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Flamestrike_68327 : Card() {
    override val id = 68327
    override val name = "烈焰风暴"
    override val description = "对所有敌方随从造成 4点伤害。"
    override var cost: Int? = 7
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.ClassicCards
    override val background = "当地板着火的时候，无论你在地上怎么打滚，都是没用的。"
    override val artist = "Romain De Santi"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/2c9e8cb25a9b75316f89c6c4be9a87ba9ab29bc0c40a57b087122ac797d36b49.png"
}
