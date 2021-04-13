package tech.cuda.hsrl.common.card.warlock.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Doomguard_69917 : Card() {
    override val id = 69917
    override val name = "末日守卫"
    override val description = "<b>冲锋</b>，<b>战吼：</b>随机弃两张牌。"
    override var cost: Int? = 5
    override var health: Int? = 7
    override var attack: Int? = 5
    
    override val isClassic = true
    override val isStandard = false

    override val minionType = MinionType.Demon
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.ClassicCards
    override val background = "召唤末日守卫有很大的风险。总得有人付出生命的代价。"
    override val artist = "Lucas Graciano"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/bc508852133bf82d1654495ab2eaea2f4861f9ff8c7e514601046f1f0a2d735d.png"
}
