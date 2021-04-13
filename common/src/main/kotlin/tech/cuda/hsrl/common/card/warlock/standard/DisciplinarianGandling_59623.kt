package tech.cuda.hsrl.common.card.warlock.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DisciplinarianGandling_59623 : Card() {
    override val id = 59623
    override val name = "教导主任加丁"
    override val description = "在你使用一张随从牌后，将其消灭并召唤一个4/4的挂掉的 学生。"
    override var cost: Int? = 4
    override var health: Int? = 6
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.ScholomanceAcademy
    override val background = "“他从不按什么正态曲线打分，直接在零分那里画条竖线，把所有人都挂在上面。”"
    override val artist = "Zoltan Boros"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/e2be658f56322335ccbbef39556334bf6c42bdddc655f67b67d9177d9dc11907.png"
}
