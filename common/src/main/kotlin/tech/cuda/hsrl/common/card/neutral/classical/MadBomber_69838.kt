package tech.cuda.hsrl.common.card.neutral.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MadBomber_69838 : Card() {
    override val id = 69838
    override val name = "疯狂投弹者"
    override val description = "<b>战吼：</b>造成3点伤害，随机分配到所有其他角色身上。"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 3
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ClassicCards
    override val background = "其实他也不算是很疯狂，他只是应该在携带炸药的时候更加小心一点而已。"
    override val artist = "Mike Sass"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b63d495b697b67c6ffeeb171d3b26e45e300f1c38a2b7d8d5057e8b570154a2f.png"
}
