package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Snowchugger_1928 : Card() {
    override val id = 1928
    override val name = "碎雪机器人"
    override val description = "<b>冻结</b>任何受到该随从伤害的角色。"
    override var cost: Int? = 2
    override var health: Int? = 3
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Mech
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.Gvg
    override val background = "在夏天，它依然有一份很体面的工作：制作刨冰。"
    override val artist = "Gabor Szikszai"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/cc0434bae8ebe37b7b1d90ae7739e338ee5e51f4585dc270f355cb58eafc361f.png"
}
