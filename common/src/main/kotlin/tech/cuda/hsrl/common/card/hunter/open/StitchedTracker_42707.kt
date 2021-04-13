package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class StitchedTracker_42707 : Card() {
    override val id = 42707
    override val name = "缝合追踪者"
    override val description = "<b>战吼：</b> 从你的牌库中<b>发现</b>一张随从牌的复制。"
    override var cost: Int? = 3
    override var health: Int? = 2
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.Kotf
    override val background = "他只是在试试右边胳膊有没有缝好。"
    override val artist = "Steve Prescott"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/f90fdbd893aa27e51d1767014370b7024c2f75705f0c950176d7bb0b4a7f9bac.png"
}
