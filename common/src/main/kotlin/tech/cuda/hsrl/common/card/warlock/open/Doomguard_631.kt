package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Doomguard_631 : Card() {
    override val id = 631
    override val name = "末日守卫"
    override val description = "<b>冲锋</b>，<b>战吼：</b>随机弃两张牌。"
    override var cost: Int? = 5
    override var health: Int? = 7
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Demon
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.Legacy4
    override val background = "召唤末日守卫有很大的风险。总得有人付出生命的代价。"
    override val artist = "Lucas Graciano"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/15a3ac052f2105333584c9c6c8043f82760b66108abce10ccbfab086e8082731.png"
}
