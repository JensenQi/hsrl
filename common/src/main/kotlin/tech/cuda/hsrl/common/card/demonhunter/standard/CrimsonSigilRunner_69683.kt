package tech.cuda.hsrl.common.card.demonhunter.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class CrimsonSigilRunner_69683 : Card() {
    override val id = 69683
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
    override val cardSet = CardSet.Core
    override val background = "在某些网站上只能显示为“火**印奔行者”。"
    override val artist = "Arthur Bozonnet"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/5742a3655822dd198daeb6745b13243b9259396e1740f4156364bf2cc85796b8.png"
}
