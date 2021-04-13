package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class RavenousPterrordax_41191 : Card() {
    override val id = 41191
    override val name = "饥饿的翼手龙"
    override val description = "<b>战吼：</b> 消灭一个友方随从，并连续<b>进化</b>两次。"
    override var cost: Int? = 4
    override var health: Int? = 4
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.Ungoro
    override val background = "想让你的翼手龙变得更强壮吗？那就多喂一点低脂高纤维的随从。"
    override val artist = "Slawomir Maniak"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/d4f93220e389293bf92a3400543e2196d02dd0be76e5124b824bb3ff9077bce2.png"
}
