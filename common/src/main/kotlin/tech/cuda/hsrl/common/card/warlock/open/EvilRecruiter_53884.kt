package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class EvilRecruiter_53884 : Card() {
    override val id = 53884
    override val name = "怪盗征募官"
    override val description = "<b>战吼：</b>消灭一个友方<b>跟班</b>，召唤一个5/5的恶魔。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.SaviorsOfUldum
    override val background = "小跟班已经不够坏了，不如再从它身上榨一点好处。"
    override val artist = "Zoltan Boros"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/a4e9dcca95f2a0c787152e4ea04b5eac8a4dd0f14a2109a4cecff8467c4c4004.png"
}
