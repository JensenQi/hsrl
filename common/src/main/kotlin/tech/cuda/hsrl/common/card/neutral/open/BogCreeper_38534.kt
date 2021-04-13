package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BogCreeper_38534 : Card() {
    override val id = 38534
    override val name = "毒沼爬行者"
    override val description = "<b>嘲讽</b>"
    override var cost: Int? = 7
    override var health: Int? = 8
    override var attack: Int? = 6
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Wotog
    override val background = "他试过很多种出行方式，包括站起来走，横过来挪，卷起来滚，但是都没有窝在那爬来得轻松惬意。"
    override val artist = "Matt Dixon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/3cf3b64d5b2f1cf7f5c8da4d60320596f62fcdfe278a82e3544a08275023d447.png"
}
