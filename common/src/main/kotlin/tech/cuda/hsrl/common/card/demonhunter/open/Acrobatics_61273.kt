package tech.cuda.hsrl.common.card.demonhunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Acrobatics_61273 : Card() {
    override val id = 61273
    override val name = "空翻杂技"
    override val description = "抽两张牌。在本回合中，如果你使用了这两张牌，再抽 两张。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Demonhunter
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "给他的衣服里塞个大跳蚤，他可以翻越整片天空。"
    override val artist = "James Ryman"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/ebbd2c2fb068104f012716fbe39e321faec76c37a3e3b1bd0a65540d4f763a0d.png"
}
