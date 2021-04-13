package tech.cuda.hsrl.common.card.warrior.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class KorkronElite_68528 : Card() {
    override val id = 68528
    override val name = "库卡隆精英卫士"
    override val description = "<b>冲锋</b>"
    override var cost: Int? = 4
    override var health: Int? = 3
    override var attack: Int? = 4
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.ClassicCards
    override val background = "库卡隆就是加尔鲁什·地狱咆哮的精英部队。这么说吧，你最好不要穿着蓝色的战袍出现在这些壮汉面前。"
    override val artist = "Alex Horley Orlandelli"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/3da4f4647df7e8717a241de3d7651b208660e7c3787a964fe370a71f4c9e579b.png"
}
