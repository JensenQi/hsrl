package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class PsychOTron_38526 : Card() {
    override val id = 38526
    override val name = "闹闹机器人"
    override val description = "<b>嘲讽</b> <b>圣盾</b>"
    override var cost: Int? = 5
    override var health: Int? = 4
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Mech
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Wotog
    override val background = "音响设备全面升级，让我们燥起来！"
    override val artist = "Matt Dixon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/678b94bb34a8e56191ab254d1067b473361daebcb48844e6f2eaa704a8adef4d.png"
}
