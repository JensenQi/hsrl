package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SpawnpoolForager_63509 : Card() {
    override val id = 63509
    override val name = "孵化池觅食者"
    override val description = "<b>亡语：</b>召唤一个1/1的鱼人宝宝。"
    override var cost: Int? = 1
    override var health: Int? = 2
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Murloc
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.ForgedInTheBarrens
    override val background = "做好这份工作，需要耐心，热情，还有最高级的鱼人觅食手套。"
    override val artist = "Cheng Hao"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/66c32217f88e0544ce4233a5d9c1de5c8beaae276b0788558eb75c0bed8fe1dc.png"
}
