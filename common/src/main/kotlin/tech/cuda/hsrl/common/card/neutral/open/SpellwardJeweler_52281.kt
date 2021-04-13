package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SpellwardJeweler_52281 : Card() {
    override val id = 52281
    override val name = "破咒珠宝师"
    override val description = "<b>战吼：</b>直到你的下个回合，你的英雄无法成为法术或英雄技能的目标。"
    override var cost: Int? = 3
    override var health: Int? = 4
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.RiseOfShadows
    override val background = "有些人总是很容易被闪闪的东西所吸引。"
    override val artist = "Adam Byrne"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/7084ade4f5bcfad66fb6a7e35ca7098bf9418c39143eacf4a3b626b9a0e2f7c8.png"
}
