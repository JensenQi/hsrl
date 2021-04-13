package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BlessingOfWisdom_1373 : Card() {
    override val id = 1373
    override val name = "智慧祝福"
    override val description = "选择一个随从，每当其进行攻击，便抽一张牌。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.Legacy3
    override val background = "显然是智慧让他认清了这样一条真理：作为一个随从，每回合都要攻击才能体现其价值。"
    override val artist = "Chippy"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/1a505b27344714493ad2e8d278e405b439c6066a6e02e75338de838294a89bf9.png"
}
