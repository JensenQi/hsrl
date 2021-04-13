package tech.cuda.hsrl.common.card.neutral.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class WorgenInfiltrator_69812 : Card() {
    override val id = 69812
    override val name = "狼人渗透者"
    override val description = "<b>潜行</b>"
    override var cost: Int? = 1
    override var health: Int? = 1
    override var attack: Int? = 2
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ClassicCards
    override val background = "他们原本都是人类，他们更知道怎样悄无声息地进入某些人类的居所中。"
    override val artist = "Raymond Swanland"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/6b0f6b9f232f9cb6f2dfbe48055647ca30b166827433a922bf0d8d7d63cc8fa6.png"
}
