package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class NatalieSeline_60071 : Card() {
    override val id = 60071
    override val name = "娜塔莉·塞林"
    override val description = "<b>战吼：</b>消灭一个随从并获得其生命值。"
    override var cost: Int? = 8
    override var health: Int? = 1
    override var attack: Int? = 8
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.Legacy1635
    override val background = "是她发现了萨拉塔斯，黑暗帝国之刃，暗影魔法的恐怖神器。可以生吞灵魂，<i>也能</i>将灵魂细细切丝。"
    override val artist = "James Ryman"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/5f87fcfa2b28803cf15f8a41ece97fc5d323bdbab77b411cd3cfbb0559af42fa.png"
}
