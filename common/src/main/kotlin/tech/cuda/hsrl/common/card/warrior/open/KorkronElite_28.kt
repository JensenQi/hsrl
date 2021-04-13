package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class KorkronElite_28 : Card() {
    override val id = 28
    override val name = "库卡隆精英卫士"
    override val description = "<b>冲锋</b>"
    override var cost: Int? = 4
    override var health: Int? = 3
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.Legacy1635
    override val background = "库卡隆就是加尔鲁什·地狱咆哮的精英部队。这么说吧，你最好不要穿着蓝色的战袍出现在这些壮汉面前。"
    override val artist = "Alex Horley Orlandelli"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/d55715993936db4b6ea4e1b3af174efa5ad374aefd9698a15de4eaf43dbe73be.png"
}
