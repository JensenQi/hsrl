package tech.cuda.hsrl.common.card.demonhunter.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ChaosStrike_69558 : Card() {
    override val id = 69558
    override val name = "混乱打击"
    override val description = "在本回合中，使你的英雄获得+2攻击力。抽一张牌。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Demonhunter
    override val cardSet = CardSet.Core
    override val background = "“我们要什么？” “混乱！” “什么时候要？” “最意外的时候！”"
    override val artist = "Zoltan Boros"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/53550a30fd8fd9f193ecd941a97018f47614553b0e6e4f4ecb93e59f307b0d91.png"
}
