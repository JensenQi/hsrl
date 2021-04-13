package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class TaurenWarrior_45 : Card() {
    override val id = 45
    override val name = "牛头人战士"
    override val description = "<b>嘲讽</b> 受伤时具有+3攻 击力。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy3
    override val background = "牛头人战士：莫高雷勇士，野猪人杀手，雷霆崖电梯发明者。"
    override val artist = "Paul Warzecha"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/8c16c83dbb4d394030f228b05df08b984afe74064555ba1f320387ce07d45923.png"
}
