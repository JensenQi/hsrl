package tech.cuda.hsrl.common.card.demonhunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class CrimsonSigilRunner_58170 : Card() {
    override val id = 58170
    override val name = "火色魔印奔行者"
    override val description = "<b>流放：</b>抽一张牌。"
    override var cost: Int? = 1
    override var health: Int? = 1
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Demonhunter
    override val cardSet = CardSet.AshesOfOutland
    override val background = "在某些网站上只能显示为“火**印奔行者”。"
    override val artist = "Arthur Bozonnet"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/ba4736165cba2be5d7baffca9d7d0bf76de71334c1b211fd958db1f842d7e179.png"
}
