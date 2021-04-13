package tech.cuda.hsrl.common.card.paladin.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BlessingOfWisdom_69937 : Card() {
    override val id = 69937
    override val name = "智慧祝福"
    override val description = "选择一个随从，每当其进行攻击，便抽一张牌。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.ClassicCards
    override val background = "显然是智慧让他认清了这样一条真理：作为一个随从，每回合都要攻击才能体现其价值。"
    override val artist = "Chippy"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/87685e66026fc4b0df4aa0b9a7cc4aa6a5505b2011584aded4ff9d81d058d72e.png"
}
